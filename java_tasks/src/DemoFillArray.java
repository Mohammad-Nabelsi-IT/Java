import java.util.Arrays;

public class DemoFillArray {
    public static void main(String[] args) {
        int [] x = new int [10];
//        for (int i = 0; i <10 ; i++) {
//            x[i] = 50;
//        }
        Arrays.fill(x , 100);
        for (int i : x) System.out.println(i);


        char c [] = new char[5];
//        for (int i = 0; i < 5; i++) {
//            c[i] = 'D';
//        }
        Arrays.fill(c ,'X');
        for (char i : c) System.out.println(i);

        System.out.println("--------------");


        int [][] num = new int [3][3];

//        for (int r = 0; r <3 ; r++) {
//            for (int e = 0; e <3 ; e++) {
//                num[r][e] = 50;
//            }
//        }
        for (int i = 0; i <3 ; i++) {
            Arrays.fill(num[i] , 100);

        }

        System.out.println("fff");
    }
}
