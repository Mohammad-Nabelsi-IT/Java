import java.util.Arrays;
import java.util.Scanner;

public class XOGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char [][] xo = new char[3][3];

        // fill Array by space char
        for (int i = 0; i < 3; i++) {
            Arrays.fill(xo[i] , ' ');
        }
        //////////////////////////

        char player = 'X' ;
        do{
            printGame(xo);

            System.out.println("please Enter " + player + " location (row ,column):");
            System.out.print("Row : ");
            int r = scanner.nextInt(); // 0
            System.out.print("Column : ");
            int c = scanner.nextInt(); // 0

            //write in Array
            // check empty space then write
            if(xo[r][c] ==' ')
                 xo[r][c] = player;
            else{
                System.out.println("It is not Empty please try another location");
                continue;
            }

            // check winner // call method
            boolean isWin = checkWinner(xo , player); // true , false

            if (!isWin){
                // if false
                if (player =='X') player ='O'; else player ='X';
            }else{
                // if true
                // draw game
                printGame(xo);
                System.out.println("Congratulation " + player + " Win");
                break;
            }
        }while(true);
    }

    // declare methodd
    static  boolean checkWinner(char [][] xo , char player){
        if(xo[0][0] == player && xo[0][1] == player && xo[0][2] ==player) return  true;
        else if(xo[1][0] == player && xo[1][1] == player && xo[1][2] ==player) return  true;
        else if(xo[2][0] == player && xo[2][1] == player && xo[2][2] ==player) return  true;
        else if(xo[0][0] == player && xo[1][0] == player && xo[2][0] ==player) return  true;
        else if(xo[0][1] == player && xo[1][1] == player && xo[2][1] ==player) return  true;
        else if(xo[0][2] == player && xo[1][2] == player && xo[2][2] ==player) return  true;
        else if(xo[0][0] == player && xo[1][1] == player && xo[2][2] ==player) return  true;
        else if(xo[0][2] == player && xo[1][1] == player && xo[2][0] ==player) return  true;
        return  false ;
    }
    static  void printGame(char [][]xo ){
        // print game (xo Array)
        int rowCount =0;
        System.out.println("    0   1   2  ");
        for (char [] row : xo){ // get row from the Array
            System.out.print(rowCount++ +  " | ");
            for (char c : row){  // get element value from the row
                System.out.print( c + " | ");
            }
            System.out.println();
        }
        ///////////////////////

    }

}



