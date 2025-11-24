import java.awt.image.Kernel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class _5kyu_FirstOnRepeatingCharacter {
    public static void main(String[] args){
        System.out.println(firstNonRepeatingLetter("a"));// "For input \"a\""); //"a"
        System.out.println(firstNonRepeatingLetter("streSS"));// "For input \"streSS\""); //"t"
        System.out.println(firstNonRepeatingLetter("moon-men"));// "For input \"moon-men\""); //"-"
        System.out.println(firstNonRepeatingLetter("moonmoon"));// "For input \"moonmoon\""); //""
        System.out.println(firstNonRepeatingLetter("I Like To Take Candy From A Baby"));//"L"

    }
    public static String firstNonRepeatingLetter(String s){
        // Add your code here
        String txt=s.toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<txt.length(); i++){
            if(!map.containsKey(txt.charAt(i))){
                map.put(txt.charAt(i),1);
            }else{
                map.put(txt.charAt(i), map.get(txt.charAt(i))+1);
            }
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                int index = txt.indexOf(entry.getKey());
                return s.charAt(index)+"";
            }
        }
        return "";
    }
}
