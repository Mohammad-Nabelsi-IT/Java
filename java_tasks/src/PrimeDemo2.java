import java.util.Scanner;

public class PrimeDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt(); // I need check number is prime or not (number =9)
        int i = 2;
        while (i < number )
        {
            if (number % i++ == 0){
                System.out.println(number + " not prime");
                return;
            }
        }
        System.out.println(number + " is prime");
    }
}
