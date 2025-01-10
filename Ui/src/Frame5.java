import javax.swing.*;
import java.awt.*;

public class Frame5 extends JFrame {
    public Frame5(String title) {
        super(title);
        this.setSize(500, 400);
        this.setLocation(400, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("One");
        JButton button2 = new JButton("Tow");
        JButton button3 = new JButton("Three");
        JButton button4 = new JButton("Four");
        JButton button5 = new JButton("Five");
        JButton button6 = new JButton("Six");
        JButton button7 = new JButton("Seven");
        JButton button8 = new JButton("Eight");

        this.getContentPane().add(button1, BorderLayout.NORTH);
        this.getContentPane().add(button2, BorderLayout.WEST);
        this.getContentPane().add(button3, BorderLayout.CENTER);

        JPanel eastPanel = new JPanel(new GridLayout(2, 2));

        eastPanel.add(button4);
        eastPanel.add(button5);
        eastPanel.add(button6);
        this.getContentPane().add(eastPanel, BorderLayout.EAST);
        JPanel sPanel = new JPanel(new GridLayout(1, 2));
        this.getContentPane().add(sPanel, BorderLayout.SOUTH);
        sPanel.add(button7);
        sPanel.add(button8);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Frame5 frame5 = new Frame5("JAVA");
    }
}
