import java.lang.classfile.instruction.CharacterRange;

public class _6kyu_ValidPhoneNumber {
    public static void main(String[] args){
        System.out.println(validPhoneNumber("(123) 456-7890"));//true
    }

    public static boolean validPhoneNumber(String phoneNumber) {
        // TODO: Return whether phoneNumber is in the proper form
//        if(phoneNumber.length()==14
//                &&(phoneNumber.charAt(0)+"").equals("(")
//                &&(phoneNumber.charAt(4)+"").equals(")")
//                &&(phoneNumber.charAt(5)+"").equals(" ")
//                &&(phoneNumber.charAt(9)+"").equals("-")
//        ) return true;
//        else return false;
        return phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}");
    }
}
