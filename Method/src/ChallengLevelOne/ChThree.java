package ChallengLevelOne;

public class ChThree {
    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(isEven(200));
        System.out.println(isEven(5));
        System.out.println(isEven(2));

    } //main
    // Write a method named isEven
    // The method should return true if the argument is even, or false otherwise.
    // Test Data:
    // Input the first number: 25
    // Input the Second number: 60
    // Input the third number: 29
    // Expected Output:
    //
    // false
    // true
    // false
    //10
    //200
    //5
    //2


    public static boolean isEven(int number) {

        if (number % 2 == 0) {
            // even
            return true;
        } else {
            // odd
            return false;
        }

    } //class
}