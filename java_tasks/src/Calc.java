import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("First Number : ");
        double firstNumber = scanner.nextDouble();

        char operator = scanner.next().charAt(0);

//        System.out.print("Second Number : ");
        double secondNumber = scanner.nextDouble();


        // * - + /
//        System.out.println("write the operator (+,-,*,/)");


        double result =0;

        if (operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        }else if (operator == '*') {
            result = firstNumber * secondNumber;
        }else if (operator == '/') {
            result = firstNumber / secondNumber;
        }else{
            System.out.println("Invalid operator please try again");
        }


        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);

    }
}
