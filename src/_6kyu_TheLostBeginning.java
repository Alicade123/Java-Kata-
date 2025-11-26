import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class _6kyu_TheLostBeginning {

    public static void main (String[] args){

        System.out.println(beginning("123456789101112131415"));//1112131415\")");//1
        System.out.println(beginning("17181920"));//17
        System.out.println(beginning("72637236"));//72637236
        System.out.println(beginning("1112"));//11
        System.out.println(beginning("91011"));//9
        System.out.println(beginning("99100"));//99
    }
    public static long beginning(String s) {

        for(int i=0 ; i< s.length(); i++){
            long first;
            try {
                first= Long.parseLong(s.substring(0,i));
            }catch (NumberFormatException e){
                continue;
            }
            StringBuilder newString =  new StringBuilder();
            long current = first;
            while(newString.length()<s.length()){
                newString.append(current);
                current++;
            }
            if(newString.toString().equals(s)) return first;
        }
        return Long.parseLong(s);
    }
}
