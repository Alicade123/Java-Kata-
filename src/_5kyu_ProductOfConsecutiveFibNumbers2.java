import java.util.Arrays;

public class _5kyu_ProductOfConsecutiveFibNumbers2 {
    public static void main(String[] args){
        System.out.println(Arrays.toString(productFib(4895)));//[55, 89, 1]
        System.out.println(Arrays.toString(productFib(714)));//[21, 34, 1]
        System.out.println(Arrays.toString(productFib(5895)));//[89, 144, 0]
        System.out.println(Arrays.toString(productFib(800)));//[34,55, 0]
    }
    public static long[] productFib(long prod) {
        long a = 0;
        long b = 1;
        while (a * b < prod) {
            long next = a + b;
            a = b;
            b = next;
        }
        return new long[] { a, b, a * b == prod ? 1 : 0 };
    }
}


