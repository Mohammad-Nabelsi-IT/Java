import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import javax.swing.*;
import java.util.Stack;

public class StackOne {
    public static void main(String[] args) {
        Stack stack =new Stack();
        stack.push("BMW");
        stack.push("Audi");
        stack.push("BYD");
        stack.push(100);
        stack.push("Porsche");
        System.out.println(stack.search("Porsche"));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());

        JButton button=new JButton("Exit");
        Stack<JButton> stack1= new Stack<>();
        stack1.push(button);
//        System.out.println(stack1.pop().getText());
//        System.out.println(stack1.peek());

        stack1.push(new JButton("tool"));
        //System.out.println(stack1.pop().getText());


    }
}
