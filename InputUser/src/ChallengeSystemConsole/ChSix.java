package ChallengeSystemConsole;

public class ChSix {
    public static void main(String[] args) {
        /*
          TODO: - read two number start and end
                - don't forgot convert to int
                - Be careful add try & catch & finally
         */
        try {
            String start = System.console().readLine("enter number");
            String end = System.console().readLine("enter number");

            int num1 =Integer.parseInt(start);
            int num2 =Integer.parseInt(end);


            // call
            DivideNumber(num1,num2);
        } catch (NumberFormatException e) {
            System.out.printf("entr number:");
        } finally {
        }

    }


    /**
     * DivideNumber if number both divide 3 and 5 found sum and stop the first five found
     *
     * @return void
     */
    /*
     TODO: - add two parameter
           - start type int
           - end type int
     */
    public static void DivideNumber(int start, int end) {
        // [sum] sum number if divide 3 and 5
        // [count] count number divide 3 and 5
        int sum = 0, count = 0;

        // loop start 1 to 1000
        for (int i = start; i <=end; i++) {
            // check number if divide 3 and 5
            if ((i % 3 == 0) && (i % 5 == 0)) {
                // storage number in a sum
                sum += i;
                // increase count add plus one
                count++;
                // output found number
                System.out.printf("Found a match = %d %n ", i);

            }
            // check if count equal 5 stop loops
            if (count == 5) {
                return;
            }

        }
        System.out.printf("sum number divider 3 & 5 = %d %n", sum);
    }

}