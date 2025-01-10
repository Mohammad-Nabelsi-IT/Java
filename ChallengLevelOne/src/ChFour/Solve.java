package ChFour;

public class Solve {
    public static void main(String[] args) {
        System.out.printf("check both number : %b %n");
    }//main

    public static boolean hasSharedDigit(int num1, int num2) {
        // check range 10 to 99 inclusive return false
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }
        // copy value for num2 saves before any edit
        // Temporary value
        int temp = num2;

        // loop on digit number1
        while (num1 > 0) {
            // found last digit for number 1
            int lastdigit1 = num1 % 10;

            // Retrieve value for number 2
            num2 = temp;
            // loop on digit number 2
            while (num2 > 0) {
                // found last digit for number 2
                int lastdigit2 = num2 % 10;
                //check last digit 1 equal last digit 2
                if (lastdigit1 == lastdigit2) {
                    return true;
                }
                //delete last digit num2
                num2 /= 10;

            }// end while for num2
            // delete last digit num1
            num1 /= 10;
        }//end while for num1
        // not found in both numbers
        return false;
    }
}// class
