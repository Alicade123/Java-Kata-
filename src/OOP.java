import java.util.Arrays;

public class OOP {
    public static void main(String[] args) {
        System.out.println("My name is Alicade!, Thank you");
        User user1 = new User();
        User user2 = new User();
        user1.name="Alice"; user2.name="Rukundo";
        user1.age=25;
        user1.email="alice@gmail.com";
        user1.membership = "Gold";
        user1.isUserStudent = true;
        System.out.println(user1.name);
        System.out.println(user2.name);

        System.out.println("Your balance is " + user1.balance);
        System.out.println(user1.deposit(100));
        System.out.println(Arrays.toString(user1.deposit(100, 2009)));
    }


}
