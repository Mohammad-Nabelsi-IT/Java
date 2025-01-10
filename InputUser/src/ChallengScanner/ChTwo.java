package ChallengScanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChTwo {
    public static void main(String[] args) {

     program();
    }

    public static void program() {
        /*
          TODO: 1
                 - create Method called program and not return any thing
                 - create Object Scanner
                 - create variable max and min
                 - create variable loopCount
         */

        Scanner scanner = new Scanner(System.in);
        double max = 0, min = 0;
        int loopCount = 0;

          /*
           TODO: 2
                  - create loop while
                  - then  print message  (Enter a number, or any character to exit:)
                  - read number type double (used scanner)
                  - found min value and max value
         */
        while (true) {
            try {
                System.out.printf("Enter a number, or any character to exit:");
                double number = scanner.nextDouble();
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
                loopCount++;


            } catch (InputMismatchException error) {
                break;
            }


        }
//

        /*
           TODO: 3
                  - create try and catch
                  - when input character stop loop (while)
         */

        /*
           TODO:4 - check loopCount  greater than zero view output min value and max value
                  - otherwise view message (No valid data entered)
         */
        if (loopCount > 0){
            System.out.printf("min = %.2f max = %.2f  %n ", min, max);
        }else {
            System.out.printf("No valid data entered %n");
        }


    }
}

