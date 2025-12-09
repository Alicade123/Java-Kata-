public class _6kyu_CreatePhoneNumber {
    public static void main(String[] arg){
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));//"(123) 456-7890"

    }
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder("(");
        for(int i=0; i<numbers.length;i++ ){
            phoneNumber.append(numbers[i]);
            if(i ==2) phoneNumber.append(") ");
            else if(i==5)  phoneNumber.append("-");
        }
        return phoneNumber.toString();
    }
}
