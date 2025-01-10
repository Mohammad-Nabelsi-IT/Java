import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class Frame4 extends JFrame {
    public Frame4(String title) {
        super(title);
        this.setSize(460, 340);
        this.setLocation(500, 200);
        this.setDefaultCloseOperation(Frame3.EXIT_ON_CLOSE);
        this.setLayout(null);
        Font bFont = new Font("Arial", Font.BOLD, 20);
        Border br = BorderFactory.createLineBorder(Color.red, 30, true);

        JButton button1 = new JButton("One");
        button1.addActionListener(e -> {
            button1.setLocation(button1.getX()+5,button1.getY());
        });


        button1.setBorder(br);
        button1.setFont(bFont);
        button1.setBounds(30, 30, 100, 100);
        button1.setBackground(Color.GREEN);

        JButton button2 = new JButton("Tow");
        button2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.BLUE, Color.black));
        button2.setFont(bFont);
        button2.setBounds(160, 30, 130, 100);
        button2.setBackground(Color.cyan);
        button2.addActionListener(e -> {
            button1.setLocation(button1.getX()-5,button1.getY());
        });
        JButton button3 = new JButton("Three");
        button3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.BLUE, Color.black));
        button3.setForeground(Color.RED);
        button3.setFont(bFont);
        button3.setBackground(Color.YELLOW);
        button3.setBounds(320, 30, 100, 100);

        JButton button4 = new JButton("||");
        button4.addActionListener(e -> {
            button1.setLocation(button1.getX(),button1.getY()+5);
        });
        button4.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.BLUE, Color.black));
        button4.setFont(bFont);
        button4.setForeground(Color.WHITE);
        button4.setBackground(Color.BLUE);
        button4.setBounds(30, 160, 100, 100);

        JButton button5 = new JButton("Five");
        button5.setFont(bFont);
        button5.setForeground(Color.WHITE);
        button5.setBackground(Color.BLUE);
        button5.setBounds(160, 160, 130, 100);

        JButton button6 = new JButton("∆");
        button6.addActionListener(e -> {
            button1.setLocation(button1.getX(),button1.getY()-5);
        });
        button6.setForeground(Color.RED);
        button6.setFont(bFont);
        button6.setBackground(Color.YELLOW);
        button6.setBounds(320, 160, 100, 100);
        this.getContentPane().add(button1);
        this.getContentPane().add(button2);
        this.getContentPane().add(button3);
        this.getContentPane().add(button4);
        this.getContentPane().add(button5);
        this.getContentPane().add(button6);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        Frame4 frame4 = new Frame4("Java");
    }
}
