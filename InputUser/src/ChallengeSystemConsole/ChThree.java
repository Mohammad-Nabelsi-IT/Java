package ChallengeSystemConsole;

public class ChThree {
    public static void main(String[] args) {
        // label
        System.out.printf("found number even or odd ");

        try {

            while (true) {
                // input user
                String inputNumber = System.console().readLine("Enter number");
                // convert integer
                int number = Integer.parseInt(inputNumber);

                // check is even or odd
                if (isEven(number)) {
                    System.out.printf("number %d is even %n", number);
                } else {
                    System.out.printf("number %d is odd  %n", number);
                }
                // check answer continues or stops (yes/no)
                String answer = System.console().readLine("Would you like to write another number? (Y/N):");
                if (answer.equals("n") || answer.equals("N")) {
                    // stop loop
                    break;
                }

                // debug terminal

            }// while
        }catch (NullPointerException pointer){
            System.out.printf("can`t run IDE System.console() %n");
        }catch (Exception error){
            System.out.printf("error : %s %n",error);
        }finally {
            System.out.println("Goodbye take care");
        }

    }
    // Documentation

    /**
     * isEven check is even or odd
     *
     * @param number type int
     * @return when found even return true otherwise false
     */
    public static boolean isEven(int number){
        return (number % 2 ==0);
    }

          /*
            System.out.println("moh" == "moh"); // true
            System.out.println("moh".equals("moh")); // true
            System.out.println(answer == "n"); // false
            System.out.println(answer.equals("n")); // true
           */

}
