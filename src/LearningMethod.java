public class LearningMethod {
    public static void main(String[] args) {
        int num = 4;
        double num2 = 3;
        int age = 12;
        String fName = "Alicade";
        String lName = "ABITURIJE DUSABE";
        System.out.println(square(num));
        System.out.println(cubic(num2));
        if(eligibleToSignup(age)) System.out.printf("You've %d So, You're eligible to Signup\n", age);
        else System.out.printf("You've %d So, You're not eligible to Signup\n", age);
        System.out.printf("Developed by %s\n", madeBy(fName, lName));

    }
   static int square(int number){
      return number = number*number;
    }
    static double cubic (double number){
        return number*number*number;
    }
    static boolean eligibleToSignup(int age){
        if(age>=18){
            return true;
        }else return false;
    }
    static String madeBy(String firstName, String lastName){
        return  firstName +" "+ lastName;
    }
}
