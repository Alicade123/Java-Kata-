import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _5kyu_ProductOfConsecutiveFibNumbers {
    public static void main(String[] args){
        System.out.println(Arrays.toString(productFib(4895)));//[55, 89, 1]
        System.out.println(Arrays.toString(productFib(714)));//[21, 34, 1]
        System.out.println(Arrays.toString(productFib(5895)));//[89, 144, 0]
        System.out.println(Arrays.toString(productFib(800)));//[34,55, 0]
    }
    public static long[] productFib(long prod) {
        List<Integer> fib = new ArrayList<>();
        int  first = 0;
        int second = 1;
        int next;
        fib.add(first);
        fib.add(second);
        int product = 0;
        while(product<=prod){
            next = first+second;
            first = second;
            second = next;
            fib.add(next);
            product = fib.get(fib.size()-2)*fib.getLast();
        }
        return ((long) fib.get(fib.size() - 2) *fib.get(fib.size()-3))==prod ? new long[]{fib.get(fib.size()-3), fib.get(fib.size() - 2),1}:new long[]{fib.get(fib.size()-2), fib.getLast(),0};
    }

}
