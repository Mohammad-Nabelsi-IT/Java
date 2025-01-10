public class TwoDimArrayDemo2 {
    public static void main(String[] args) {
        int num [][] = {
                            {40,50},
                            {7,0},
                            {78,8},
                            {100,50}
                        };

        for (int [] row: num){
            for (int v : row){
                System.out.print(v + "\t");
            }
            System.out.println();
        }


        int x [][] ={{10,50}, {20,30},{15,14}};

        for (int[] e : x) {
//            System.out.println(e[0] + "\t" + e[1]);
            for(int i : e){
                System.out.print(i  + "\t");
            }
            System.out.println();

        }


    }
}
