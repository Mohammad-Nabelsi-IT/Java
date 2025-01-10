import java.util.Scanner;
import java.util.Stack;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Massage :");

        Stack stack = new Stack();
        String msg = scanner.nextLine();
        char[] c1 = msg.toCharArray();
        for (char c : c1) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }


        //        Stack stack = new Stack();
//        String msg = scanner.nextLine();
//        char[] c1 = msg.toCharArray();
//
//        for (char c : c1) {
//            stack.push(c);
//        }
//        while (!stack.isEmpty()) {
//            System.out.print(stack.pop());
//        }


//
//        String name = "Hello World!";
//        String reversedString = new StringBuilder(name).reverse().toString();
//        System.out.println(reversedString);

//--------------------------------------------------------------------------------
        // String name = "Hello World!";
//        char [] stackCharArray= stack.toArray();
//        String reversedString = "";
//
//        for(int i = stackCharArray.length - 1; i >= 0; i--) {
//            reversedString += stackCharArray[i];
//        }
//
//        System.out.println(reversedString);


    }

}
