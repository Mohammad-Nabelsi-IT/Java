package ChThree;

public class Solve {
    public static void main(String[] args) {
        System.out.printf("sum digit even : %d %n", getEvenDigitSum(123456789));
        System.out.printf("sum digit even : %d %n", getEvenDigitSum(525));
        System.out.printf("sum digit even : %d %n", getEvenDigitSum(-22));
    }

    /**
     * getEvenDigitSum check even digit and sum digit even
     *
     * @param number
     * @return return sum even digit
     */

    public static int getEvenDigitSum(int number) {
        // check number negative return -1
        if (number < 0) return -1;

        int sum = 0;
        // check is number even or not,
        // not check number 0, number > 0
        // ex: number 365
        while (number > 0) {
            // found last number
            int lastDigit = number % 10;
            // check is lastDigit even or odd
            if (isEven(lastDigit)) {
                // even save number
                sum += lastDigit; // sum = sum + lastDigit;
            }
            // delete last number
            number /= 10;
        }
        // return sum only even number digit
        return sum;
    }


    /**
     * isEven check is number even or odd
     *
     * @param number
     * @return when found number even return true, otherwise return false
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
