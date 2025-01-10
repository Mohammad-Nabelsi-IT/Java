package ChOne;

public class Solve {
    // Number Palindrome

    // Write a method called isPalindrome with one int parameter called number.
    //
    // The method needs to return a boolean.
    //
    // It should return true if the number is a palindrome number, otherwise it should return false.
    //
    // Check the tips below for more info about palindromes.
    //
    // Example Input/Output

    //
    // isPalindrome(-1221); → should return true
    //
    // isPalindrome(707); → should return true
    //
    // isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
    //
    // Tip: What is a Palindrome number?  A palindrome number is a number that when reversed is equal to the original number. For example: 121, 12321, 1001 etc.

    // Tip: Logic to check a palindrome number
    //
    // Find the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
    //
    // If both are the same, then the number is a palindrome otherwise it is not.
    //
    // Tip: Logic to reverse a number
    // rev =(rev *10 )+digit;
    //
    // Declare and initialize another variable to store the reverse of a number,
    // for example, reverse = 0.
    public static void main(String[] args) {
        System.out.printf("number 121 is %b Palindrome %n", isPalindrome(121));
        System.out.printf("number 123 is %b Palindrome %n", isPalindrome(123));
    }

    public static boolean isPalindrome(int number) {
        // convert negative to positive
        // any number negative * -1 ex :(-10 * -1)=10
        if (number < 0) {
            number *= -1;
        }

        // storage number revers
        int reverse = 0;
        // save number before any edit
        int origin = number;
        // condition number < 0 stop loop
        while (number > 0) {
            // extract the last-significant digit ex: 123 - > 3
            int digit = number % 10;
            // storage digit in var reverse
            reverse = (reverse * 10) + digit;
            // drop the last-significant digit  -> 123 -> 3 delete
            number = number / 10;

        }

        // condition if origin equal reverse true isPalindrome
        // otherwise return false
        return origin == reverse;
    }

}