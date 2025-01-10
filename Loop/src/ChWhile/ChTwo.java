package ChWhile;

public class ChTwo {
    public static void main(String[] args) {
        System.out.printf("sum digit number : %d %n", sumDigits(444));
        System.out.printf("sum digit number : %d %n", sumDigits(879));
        System.out.printf("sum digit number : %d %n", sumDigits(666));
    }//main

    /**
     * sumDigits sum digits ex : 125 -> 1+2+5 = 8
     *
     * @param number
     * @return sum digits number
     */
    public static int sumDigits(int number) {
        // check is number negative or not
        if (number < 0) {
            // invalid value
            return -1;
        }
        // sum digit number
        int sum = 0;
        // check number not equal zero
        while (number >= 1) {
            // sum = sum + (number % 10);
            // ex 125 -> 5 storage in sum
            sum += number % 10;
            // number = number /10;
            // ex 125 -> delete last digit -> 12
            number /= 10;
        }
        //return sum digit
        return sum;
    }
}//class
