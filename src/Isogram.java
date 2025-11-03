import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static void main(String[] args) {

        System.out.println(isIsogram("Dermatoglyphics")); // true
        System.out.println(isIsogram("isogram")); //true
        System.out.println(isIsogram("moose")); //false
        System.out.println(isIsogram("isIsogram"));//false
        System.out.println(isIsogram("aba"));//false
        System.out.println(isIsogram("moOse"));//false
        System.out.println(isIsogram("thumbscrewjapingly"));//true
        System.out.println(isIsogram(""));//true
    }
    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        Set<Character> seen = new HashSet<Character>();
        for(char c : str.toCharArray()){
            if(seen.contains(c)) return false;
            seen.add(c);
        }
        return true;
           }
}