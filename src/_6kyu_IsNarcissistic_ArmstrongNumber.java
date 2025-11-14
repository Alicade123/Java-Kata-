public class _6kyu_IsNarcissistic_ArmstrongNumber {
    public static void main(String[] arg){
        System.out.println(isNarcissistic(153));// "153 is narcissistic");//true
        System.out.println(isNarcissistic(1634));// "1634 is narcissistic");//true
        System.out.println(isNarcissistic(112));// "112 is not narcissistic");//false
    }
    public static boolean isNarcissistic(int number) {
        // TODO replace with your code
        String myNumber = String.valueOf(number);
        int myNumberSize = myNumber.length();
        int sum = 0;

        for(int i = 0; i< myNumberSize; i++){
        int x = Integer.parseInt(myNumber.charAt(i)+"");
        int y = (int)(Math.pow(x,myNumberSize));
        sum +=y;
        }


        return sum==number;
    }
}
