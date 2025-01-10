package Six;

import java.util.Random;

public class Game {
    public static void main(String[] args) {
        // create object
        Random rd = new Random();

        int count = 5;

        while (count > 0) {
            if (isCheckGame(count)) {
                System.out.printf("continue next level %n");
                if (rd.nextBoolean()) {
                    count--;
                }
            } else {
                System.out.printf("Good luck! %n");
                count--;
            }
        }
    }

    public static boolean isCheckGame(int number) {
        return number % 2 == 0;
    }
}
