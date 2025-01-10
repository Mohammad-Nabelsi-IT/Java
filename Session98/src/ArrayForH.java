public class ArrayForH {
    public static void main(String[] args) {
        String names [][] = {{"Ahmad", "Dina", "Sara"},
                {"Mai", "Mohammad", "Safa"},
                {"Mona", "Jad", "Morad"}
        };
        for (String [] row : names){
            for (String s : row )
                System.out.print(s +" ");
            System.out.println();
        }



    }
}
