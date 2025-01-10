public class WhileEx {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("number : %d %n", i);
        }
        //declare variables
        int i = 1, n = 5;

        // while loop from 1 to 5
        while (i <= n) {
            System.out.printf("number : %d %n", i);
            i++;
        }

        // do while loop from 1 to 5
        String fName = "Mohammad";

        // while (fName.startsWith("moh")) {
//         System.out.printf("name : %s %n ", fName);
//        }
        do {
            System.out.printf("name : %s %n", fName);
        } while (fName.startsWith("moh"));
    }//main
}//class
