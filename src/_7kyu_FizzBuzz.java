import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _7kyu_FizzBuzz {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(141)));
    }
    public static int[] solution(int number) {
        // your code here
        int threes=0;
        int fives=0;
        int boths=0;
        for(int i = number-1; i > 0; i--) {
if(  i%5==0 && i%3==0) {
    boths++;
}
else if(i%5==0) {
    fives++;
}
else if(i%3==0) {
    threes++;
}}

        return new int[]{threes, fives, boths};

    }
}
