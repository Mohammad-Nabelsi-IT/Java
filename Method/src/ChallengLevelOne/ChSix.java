package ChallengLevelOne;

public class ChSix {
    public static void main(String[] args) {
        //  Write a Java method
        // [addition] send two argument numbers double
        // [subtraction] send two argument numbers double
        // [multiply] send two argument numbers double
        // [divide] send two argument numbers double
        // [reminder] send two argument numbers double

        // Tip
        // all methods call in the main

        // test case
        // addition(45.5,78.5)
        // subtraction(778.5,78.5)
        // multiply(5.0,8.0)
        // divide(10.0,5.0)
        // reminder(7.0,2.0)
        System.out.println(addition(45.5, 78.5));
        System.out.println(subtraction(778.5, 78.5));
        System.out.println(multiply(5.0, 8.0));
        System.out.println(divide(10.0, 5.0));
        System.out.println(reminder(7.0, 2.0));
    }

    public static double addition(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtraction(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiply(double n1, double n2) {
        return n1 * n2;
    }

    public static double divide(double n1, double n2) {
        return n1 / n2;
    }

    public static double reminder(double n1, double n2) {
        return n1 % n2;
    }
}
