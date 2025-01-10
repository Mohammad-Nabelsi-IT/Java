import java.util.Scanner;

public class ArraysOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int g[] = new int[5];
//        g [0]= 0;
//        g [1]= 10;
//        g [2]= 20;
//        g [3]= 30;
//        g [4]= 40;
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(g[i]);
//        }
        System.out.print("Please Enter Student Number : ");
        int n = scanner.nextInt();

        int g []=new int [n];
        for (int i = 0; i < g.length ; i++) {
            System.out.print("Enter Number : ");
            g[i]=scanner.nextInt();
        }
        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i]);
        }

    }
}
