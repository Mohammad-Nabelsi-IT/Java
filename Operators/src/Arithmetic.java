public class Arithmetic {
    public static void main(String[] args) {

        int a = 29, b = 5, c = 10, d = 100;

        // Addition
        System.out.print("Addition " + a + " + " + b + " =");
        System.out.println(a + b);

        // subtraction
        System.out.print("Subtraction " + a + " - " + b + " =");
        System.out.println(a - b);

        // Multiply
        System.out.print("Multiply" + a + " * " + b + "=");
        System.out.println(a * b);

        // Division
        System.out.print("Division " + a + " / " + b + " =");
        System.out.println(a / b);

        //  Modulus or remainder (%)
        System.out.print("Remainder" + a + " % " + b + " =");
        System.out.println(a % b);

        // 7 % 2 = 3
        // 3 * 2 = 6
        // 7-6 =1
        // reminder = 1

        // unary Minus
        System.out.println("Revers the sign of the expression c :" + -c);
        System.out.println("Revers the sign of the expression d :" + Math.abs(d));

        char c1 = 'A';
        char c2 = 'B';
        System.out.println(c1 + c2);// AB

        // why ?
        // Decimal
        // A -> 65
        // B -> 66
        // 131
        // trick solve problem

        System.out.println("" + c1 + c2);
        // "" + c1 = A
        // "A" + c2 = AB

        int num1 = 34;
        int num2 = 60;
        System.out.println("" + num1 + num2);
        // "34" + 60 = 3460


    }
}
