import java.sql.Timestamp;

public class _5kyu_StringN_iterationsString {
    public  static void main(String[] args){
        System.out.println(jumbledString("qwertyuio", 2000));
    }
    public static String jumbledString(String s, long n) {
        String originalString = s;
        String currentString = s;
        int times=0;
        do{
            currentString = helper(currentString);
            times++;
        }while(!currentString.equals(originalString));

        long effectiveTimes = n%times;
        long i=0L;
        if(effectiveTimes == 0) return  s;
        currentString = s;
        while(i<effectiveTimes){
            currentString = helper(currentString);
            i++;
        }
        return currentString;
    }

    public static String helper(String txt){
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();
        for(int i=0; i<txt.length(); i++){
            if(i%2==0) evenChars.append(txt.charAt(i));
            else oddChars.append(txt.charAt(i));

        }
        return evenChars.append(oddChars).toString();
    }
}