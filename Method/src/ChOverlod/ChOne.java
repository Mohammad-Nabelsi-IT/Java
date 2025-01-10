package ChOverlod;

public class ChOne {
    //    Create two methods with the same name: convertToCentimeters

//    The first method has one parameter of type int, which represents the
//    entire height in inches. You'll convert inches to centimeters,
//    in this method, and pass back the number of centimeters, as a double.


//    The second method has two parameters of type int,
//    one to represent height in feet, and one to represent the remaining height in inches.
//    So if a person is 5 foot, 8 inches,
//    the values 5 for feet and 8 for inches would be passed to this method.
//    This method will convert feet and inches to just inches,
//    then call the first method, to get the number of centimeters,
//    also returning the value as a double.

    // Tip
    // (1) 1inch = 2.54 cm.
    // (2) 1foot = 12 inches.

    public static void main(String[] args) {
        //System.out.println("68in = " + convertToCentimeters(68) + "cm");
        System.out.printf("68in = %.2fcm %n", convertToCentimeters(68));
        //System.out.println("5ft ,3in = " + convertToCentimeters(5, 3) + "cm");
        System.out.printf("5ft ,3in = %.2fcm %n", convertToCentimeters(5, 3));
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    // 5feet, 3in
    public static double convertToCentimeters(int feet, int remainingInches) {
        //                  160.02cm         60in     +    3in
        return convertToCentimeters((feet * 12) + remainingInches);

//        int feetToInches = feet * 12; // 60in
//        int totalInches = feetToInches + remainingInches; // 63in

//        double result = convertToCentimeters(totalInches); // 160.02
//        double result = totalInches * 2.54; // 160.02 old version
//        return result;
    }
}
