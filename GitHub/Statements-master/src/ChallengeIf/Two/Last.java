package ChallengeIf.Two;

public class Last {

    public static void main(String[] args) {
        int n = 88;
        // between 50 and 100
        if (n >= 50 && n <= 100) {
            System.out.println("number found between 50 and 100 ");
        } else {
            System.out.println("number not found between 50 and 100 ");
        }

//        String res = (n >= 50 && n <= 100) ? "number found between 50 and 100 " :
//                "number not found between 50 and 100 ";

        System.out.println((n >= 50 && n <= 100) ? "number found between 50 and 100 " :
                "number not found between 50 and 100 ");

    }

}
