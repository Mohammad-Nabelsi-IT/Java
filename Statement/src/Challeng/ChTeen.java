package Challeng;

public class ChTeen {
    public static void main(String[] args) {

        // what is output

        // number
        double n1 = 10.5, n2 = 33.3, n3 = 77.34, n4 = 22.99;
        // save max value
        double max = 0;
        // save name variable
        String nameVariable = "";
        if ((n1 > n2) && (n1 > n3) && (n1 > n4)) {
            max = n1;
            nameVariable = "n1";
        } else if ((n2 > n1) && (n2 > n3) && (n2 > n4)) {
            max = n2;
            nameVariable = "n2";
        } else if ((n3 > n1) && (n3 > n2) && n3 > n4) {
            max = n3;
            nameVariable = "n3";
        } else {
            max = n4;
            nameVariable = "n4";
        }

        System.out.println("max number " + nameVariable + " = " + max);

        // case two
        // n4 = 222.99









    }
}
