import java.util.HashMap;
import java.util.Map;

public class _6kyu_CountCharactersInString {
    public static void main(String[] args) {
          System.out.println(count("Alicade"));
          System.out.println(count(""));
          System.out.println(count("hghghghghghghghghg"));
    }
    public static Map<Character, Integer> count(String str) {
        str = str.toLowerCase();
        Map<Character, Integer>  results = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(!results.containsKey(str.charAt(i))){
                results.put(str.charAt(i), 1);
            }
            else {
                results.put(str.charAt(i), results.get(str.charAt(i))+1);
            }
        }

        return results;
    }
}
