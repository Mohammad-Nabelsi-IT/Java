import javax.swing.*;
import java.awt.*;

public class Frame1 extends JFrame {
    public Frame1(String title) {
        super(title);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(500, 200);

        JButton button1 = new JButton("One");
        JButton button2 = new JButton("Tow");
        JButton button3 = new JButton("Three");
        JButton button4 = new JButton("Four");
        JButton button5 = new JButton("Five");

        this.getContentPane().add(button1, BorderLayout.NORTH);
        this.getContentPane().add(button2, BorderLayout.WEST);
        this.getContentPane().add(button3, BorderLayout.EAST);
        this.getContentPane().add(button4, BorderLayout.SOUTH);
        this.getContentPane().add(button5);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        Frame1 frame1 = new Frame1("Game");

    }
}
