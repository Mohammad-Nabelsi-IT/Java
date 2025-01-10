package Challeng;

public class ChTree {
    public static void main(String[] args) {

        int x1 = 600, x2 = 1000, x3 = 433;

        int maxNumber = 0;
        String name = "";
        if (x1 >= x2 && x1 >= x3) {
            maxNumber = x1;
            name = "x1";
        } else if (x2 >= x1 && x2 >= x3) {
            maxNumber  = x2;
            name ="x2";
        } else {
            maxNumber = x3;
            name = "x3";
        }
        System.out.println("max number " + name + " = " +maxNumber);

    }
}
