import java.util.Arrays;
import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] colors = {"red", "yellow", "pink", "blue", "black", "white", "braun"};
        do {


            int r = (int) (Math.random() * colors.length);
            String color = colors[r];
            //System.out.println(color);
            char[] dashes = new char[color.length()];
            Arrays.fill(dashes, '-');


            char[] colorArr = color.toCharArray();
            int trays = 0;
            do {
                System.out.println(dashes);
                System.out.print("please enter your char :");
                char c = scanner.next().charAt(0);
                boolean found = false;
                for (int i = 0; i < colorArr.length; i++) {
                    if (c == colorArr[i]) {
                        dashes[i] = c;
                        found = true;
                    }
                }
                if (!found) {
                    trays++;
                    System.out.println("your are in trays " + trays);
                    if (trays == 5) {
                        System.out.println("***** GAME * OVER *****");
                        break;
                    }
                }
                if (checkWin(dashes)) {
                    System.out.println(dashes);
                    System.out.println("*** good job ***");
                    break;
                }
            } while (true);
            System.out.println("press Y to continue or any key to exit");
            String input = scanner.next();
            if (!input.equals("y")) {
                break;
            }
        } while (true);
    }

    public static boolean checkWin(char xx[]) {
        for (char c : xx) {
            if (c == '-') return false;
        }
        return true;
    }
}
