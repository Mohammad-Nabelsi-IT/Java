package ChallengeIf.Seven;

public class First {
    public static void main(String[] args) {
        // Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

        // tip:
        // 1- used if and else if and else
        int n = 1;
        if (n == 1) {
            System.out.println("Monday");
        } else if (n == 2) {
            System.out.println("Tuesday");
        } else if (n == 3) {
            System.out.println("Wednesday");
        } else if (n == 4) {
            System.out.println("Thursday");
        } else if (n == 5) {
            System.out.println("Friday");
        } else if (n == 6) {
            System.out.println("Saturday");
        } else if (n == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Enter number Please enter number 1 to 7");
        }


    }
}
