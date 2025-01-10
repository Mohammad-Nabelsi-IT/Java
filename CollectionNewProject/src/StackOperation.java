import java.util.Objects;
import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());
        if (!stack.empty()) {
            System.out.println(stack.empty());
        }
        System.out.println(stack.peek());
        System.out.println(stack.search(30));

    }
}
