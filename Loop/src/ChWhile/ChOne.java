package ChWhile;

public class ChOne {
    public static void main(String[] args) {
        int number = 4, finishNumber = 20;
        // var sum numbers
        int sumEven = 0;
        int sumOdd = 0;
        // stop first number 5 even
        int count = 0;

        while (number < finishNumber) {
            number++;
            // check is number even or odd
            if (isEvenNumber(number)) {
                // even number
                System.out.printf("even number : %d %n", number);
                sumEven += number;
                count++;
            } else {
                // odd number
                sumOdd += number;
            }
            // if (count == 5) {
            // stop loop while
            //     break;
            // }
        }
        System.out.printf("sum even numbers %d %n", sumEven);
        System.out.printf("sum odd numbers %d %n", sumOdd);

    }//main

    /**
     * found number is even or odd
     *
     * @param number
     * @return true is even otherwise false
     */
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}//class
