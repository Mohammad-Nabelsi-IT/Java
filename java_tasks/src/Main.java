import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numberOne ; // declare
        numberOne =10 ; // initalize
        numberOne = 50; // change value

        // nested loop
        for (int i = 1; i <= 2 ; i++) {
            for (int j = 50; j >=10 ; j-=10) {
                System.out.println(j);
            }
            System.out.println("*****");
        }

        // i =1 , j =5

        /*
        5
        4
        3
        2
        1

        5
        4
        3
        2
        1

         */
    }
}