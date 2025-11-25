
import java.util.ArrayList;
import java.util.List;

public class _6kyu_FindUniqueSubstring {
    public static void main(String[] args){
        System.out.println(longestSubstring("preface","singularity"));//8
        System.out.println(longestSubstring(" 8684Hh", "7575H--8---"));//5
        System.out.println(longestSubstring("looking", "zoology"));//3
        System.out.println(longestSubstring("piquancy","refocusing"));//5
        System.out.println(longestSubstring("rhythms", "logician"));//15
    }
    static int longestSubstring(String a, String b){
        StringBuilder result = new StringBuilder();
        List<String> results = new ArrayList<>();
       for(char x : a.toCharArray()){
           if(!b.contains(x+""))  result.append(x) ;
           else {
               results.add(result+"");
               result.delete(0,result.length());
           }

       }
        for(char y : b.toCharArray()){
            if(!a.contains(y+"")) result.append(y);
            else {
                results.add(result+"");
                result.delete(0,result.length());
            }
        }
        if(result.length() > 0) results.add(result.toString());
        int length = 0;
        for(int i = 0; i<results.size(); i++){
            if(length<results.get(i).length()) length = results.get(i).length();
        }


        StringBuilder resultb = new StringBuilder();
        List<String> resultsb = new ArrayList<>();
        for(char x : b.toCharArray()){
            if(!a.contains(x+""))  resultb.append(x) ;
            else {
                resultsb.add(resultb+"");
                resultb.delete(0,resultb.length());
            }

        }
        for(char y : a.toCharArray()){
            if(!b.contains(y+"")) resultb.append(y);
            else {
                resultsb.add(resultb+"");
                resultb.delete(0,resultb.length());
            }
        }

        if(resultb.length() > 0) resultsb.add(resultb.toString());
        int lengthb = 0;
        for(int i = 0; i<resultsb.size(); i++){
            if(length<resultsb.get(i).length()) lengthb = resultsb.get(i).length();
        }


        return Math.max(length,lengthb);
    }
}
