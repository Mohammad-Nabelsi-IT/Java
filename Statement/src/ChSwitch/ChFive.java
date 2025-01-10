package ChSwitch;

public class ChFive {
    public static void main(String[] args) {
        //  Write a program to Check whether the number is even or odd using a switch statement
        // Tip:
        // even % 2 == 0
        // odd % 2 != 0-
        // switch shortcut
        int n = 11;
        switch (n % 2) {
            case 0 -> System.out.println("even");
            default -> System.out.println("odd");

        }


    }
}
