import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _6kuy_OddDigPrime {
    public static void main(String[] args){
        System.out.println(Arrays.toString(onlyOddDigPrimes(20)));//new long[]{7, 19, 31}
        System.out.println(Arrays.toString(onlyOddDigPrimes(40)));//new long[]{9, 37, 53}
        System.out.println(Arrays.toString(onlyOddDigPrimes(55)));//new long[]{10, 53, 59}
        System.out.println(Arrays.toString(onlyOddDigPrimes(60)));//new long[]{11, 59, 71}
        System.out.println(Arrays.toString(onlyOddDigPrimes(100)));//new long[]{15, 97, 113}
    }
        public static long[] onlyOddDigPrimes(long n) {
        List<Long> results =new ArrayList<>();
        for(long i=3;i<n;i++){
        if(isValid(Integer.parseInt(i+""))) results.add(i);
        }
        long[] output = new long[results.size()];
        for(int j=0;j<results.size();j++){
            output[j] =results.get(j);
        }
        long next = findnext(Integer.parseInt(n+""));
    return new long[] {output.length, output[output.length-1],next};
    }
        public static boolean isValid(int i){
        if(isPrime(i)&&i%2!=0){
            String numberString= String.valueOf(i);
            boolean initial = true;
            for(int x=0;x<numberString.length();x++){
                if(Integer.parseInt(numberString.charAt(x)+"")%2==0) {
                    initial =false;
                    break;
                }
                }
            return initial;
            }
       return false;
        }
        public static boolean isPrime(int i){
        for(int y=3; y<i;y++){
            if(i%y==0) return false;
        }
        return true;
        }
        public static long findnext(int x){
            boolean initial = false;
            long next=0l;
        while (!initial){
            x++;
            if(isPrime(x)&&x%2!=0){
                String numberString= String.valueOf(x);
                for(int q=0;q<numberString.length();q++){
                    if(Integer.parseInt(numberString.charAt(q)+"")%2==0) {
                        initial =false;
                        break;
                    } else if (q==numberString.length()-1&&Integer.parseInt(numberString.charAt(q)+"")%2!=0) {
                        initial = true;
                         next= Long.parseLong(x+"");
                    };
                }
            }
        }
            return next;
        }
}
