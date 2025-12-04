import java.util.Arrays;

public class _6kyu_SumOfDigits_DigitalRoot {
    public  static void main(String[] args){
        System.out.println(digital_root(16));//  -->  1 + 6 = 7
        System.out.println(digital_root(942));//  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
        System.out.println(digital_root(132189));//  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
        System.out.println(digital_root(493193));//  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
    }
    public static int digital_root(int n) {
        // ...
        String number = String.valueOf(n);
        int sum = 0;
        while(number.length()>1){
        String [] numberArray = number.split("");
        sum =0;
        for(int i=0; i<numberArray.length; i++){
            sum += Integer.parseInt(numberArray[i]);
            }
        number = String.valueOf(sum);
        }
        return sum;
    }
}
