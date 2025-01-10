package ChFor;

public class ChThree {
    //      Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.//
//      Check that number is > 0, if it is not return false.
//
//      If number is odd return true, otherwise  return false.
//
//      Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
//
//      The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.
//
//      It should call the method isOdd to check if each number is odd.
//
//      The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
//
//      If those conditions are not satisfied return -1 from the method to indicate invalid input.
//
//      Example input/output:
//
//      * sumOdd(1, 100); → should return 2500
//
//      * sumOdd(-1, 100); →  should return -1
//
//      * sumOdd(100, 100); → should return 0
//
//      * sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
//
//      * sumOdd(100, -100); → should return -1
//
//      * sumOdd(100, 1000); → should return 247500
    public static void main(String[] args) {
        System.out.printf("sum numbers : %d %n", sumOdd(1, 100));
        System.out.printf("sum numbers : %d %n", sumOdd(100, 1000));
    }

    /**
     * isOdd check number is odd  return ture
     *
     * @param number type int
     * @return boolean ture isOdd false even
     */
    public static boolean isOdd(int number) {
        // check number less than or equal zero return false (stop method)
        if (number <= 0) {
            return false;
        }
        // 1)
//        if (number % 2 != 0) {
//            return true;
//        } else {
//            return false;
//        }

// 2)
//  return number % 2 != 0 ? true : false;

// 3)
// is odd != 0 (true) | even  == 0 (false)
        return number % 2 != 0;
    }

    /**
     * sumOdd return sum numbers odd
     *
     * @param start begin loop
     * @param end   end loop
     * @return int sum numbers odd
     */
    public static int sumOdd(int start, int end) {
        // sum numbers are odd start 0 because initialization value
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                //System.out.printf("number %d is odd %n", i);
                //  sum = sum + i;
                sum += i;
            }
        }
        return sum;
    }

}
