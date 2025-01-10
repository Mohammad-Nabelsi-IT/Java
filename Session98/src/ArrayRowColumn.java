public class ArrayRowColumn {
    public static void main(String[] args) {

        int n[][] = new int[4][2];
        n[0][0] = 40;
        n[0][1] = 50;
        n[1][0] = 7;
        n[1][1] = 0;
        n[2][0] = 78;
        n[2][1] = 8;
        n[3][0] = 100;
        n[3][1] = 50;
        for (int r = 0; r <4 ; r++) {
            for (int c = 0; c <2; c++) {
                System.out.print(n[r][c]+"-");
            }
            System.out.println();

        }
    }
}
