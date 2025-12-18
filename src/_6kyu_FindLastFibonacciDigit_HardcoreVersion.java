import java.util.Arrays;

public class _6kyu_FindLastFibonacciDigit_HardcoreVersion {
    public static void main(String[] args){
        System.out.println(testLast(1));
        System.out.println(testLast(2));
        System.out.println(testLast(3));
        System.out.println(testLast(4));
        System.out.println(testLast(5));
        System.out.println(testLast(10));
        System.out.println(testLast(100));
        System.out.println(testLast(1000));
        System.out.println(testLast(1000000));
    }
    public  static int  testLast(int number){
        if(number>2){
            int first = 1;
            int second = 1;
            number = number%60;
            if (number == 0) number = 60;
                for (int i=3; i<=number;i++){
                    int next = (first+second)%10;
                    first =second;
                    second =next;
                }
            return  second;
        }
        else return 1;
    }
}
