package ChTwo;

public class Solve {
    public static void main(String[] args) {
        System.out.printf("sum digit first and last number: %d %n", sumFirstAndLastDigit(252));

        System.out.printf("sum digit first and last number: %d %n", sumFirstAndLastDigit(257));

        System.out.printf("sum digit first and last number: %d %n", sumFirstAndLastDigit(0));

        System.out.printf("sum digit first and last number: %d %n", sumFirstAndLastDigit(5));

        System.out.printf("sum digit first and last number: %d %n", sumFirstAndLastDigit(-10));
    }//main

    /**
     * sumFirstAndLastDigit found first number and last number
     * and sum first & last digit
     *
     * @param number
     * @return sum first and last digit
     */
    public static int sumFirstAndLastDigit(int number) {
        // negative number return -1
        if (number < 0) {
            return -1;
        }

        // save lastDigit
        int lastDigit = number % 10;

        // why 9 because If the number consists of one digit
        // example: 5 not need loop
        while (number > 9) {
            number /= 10;
        }

        // sum last with first number
        return lastDigit + number;
    }


}//class
