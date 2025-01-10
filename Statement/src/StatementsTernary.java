public class StatementsTernary {
    public static void main(String[] args) {

        if (5 > 3 || 10 > 2)
            System.out.println("Greater Than");
            //        else if (3>4)
//            System.out.println("Greater Than");
        else
            System.out.println("less Than");
        String result = (5 >= 3) ? "Greater Than" : "less Than";
        System.out.println("result " + result);

        String gender = "female";
        int res = (gender == "male") ? 0 : 1;
        System.out.println("gender " + res);


        // print
        System.out.println((5 >= 3) ? "Greater Than " : "less Than");
        // sout("Greater Than ");


    }
}
