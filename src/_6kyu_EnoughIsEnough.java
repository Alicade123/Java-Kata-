import java.util.*;

public class _6kyu_EnoughIsEnough {
    public static void main(){
        System.out.println(Arrays.toString(deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )));

    }
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> result  = new ArrayList<>();
        Map<Integer,Integer> counter = new LinkedHashMap<>();
        for(int x : elements){
            if(!counter.containsKey(x)) counter.put(x,1);
            else counter.put(x,counter.get(x)+1);
            if(counter.get(x)<=maxOccurrences) result.add(x);
        }
        int[] res = new int[result.size()];
        for(int i=0;i<result.size(); i++){
            res[i]=result.get(i);
        }
        return res;
    }
}