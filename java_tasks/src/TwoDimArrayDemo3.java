public class TwoDimArrayDemo3 {
    public static void main(String[] args) {

//        String n [] ={"Hagar" ,"Dana" ,"Ali"};
//
//        for (String s :n) System.out.println(s);

        // 2D Array
        String [][] names = {
                {"Ahmed" , "Dina" ,"Sara" ,"Malak"},
                {"Mai" , "Mohamed" ,"Safa" ,"Fares"},
                {"Mona" , "Jad" , "Morad" , "Dima"}
        };

        names[0][1] = "Dalia";
        names[1][2] = "Walaa";
        names[2][3] = "Youssef";

        for (String [] row : names){ //
            for (String h : row){  // row ={"Ahmed" , "Dina" ,"Sara"}
                System.out.print(h + "\t");
            }
            System.out.println();
        }
        System.out.println("------------");

        for (int r = 0; r <3 ; r++) {
            for (int c = 0; c <4 ; c++) {
                System.out.print(names[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
