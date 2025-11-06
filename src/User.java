public class User {
    String name;
    String email;
    String membership;
    int age;
    boolean isUserStudent;
int balance = 2000;
    public int deposit(int amountDeposit){
        balance += amountDeposit;
        return balance;
    }
    public int[] deposit(int amountDeposit,int memberShipSince){
        balance += amountDeposit;
        return new int[] {balance, memberShipSince};
    }
}
