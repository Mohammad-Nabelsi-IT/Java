package ChallengeIf.Twelve;

public class Last {
    public static void main(String[] args) {
        int n = 10000;
        if (n < 10) {
            System.out.println("✤");
        } else if ((n >= 10) && (n < 100)) {
            System.out.println("✤✤");
        } else if ((n >= 100) && (n < 1000)) {
            System.out.println("✤✤✤");
        } else {
            System.out.println("Please Enter Number 0 to 1000");
        }
    }
}
