import java.util.Scanner;

public class CharDemo {
    public static void main(String[] args) {
        int x =10;

        // primitive datatype in stack (value type)
        // byte ,short , int , long
        // float  , double
        // boolean
        // char


        Scanner scanner = new Scanner(System.in);
        // reference datatype (reference in stack and object in heap)
        // class
        // Arrays
        // enum


//        char c = 'a';
//
//        System.out.println(c);
//
//        int y = c;
//        System.out.println(y); // 97
//
//        System.out.println(c + 10);
//        System.out.println(c + " " +  10);
//
//        String  name = scanner.next();
//        System.out.println(name.length());
//        for (int i = 0; i < name.length(); i++) {
//            System.out.print(name.charAt(i) + " " );
//        }
//
//        String text = "Red";
  // doaa2020
        // do******


        // 1234854
        // ***4854

        String name  =scanner.next();
        for (int i = 0; i <  name.length(); i++) {
            if (i < 3 ) System.out.print(name.charAt(i));
            else   System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < name.length(); i++) {
            if (i >= name.length() -4 ) System.out.print(name.charAt(i));
            else   System.out.print("*");
        }
    }
}
