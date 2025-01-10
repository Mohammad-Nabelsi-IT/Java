package Challeng;

public class ChTwelve {
    public static void main(String[] args) {
        // write program java is number
        // * less than 10 print(✤)
        // * greater than or equal 10 and less than  100 print(✤✤)
        // * greater than or equal 100 and less than 1000  print( ✤✤✤)

        // Tip
        // using if statement
        // using logical
        int n = 10000;
        if (n < 10) {
            System.out.println("✤");
        } else if ((n >= 10) && (n < 100)) {
            System.out.println("✤✤");
        } else if ((n >= 100) && (n < 1000)) {
            System.out.println("✤✤✤");
        } else {
            System.out.println("Please Enter Number 0 to 1000");

        }
    }
}
