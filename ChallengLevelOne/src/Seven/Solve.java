package Seven;

public class Solve {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
//        printFactors(10);
//        printFactors(-1);
    }

    public static void printFactors(int number) {
        if (number < 1) System.out.print("Invalid Value");
        // format
        System.out.printf("factors %d :", number);
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) System.out.printf(" %d ", i);
        }
        // new line
        System.out.println();
    }
}
