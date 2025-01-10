import java.util.Arrays;
import java.util.Scanner;

public class ArrayXO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] xo = new char[3][3];
        // fill Array with  space char
        for (int i = 0; i < 3; i++) {
            Arrays.fill(xo[i], ' ');
        }

        char player = 'x';
        do {
            printGame(xo);
            System.out.println("please enter " + player + " location");
            System.out.print("row : ");
            int r = scanner.nextInt();
            System.out.print("column : ");
            int c = scanner.nextInt();
            xo[r][c] = player;

            boolean isWin = checkWin(xo, player);// true , false

            if (!isWin) {
                //if false
                if (gameOver(xo)){
                    printGame(xo);
                    System.out.println("***** GAME * OVER *****");
                    break;
                }
                if (player == 'x') player = 'o';
                else player = 'x';
            } else {
                printGame(xo);
                System.out.println("You are the Winner");
                break;
                // if true
                // draw game
            }



        } while (true);

    }

    public static void printGame(char[][] xo) {
        int count = 0;//////////////////////
        System.out.println("    0   1   2 ");
        for (char row[] : xo) {

            System.out.print(count++ + " | ");
            for (int i = 0; i < 3; i++) {
                System.out.print(row[i] + " | ");
            }
            System.out.println();
        }
    }

    public static boolean checkWin(char[][] xo, char player) {
        if (player == xo[0][0] && player == xo[0][1] && player == xo[0][2]) return true;
        else if (player == xo[1][0] && player == xo[1][1] && player == xo[1][2]) return true;
        else if (player == xo[2][0] && player == xo[2][1] && player == xo[2][2]) return true;
        else if (player == xo[0][0] && player == xo[1][0] && player == xo[2][0]) return true;
        else if (player == xo[0][1] && player == xo[1][1] && player == xo[2][1]) return true;
        else if (player == xo[0][2] && player == xo[1][2] && player == xo[2][2]) return true;
        else if (player == xo[0][2] && player == xo[1][1] && player == xo[2][2]) return true;
        else if (player == xo[2][0] && player == xo[1][1] && player == xo[0][2]) return true;
        else return false;


    }

    public static boolean gameOver(char [][] xo){
        for (char [] row : xo){
            for (char c : row){
                if (c==' ') return false;
            }
        }
        return true;
    }
}
