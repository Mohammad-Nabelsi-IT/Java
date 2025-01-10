package ChallengScanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChOne {
    public static void main(String[] args) {
        sumNumber();
    }

    public static void sumNumber() {
        try {
            Scanner scanner = new Scanner(System.in);

            double sum = 0;
            int count = 1;

            do {
                System.out.printf("Please Enter Number %d: ", count);
                double number = scanner.nextDouble();
                sum += number;
                count++;
            } while (count <= 5);
            System.out.printf("sum number %.2f %n ", sum);
        } catch (InputMismatchException error) {
            System.out.printf("please enter just numbers and This includes entering numbers without fractions  ");
        } catch (Exception e) {
            System.out.printf("Error General : %s %n", e.getMessage());
        }

    }
}