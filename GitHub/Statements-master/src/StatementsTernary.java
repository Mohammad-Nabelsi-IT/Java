public class StatementsTernary {
    public static void main(String[] args) {
        if (5 > 3 || 10 > 2)
            System.out.println("Greater Than");
//        else if (3>4)
//            System.out.println("Greater Than");
        else
            System.out.println("Less Than");

        String result = (5 >= 3) ? "Greater Than" : "Less Than";
        System.out.println("result = " + result);

        String gender = "female";
        int res = (gender == "male") ? 0 : 1;
        System.out.println("gender : " + res);


        // print
        System.out.println((5 >= 3) ? "Greater Than " : "less Than");
        // sout("Greater Than ");


        // ex if and else if and else
        String name = "ali";
        if (name == "ali")
            System.out.println("ali");
        else if (name == "nour")
            System.out.println("nour");
        else
            System.out.println("name is not nour or ali ");

        String resName = (name == "ali") ? "ali" : (name == "nour") ? "nour" : "name is not nour or ali";
        System.out.println(resName);

    }
}
