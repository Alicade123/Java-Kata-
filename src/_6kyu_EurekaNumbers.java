import java.util.ArrayList;
import java.util.List;

public class _6kyu_EurekaNumbers {
    public static void main (String[] args) {

        System.out.println(sumDigPow(1, 10));//new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9}
        System.out.println(sumDigPow(1, 100));// new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 89});
        System.out.println(sumDigPow(10, 100));//,  new long[] {89});
        System.out.println(sumDigPow(90, 100));//, new long[] {});
        System.out.println(sumDigPow(90, 150));//, new long[] {135});
        System.out.println(sumDigPow(50, 150));//, new long[] {89, 135});
        System.out.println(sumDigPow(10, 150));//, new long[] {89, 135});
    }

    public static List<Long> sumDigPow(long a, long b) {
        // your code
        List<Long> results = new ArrayList<>();
       for(long i = a; i<= b ; i++){
       String numberX = String.valueOf(i);
       long sum =0;
       for(int j = 0; j<numberX.length(); j++){
       long z = Long.parseLong(numberX.charAt(j)+"");
       sum += (int)Math.pow(z,j+1);
       }
       if(sum==i){
           results.add(sum);
       }
       }
        return results;
    }
}
