import java.util.Arrays;
import java.util.Scanner;

public class XO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        char [][] xo = {{' ',' ',' '} ,{' ',' ',' '} ,{' ',' ',' '}};
        do {
            // Declare xo array then fill the array by empty spaces
            char[][] xo = new char[3][3];
            // loop on xo Array row by row
            for (int i = 0; i < 3; i++) {
                // get the first row and fill all elements by space
                Arrays.fill(xo[i], ' ');
            }
            ////////////////////////////////
            System.out.print("Choose X or O to Star Game : ");
            char player = scanner.next().charAt(0);  // 'X' ,'O'
            do {
                // print Game Area
                printGame(xo);
                //////////////////
                // to read input from user to add the X or O in the Array
                // you will read row and column location
                System.out.println("Player " + player + " : ");
                System.out.print("Row : ");
                int r = scanner.nextInt();
                System.out.print("Column :");
                int c = scanner.nextInt();

                // enter the player char in the array at the correct location (r,c)
                if (xo[r][c] == ' ')
                    xo[r][c] = player;
                else {
                    System.out.println("Location not empty please try again");
                    continue;
                }

                // check the winner
                boolean isWin = checkWinner(xo, player);

                if (isWin) { //true
                    printGame(xo);
                    System.out.println("***** Congratulation " + player + " The winner *****");
                    break;
                }
                // check Game Over

                if (gameOver(xo)) {
                    printGame(xo);
                    System.out.println("***** G A M E * O V E R *****");
                    break;
                }
                ///////////////////

                if (player == 'X') player = 'O';
                else player = 'X';
            } while (true);

            // if winner or game over

            System.out.print("if you want to continue pres y to exit press any key : ");
            String rslt = scanner.next();
            if (!rslt.equals("y")) break;
        }while (true);

    }
    static  void printGame(char[][] xo){
        System.out.println("    0   1   2");
        int count =0;
        for (char [] row : xo){
            System.out.print(count++ + " | ");
            for (char element : row){
                System.out.print(element + " | ");
            }
            System.out.println();
        }
    }

    static  boolean checkWinner(char [][] xo ,char player){
        if(xo[0][0] == player && xo[0][1] == player && xo[0][2] == player) return  true;
        else if(xo[1][0] == player && xo[1][1] == player && xo[1][2] == player) return  true;
        else if(xo[2][0] == player && xo[2][1] == player && xo[2][2] == player) return  true;
        else if(xo[0][0] == player && xo[1][0] == player && xo[2][0] == player) return  true;
        else if(xo[0][1] == player && xo[1][1] == player && xo[2][1] == player) return  true;
        else if(xo[0][2] == player && xo[1][2] == player && xo[2][2] == player) return  true;
        else if(xo[0][0] == player && xo[1][1] == player && xo[2][2] == player) return  true;
        else if(xo[2][0] == player && xo[1][1] == player && xo[0][2] == player) return  true;
        else return false;
    }


    static  boolean gameOver(char[][] xo){
        for (char [] row :xo){
            for(char e :row){
                if (e == ' ') return  false ;
            }
        }
        return  true;
    }
}
