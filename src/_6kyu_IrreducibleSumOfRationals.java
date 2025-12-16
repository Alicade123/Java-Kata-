
import java.util.Arrays;
public class _6kyu_IrreducibleSumOfRationals {
    public  static void main(String[] args){
      System.out.println(sumFracts(new int[][] { {1,2}, {2,9}, {3,18}, {4,24}, {6,48} }));
        System.out.println(sumFracts(new int[][] { {1, 2}, {1, 3}, {1, 4} }));
        System.out.println(sumFracts(new int[][] { {1, 3}, {5, 3}}));
      System.out.println(sumFracts(new int[][] {}));
    }
    public static String sumFracts(int[][] l) {
        if (l == null || l.length == 0) return null;

        long lcd = l[0][1];
        for (int i = 1; i < l.length; i++) {
            lcd = lcm(lcd, l[i][1]);
        }


        long numeratorSum = 0;
        for (int i = 0; i < l.length; i++) {
            numeratorSum += (lcd / l[i][1]) * l[i][0];
        }


        long gcd = gcd(numeratorSum, lcd);
        numeratorSum /= gcd;
        lcd /= gcd;

        return numeratorSum%lcd==0 ? String.valueOf(numeratorSum/lcd) : "[" +numeratorSum +","+ lcd+"]";
    }
    private static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
