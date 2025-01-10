import java.util.Scanner;

public class PrimeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt(); // I need check number is prime or not (number =9)
        for (int i = 2; i < number ; i++)
        {
            if (number % i == 0){
                System.out.println(number + " not prime");
                return;
            }
        }
        System.out.println(number + " is prime");
    }
}
