public class MulTable {
    public static void main(String[] args) {
//      int x=1;
//       while (x<=15){
//           int table = x++;
//           for (int i = 1; i <= 10; i++) {
//
//               System.out.println(table +  " X " + i +" = "+(table*i));
//           }
//           System.out.println("\n");
//       }
        for (int x = 1; x <= 10; x++) {

            for (int i = 1; i <= x; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
