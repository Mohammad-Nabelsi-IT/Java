package ChallengeLevelIntermediate;

public class ChFive {
    // Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    //
    // The method should return boolean it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
    //
    // EXAMPLES OF INPUT/OUTPUT:
    //
    // * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
    //
    // * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
    //
    // * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
    //
    // * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
    // Tip: Use casting.
    public static void main(String[] args) {

    }//main

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        // multiplying by 1000. This moves the (first three decimal places) to the right of the decimal
        // 3.247 * 1000 = 3247
        // 3.125 == 3.125 = true
        // 3.12578 * 1000 = 3125.78
        // int x = 3123.78;
        // int x = 3123;
        // 3125 - 3125 = 0
        int first = (int) (firstNumber * 1000);
        int second = (int) (secondNumber * 1000);
        //System.out.println(first);
        //System.out.println(first);
        //System.out.println(first - second);
        if (first - second == 0) {
            return true;
        } else {
            return false;
        }
    }
}
