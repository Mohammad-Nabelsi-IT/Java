package ChallengeLevelIntermediate;

public class ChSeven {
    // We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//
// Write a method named hasTeen with 3 parameters of type int.
//
// The method should return boolean  it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise, return false.
//
// EXAMPLES OF INPUT/OUTPUT:
//
//  * hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
//
//  * hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
//
//  * hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19


// Write another method named `isTeen` with 1 parameter of type int.
//
// The method should return boolean  it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise, return false.
//
// EXAMPLES OF INPUT/OUTPUT:
//
//   * isTeen(9);  should return false since 9 is in not range 13 - 19
//
//   * isTeen(13);  should return true since 13 is in range 13 - 19

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

    }


    public static boolean hasTeen(int age1, int age2, int age3) {
        // At least one answer must be correct -> true
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }

    public static boolean isTeen(int age) {
        // 13 to 19 yes true or no false
//        return (age >= 13 && age <= 19) ? true : false;
        return age >= 13 && age <= 19;
    }

}


//    public static boolean hasTeen2(int age1, int age2, int age3) {
//        // At least one answer must be correct -> true
//        if (age1 >= 13 && age1 <= 19) {
//            return true;
//        } else if (age2 >= 13 && age2 <= 19) {
//            return true;
//        } else if (age3 >= 13 && age3 <= 19) {
//            return true;
//        } else {
//            return false;
//        }
