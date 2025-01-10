package ChallengeLevelIntermediate;

public class ChOne {
    public static void main(String[] args) {
        displayHighScorePosition("Mohammad", 4);
        displayHighScorePosition("Mai", 2);
        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(1000));
        System.out.println(calculateHighScorePosition(500));
        System.out.println(calculateHighScorePosition(100));
        System.out.println(calculateHighScorePosition(25));
    }//main

    // display high-score position
    public static void displayHighScorePosition(String namePlayer, int positionPlayer) {
        //System.out.println(namePlayer + " managed to get into position " + positionPlayer + " on the high score list");
        System.out.printf("%s  managed to get into position %d on the high score list. %n", namePlayer, positionPlayer);
    }

    // calculateHighScorePosition return (1 to 4)
    public static int calculateHighScorePosition(int scorePlayer) {
        // position list score
        int position = 4;

        if (scorePlayer >= 1000) {
            position = 1;
        } else if (scorePlayer >= 500) {
            position = 2;
        } else if (scorePlayer >= 100) {
            position = 3;
        }
        return position;
    }

}//class
