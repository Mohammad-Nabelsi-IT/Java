package ChallengLevelOne;

public class ChSeven {
    public static void main(String[] args) {
        // Write a Java method that checks if the entered number is
        // negative or positive or zero.


        // test case
        // isCheckNumber(10) -> number 10 is positive
        // isCheckNumber(-5) -> number -5 is negative
        // isCheckNumber(0) -> number 0 is zero
        isCheckNumber(10);
        isCheckNumber(-5);
        isCheckNumber(0);
    }

    public static void isCheckNumber(int x) {
        if (x > 0) {
            System.out.println("number " + x + " is positive");
        } else if (x < 0) {
            System.out.println("number " + x + " is negative");
        } else {
            System.out.println("number " + x + " is zero");
        }
    }


}
