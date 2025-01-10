package ChThree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        /*
          TODO: 1
                  - create method inputThenPrintSumAndAverage
                  - no have any parameter
                  - no return any thing
         */
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
    /*
           TODO: 2
                   - create loop used while
                   - print message : "SUM = XX AVG = YY"
                         * XX represents the sum of all entered numbers of type int.
                         * YY represents the calculated average of all numbers of type [long].
         */
        Scanner scanner=new Scanner(System.in);
         // sum number input
        int sum=0;
        // count loop (while)
        int count=0;

        while (true){
            try {
                System.out.printf("Enter Number without Decimal :");
                int number = scanner.nextInt();

                sum+= number; // sum = sum + numbers;
                count++; // count = count + 1;

            } catch (InputMismatchException error) {
                // sum / count = int  || (float) sum / count = float
             long avg = Math.round((float) sum / count);
             System.out.printf("SUM = %d AVG = %d",sum,avg);
                 // why write break, because  while(true)
                break;
            }
        }

    }
}
