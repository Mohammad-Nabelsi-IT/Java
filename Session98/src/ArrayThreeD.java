public class ArrayThreeD {
    public static void main(String[] args) {
        int[][][] t = new int[3][3][2];
        t[0][0][0] = 10;
        t[0][0][1] = 20;
        t[1][0][0] = 30;
        for (int r= 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                for (int d = 0; d < 2; d++) {
                    System.out.println(t[r][c][d]);
                }
            }
        }
        System.out.println();
        for (int [][] w:t ){
            for (int [] r:w){
                for (int i:r){
                    System.out.println(i);
                }
            }
        }

    }
}
