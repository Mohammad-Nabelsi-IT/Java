package ChallengeLevelIntermediate;

public class ChTwo {
    public static void main(String[] args) {
        //  1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
        //  This method needs to return the `rounded` value of the calculation of type long.
        //
        //  If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
        //
        //  Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For `conversion` and rounding, check the notes in the text below.
        //
        //  Examples of input/output:
        //  * toMilesPerHour(1.5); → should return value 1
        //  * toMilesPerHour(10.25); → should return value 6
        //  * toMilesPerHour(-5.6); → should return value -1
        //  * toMilesPerHour(25.42); → should return value 16
        //  * toMilesPerHour(75.114); → should return value 47
        //  Hint : The ratio of miles per hour to kilometers per hour

        //  2. Write another method called `printConversion` with 1 parameter of type double with the name `kilometersPerHour`.
        //
        //   This method should not return anything (void) and it needs to calculate `milesPerHour` from the kilometersPerHour parameter.
        //
        //    Then it needs to print a message in the format "XX km/h = YY mi/h".
        //
        //    XX represents the original value kilometersPerHour.
        //    YY represents the rounded milesPerHour from the kilometersPerHour parameter.
        //
        //    If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

        //   Examples of input/output:
        //    * printConversion(1.5); → should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
        //    * printConversion(10.25); → should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
        //    * printConversion(-5.6); → should print the following text (into the console - System.out): Invalid Value
        //    * printConversion(25.42); → should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
        //    * printConversion(75.114); → should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h


        //        System.out.println(toMilesPerHour(1.5));
        //        System.out.println(toMilesPerHour(10.25));
        //        System.out.println(toMilesPerHour(-5.6));
        //        System.out.println(toMilesPerHour(25.42));
        //        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);


    }//main

    // convert kilo to mile
    public static long toMilesPerHuor(double kilometersPerHour) {
        // condition
        return (kilometersPerHour < 0) ? -1 : Math.round(kilometersPerHour / 1.6093445);

    }

    // print result  convert kilo to miles
    public static void printConversion(double kilometersPerHour) {
        // 1.5  km/h =  1 mi/h
        System.out.println(kilometersPerHour < 0 ? "Invalid Value" : kilometersPerHour + "km/h = " + toMilesPerHuor(kilometersPerHour) + "mi/h");

    }
}
// old version
//public static long toMilesPerHour(double kilometersPerHour) {
//    if (kilometersPerHour < 0) {
//        return -1L;
//    } else {
//        // Miles = Kilometers / 1.6093445
//        double result = kilometersPerHour / 1.6093445;
//        return Math.round(result);
//
//    }
//}

// old version
//public static void printConversion(double kilometersPerHour) {
//    // 1.5  km/h =  1 mi/h
//    if (kilometersPerHour < 0) {
//        System.out.println("Invalid Value");
//    } else {
//        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
//    }
//
//}