public class DataTypeDecimal {
    public static void main(String[] args) {
        // float 1.4E-45 to 3.4028235E38

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("float range : (" + minFloat + "to" + maxFloat + ")");

        // 1.4E-45
        // 1.4 * 10^45
        // 3.4028235 * 10^38

        float n1 = (float) 3242.342;
        // f or F best practice
        float n2 = 3242.342F;

        //------------- Double --------------
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("range double = (  " + minDouble + "to" + maxDouble + ")");

        int x1 = 5;
        float x2 = 5;
        double x3 = 5;
        System.out.println(" x1 : " + x1 + "x2 :" + x2 + "x3 :" + x3);

        // v.v.v.imp
        // error because default double solve add `f` or `F`
        float n3 = 5.342F;
        System.out.println("n3 :" + n3);

        // point Precision
        int num1 = 5 / 2; // 2.5
        float num2 = 5f / 2f;// 5.0 / 2.0 -> 2.5
        double num3 = 5d / 2d;  // 5.0 / 2.0 -> 2.5
//       double num3 = 5 / 2;
        // double num3 = 2; -> 2.0

        System.out.println("num1 : " + num1 + "num2 : " + num2 + "num3 : " + num3);

        float num4 = 5f / 3f; // 1.6666666
        double num5 = 5d / 3d; //  1.6666666666666667

        System.out.println("num 4   is  float : " + num4 + "\n" + num5);


    }
}
