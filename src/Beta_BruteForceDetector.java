import java.util.*;

public class Beta_BruteForceDetector {
    public static void main(String[] args){
        System.out.println(detectBruteForce(new String[]{"192.168.1.1 LOGIN_FAIL user=admin", "192.168.1.1 LOGIN_FAIL user=admin", "192.168.1.1 LOGIN_FAIL user=admin"}));
        System.out.println(detectBruteForce(new String[] {"10.0.0.5 LOGIN_FAIL user=x", "10.0.0.5 LOGIN_FAIL user=x", "10.0.0.5 LOGIN_SUCCESS user=x", "10.0.0.5 LOGIN_FAIL user=x"}));
        System.out.println(detectBruteForce(new String[]{"1.1.1.1 LOGIN_FAIL user=x", "1.1.1.1 LOGIN_FAIL user=x", "1.1.1.1 LOGIN_SUCCESS user=x", "1.1.1.1 LOGIN_FAIL user=x", "1.1.1.1 LOGIN_FAIL user=x"}));
        System.out.println(detectBruteForce(new String[]{"10.0.0.1 LOGIN_FAIL user=x", "10.0.0.1 LOGIN_FAIL user=x", "10.0.0.1 LOGIN_FAIL user=x", "192.168.0.1 LOGIN_FAIL user=y", "192.168.0.1 LOGIN_FAIL user=y", "192.168.0.1 LOGIN_FAIL user=y"}));
    }
    public static List<String> detectBruteForce(String[] logs) {
        // track consecutive failures per IP
        // 3+ in a row without success = suspicious
        List <String> result = new ArrayList<>();
        List <String> resultSorted = new ArrayList<>();
        Map<String,Integer> myCounting = new LinkedHashMap<>();
        if(logs== null || logs.length==0) return result;
        String IpAddressToCheck ;
        for(int i=0; i<logs.length; i++){
        String completeName = "counter_"+logs[i].split(" ")[0].replace(".","_");
        String[] currentIP = logs[i].split(" ");
        IpAddressToCheck = logs[i].split(" ")[0];
        if(IpAddressToCheck.equals(currentIP[0]) && currentIP[1].equals("LOGIN_FAIL")) {
            if(!myCounting.containsKey(completeName)){
                myCounting.put(completeName, 1);
            }else{
                myCounting.put(completeName, myCounting.get(completeName)+1);
            }
        }
        else if(IpAddressToCheck.equals(currentIP[0]) && currentIP[1].equals("LOGIN_SUCCESS")){
                            myCounting.put(completeName,0);
       }else{
            IpAddressToCheck = currentIP[0];
        }
            for(Map.Entry <String, Integer> mapEntity : myCounting.entrySet()){
                if(mapEntity.getValue()>=3) {
                    String found = mapEntity.getKey().substring(8).replace("_",".");
                    if(!result.contains(found)) result.add(found);
                }
            }
        }

        for(String log:logs){
            if(result.contains(log.split(" ")[0])) {
                if(!resultSorted.contains(log.split(" ")[0])){
                    resultSorted.add(log.split(" ")[0]);
                }
            }
        }

        return resultSorted;

    }
}
