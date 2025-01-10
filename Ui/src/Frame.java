import javax.swing.*;
import java.awt.*;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setSize(400, 400);
        JLabel label = new JLabel("Welcome to Java");
        JButton button1 = new JButton("click me");
        JButton button2 = new JButton("=");
        JButton button3 = new JButton("+");

        JTextField textField = new JTextField();

        frame.getContentPane().add(label, BorderLayout.NORTH);
        frame.getContentPane().add(button3, BorderLayout.SOUTH);
        frame.getContentPane().add(button1, BorderLayout.EAST);
        frame.getContentPane().add(button2, BorderLayout.WEST);
        frame.getContentPane().add(textField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
