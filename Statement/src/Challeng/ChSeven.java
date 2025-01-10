package Challeng;

public class ChSeven {
    public static void main(String[] args) {
        // Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

        // tip:
        // 1- used if and else if and else
        int n1 = 9;
        if (n1 == 1) {
            System.out.println("Monday");
        } else if (n1 == 2) {
            System.out.println("Tuesday");
        } else if (n1 == 3) {
            System.out.println("Wednesday");
        } else if (n1 == 4) {
            System.out.println("Thursday");
        } else if (n1 == 5) {
            System.out.println("Friday");
        } else if (n1 == 6) {
            System.out.println("Saturday");
        } else if (n1 == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Please Number 1 - 7");
        }
    }
}
