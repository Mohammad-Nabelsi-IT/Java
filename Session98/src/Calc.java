import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char c;
        while (true) {

            System.out.print("first number :");
            double fNumber = scanner.nextDouble();

            System.out.print("enter opreter (+,-,*,/) :");
            char opreter = scanner.next().charAt(0);

            System.out.print("scound number :");
            double sNumber = scanner.nextDouble();


            double result = '0';

            switch (opreter) {
                case '+':
                    result = fNumber + sNumber;
                    break;
                case '-':
                    result = fNumber - sNumber;
                    break;
                case '*':
                    result = fNumber * sNumber;
                    break;
                case '/':
                    result = fNumber / sNumber;
                    break;
                default:
                    System.out.println("invalid value");
            }
            System.out.println(fNumber + " " + opreter + " " + sNumber + " = " + result);
            System.out.println("press y to continue any key to exit");
            c = scanner.next().charAt(0);
            if (c !='y'){
             break;
            }
        }

    }
    }


