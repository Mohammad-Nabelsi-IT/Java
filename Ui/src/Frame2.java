import javax.swing.*;
import java.awt.*;

public class Frame2 extends JFrame {
    public Frame2(String title) {
        super(title);
        this.setSize(500, 500);
        this.setLocation(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button1 = new JButton("One");
        button1.setBackground(Color.YELLOW);
        JButton button2 = new JButton("Tow");
        button2.setBackground(Color.cyan);
        JButton button3 = new JButton("Three");
        button3.setBackground(Color.GRAY);
        button3.setForeground(Color.red);
        JButton button4 = new JButton("Four");
        button4.setBackground(Color.GREEN);
        JButton button5 = new JButton("Five");
        button5.setBackground(new Color(100, 150, 100));
        button5.setForeground(Color.WHITE);
        this.getContentPane().setBackground(Color.pink);
        this.getContentPane().add(button1);
        this.getContentPane().add(button2);
        this.getContentPane().add(button3);
        this.getContentPane().add(button4);
        this.getContentPane().add(button5);
        setVisible(true);
    }

    public static void main(String[] args) {
        Frame2 frame2 = new Frame2("Formula1");
    }
}
