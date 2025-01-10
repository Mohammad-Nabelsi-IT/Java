import javax.swing.*;
import java.awt.*;

public class Frame3 extends JFrame {
    public Frame3(String title) {
        super(title);
        this.setSize(500, 500);
        this.setLocation(500, 200);
        this.setDefaultCloseOperation(Frame3.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 2, 20, 10));

        JButton button1 = new JButton("One");
        JButton button2 = new JButton("Tow");
        JButton button3 = new JButton("Three");
        JButton button4 = new JButton("Four");
        JButton button5 = new JButton("Five");
        JButton button6 = new JButton("Six");
        this.getContentPane().add(button1);
        this.getContentPane().add(button2);
        this.getContentPane().add(button3);
        this.getContentPane().add(button4);
        this.getContentPane().add(button5);
        this.getContentPane().add(button6);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Frame3 frame3 = new Frame3("Asphalt");
    }
}
