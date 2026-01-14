import java.util.Arrays;
import java.util.regex.Pattern;

public class _6kyu_Abbreviator {
    static void main() {
        System.out.println(abbreviate("internationalization"));//i18n
        System.out.println(abbreviate("are"));//are
        System.out.println(abbreviate("rides"));//r3s
        System.out.println(abbreviate("elephant-rides are really fun!"));//e6t-r3s are r4y fun!
    }
    public static String abbreviate(String string) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
     for (char c:string.toCharArray()){
         if(Character.isLetter(c)) word.append(c);
         else{
             transform(result, word);
             result.append(c);
             word.setLength(0);
         }
     }
        transform(result, word);
     return result.toString();
    }
    public static void transform(StringBuilder res, StringBuilder word){
        if(word.length()>=4){
            res.append(word.charAt(0));
            int counter = 0;
            for(int i=1;i<word.length()-1;i++){
                counter++;
            }
            res.append(counter).append(word.charAt(word.length()-1));
        }
        else res.append(word);
    }
}
