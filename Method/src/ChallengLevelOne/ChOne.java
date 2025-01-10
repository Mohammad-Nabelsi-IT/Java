package ChallengLevelOne;

public class ChOne {
    public static void main(String[] args) {
        // Write a Java method to find the smallest number among three numbers.
        // Test Data:
        // Input the first number: 25
        // Input the Second number: 37
        // Input the third number: 29
        // Expected Output:
        //
        // The smallest value is 25
        number();
    }// main

    public static void number() {
        int n1 = 25;
        int n2 = 37;
        int n3 = 29;
        int smallNumber = 0;

        if ((n1 < n2) && (n1 < n3)) {
            smallNumber = n1;

        } else if ((n2 < n1) && (n2 < n3)) {
            smallNumber = n2;

        } else {
            smallNumber = n3;

        }
        System.out.println("The smallest value is " + smallNumber);
    }


}//class
