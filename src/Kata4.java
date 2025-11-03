import java.util.Arrays;
public class Kata4 {
    public static void main(){
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14})));
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
    }
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[0];

        int count = 0;
        int sum = 0;

        for (int num : input) {
            if (num > 0) {
                count++;
            } else if (num < 0) {
                sum += num;
            }
        }

        return new int[]{count, sum};

    }
}