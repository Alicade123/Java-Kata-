import java.math.BigInteger;

public class _4kyu_LargeFactorials {
    public static void main(String[] args) {
        System.out.println(Factorial(1)); // "1"
        System.out.println(Factorial(5)); // "120"
        System.out.println(Factorial(9)); // "362880"
        System.out.println(Factorial(15));// "1307674368000"

    }
    public static String Factorial(int n) {
        BigInteger factorial = new BigInteger("1");
        for (int i = n; i >=1; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial+"";
    }
}
