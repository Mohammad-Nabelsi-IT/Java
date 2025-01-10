import java.util.Arrays;
import java.util.Scanner;

public class ConnectFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1- Define scanner
//2- Define array
//3- fill Array by spaces
//4- Define the player char (yellow , Red)
//5- print Game Area
//6- Read input from user to choose the column he needs to play in
//7- change the player
//8- repeat the game
        char game[][] = new char[6][7];
        for (int i = 0; i < 6; i++) {
            Arrays.fill(game[i], ' ');
        }
        char player = 'R';
        do {
            try {
                printGame(game);
                System.out.print("player " + player + " enter column :");
                int column = scanner.nextInt();
                for (int row = 5; row >= 0; row--) {
                    if (game[row][column] == ' ') {
                        game[row][column] = player;
                        break;
                    }
                }
                 if (checkWin(game,player)){
                     printGame(game);
                     System.out.println("player " + player +" the winner ");
                 break;
                 }
                if (gameOver(game)) {
                    System.out.println("***** GAME * OVER *****");
                    break;
                }
                if (player == 'R') player = 'Y';
                else player = 'R';
            } catch (Exception e) {
                System.out.println("please enter correct number");
            }
        } while (true);
    }


    public static void printGame(char game[][]) {
        System.out.println("   0   1   2   3   4   5   6");
        for (char row[] : game) {
            System.out.print(" | ");
            for (char v : row) {
                System.out.print(v + " | ");
            }
            System.out.println();
        }
    }

    public static boolean gameOver(char game[][]) {
        for (char row[] : game) {
            for (char column : row) {
                if (column == ' ') return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char[][] game, char player) {
        for (char[] row : game) {
            int counter = 0;
            for (char c : row) {
                if (c == player) {
                counter++;
                if (counter==4)return true;
                }else {
                    counter=0;
                }
            }
        }return false;
    }
}
