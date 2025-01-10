import java.util.Scanner;

public class SumArray2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Numbers of Integers : ");
        int l  = scanner.nextInt(); //3

        int [] nums = new int [l];

        for (int i = 0; i < nums.length ; i++) {
            System.out.print("N"+(i+1)+" = ");
            nums[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("Sum Numbers = " + sum);
    }
}
