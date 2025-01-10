public class TwoDimArrayDemo1 {

    public static void main(String[] args) {
        int [][] y = new int [5][3];
        y[0][0] =40;
        y[2][0] =70;
        y[2][1] =50;
        y[1][2] =30;
        y[3][1] =20;
        y[4][2] =85;

        // c for column
        // r for row

        for (int r = 0; r <5 ; r++) {
            for (int c = 0; c <3 ; c++) {
                System.out.print(y[r][c] + "\t");
            }
            System.out.println();

        }

        /*
        *  r=0
        *  c=0
        * y[0][0] y[0][1]  y[0][2]
        *
        *   r = 1
        *   y[1][0] y[1][1] y[1][2]
        *
        * r =2
        * */


    }


}
