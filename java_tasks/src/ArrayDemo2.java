import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Student Numbers :");
        int l =scanner.nextInt();

        String names [] = new String[l];

        // fill array
        for (int i = 0; i < names.length ; i++) {
            System.out.print("Student Name : ");
            names[i] = scanner.next();
        }

        for (int i = 0; i < names.length ; i++) {
            System.out.println("Hello " + names[i]);
        }

    }
}
