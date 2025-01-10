package BankOne;

public class Main {
    public static void main(String[] args) {
   BankAccount b =new BankAccount("123456",4000);
   b.withdraw(2000);
        System.out.println(b.getBalance());
        b.deposit(500);
        System.out.println(b.getBalance());
    }
}
