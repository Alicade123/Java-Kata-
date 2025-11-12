import java.util.HashMap;
import java.util.Map;

public class _6kyu_NumericalsOfString {
    public static void main(String[] args){
        System.out.println(numericals("Hello, World!")); //"1112111121311"
        System.out.println(numericals("Hello, World! It's me, JomoPipi!")); //"11121111213112111131224132411122"
        System.out.println(numericals("hello hello")); //"11121122342"
        System.out.println(numericals("aaaaaaaaaaaa")); //"123456789101112"
    }
    public static String numericals(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder results = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
                results.append(map.get(s.charAt(i)));
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                results.append(map.get(s.charAt(i)));
            }
        }
        return results.toString();
    }
}
