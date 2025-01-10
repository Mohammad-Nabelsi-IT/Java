package ChallengeSystemConsole;

public class ChSeven {


    public static void main(String[] args) {
        /*
          TODO: - read number from user (grade 2)
                - don't forgot convert to int (grade 2)
                - be careful add try and catch and finally (grade 5)
         */
        try {
            String inputNumber = System.console().readLine("Enter number:");
            // convert to int
            int num1 = Integer.parseInt(inputNumber);


            System.out.printf("sum digit number : %d %n", sumDigits(num1));
        } catch (NumberFormatException e) {
            System.out.printf("Enter Number %n");
        } catch (NullPointerException error) {
            System.out.printf("Please run just console %n");
        } catch (Exception error) {
            System.out.printf("General Error %n");
        } finally {
            System.out.printf("End Program %n");
        }

    }

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
        /*
           TODO: - loop when number >=1 (grade 2)
                 - storage last digit in sum (grade 4)
                 - be careful delete last digit after storage last digit (grade 4)
                 - finally return sum digit, out the loop (grade 1)
         */
        //  loop when number greater than or equal 1
        while (number >= 1) {
            // get last digit and storage in sum
            sum += number % 10;
            // delete last digit
            number /= 10;
        }
        return sum;
    }
}