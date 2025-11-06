import java.math.BigInteger;

import static java.lang.Long.parseLong;

public class _4kyuKata12 {
    public static void main(String[] args) {

        System.out.println(add("1"   , "1"  ));// 2
        System.out.println(add("123" , "456"));// 579
        System.out.println(add("888" , "222"));// 1110
        System.out.println(add("1372", "69" ));// 1441
        System.out.println(add("12"  , "456"));// 468
        System.out.println(add( "100" , "101"));// 201
        System.out.println(add("63829983432984289347293874", "90938498237058927340892374089"));// 91002328220491911630239667963
    }
    public static String add(String a, String b) {
        Long x = Long.parseLong(a);
        Long y = Long.parseLong(b);
        return x+y+"";
    }
}