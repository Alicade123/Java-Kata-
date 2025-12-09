import java.util.Arrays;

public class _6kyu_TwoSum {
    public static void main(){
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));// == {0, 2}
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));// == {1, 2}
    }
    public static int[] twoSum(int[] numbers, int target) {
        int [] validIndeces = new int[2];
        int firstIndex = 0;
        for(int number : numbers){
            int search = target-number;
            for(int i=0;i<numbers.length; i++){
                if(numbers[i]==search) {
                    validIndeces[1]= firstIndex;
                    validIndeces[0] = i;
                }

            }
            firstIndex++;
        }
        return validIndeces;
    }
}
