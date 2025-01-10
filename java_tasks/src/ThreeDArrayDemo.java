public class ThreeDArrayDemo {

    public static void main(String[] args) {
        int [][][] x = new int [3][3][2]; // [rows][columns][deep]

        x[0][0][0] = 10;
        x[0][0][1] = 20;

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                for (int d = 0; d <2 ; d++) {
                    System.out.println(x[r][c][d]);
                }
            }
        }

        ////////////////////////////

        for (int [][] rect : x){
            for (int [] row :rect){
                for (int e :row){
                    System.out.println(e);
                }
            }
        }

    }
}
