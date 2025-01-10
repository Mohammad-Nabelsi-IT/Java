import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your password");
        String pass = scanner.next();


//        for (int i = 0; i < pass.length() - 4; i++) {
//            System.out.print("*");
//        }
//        for (int i = pass.length()-4; i <pass.length(); i++) {
//            System.out.print(pass.charAt(i));
//        }
        for (int i = 0; i <pass.length() ; i++) {
            if (i<2){
                System.out.print(pass.charAt(i));
            } else if (i>= pass.length()-4) {
                System.out.print(pass.charAt(i));
            } else {
                System.out.print("X");
            }
        }



    }
}
