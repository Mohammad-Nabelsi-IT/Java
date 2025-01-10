import javax.swing.*;
import java.awt.*;

public class DrawingClass2 extends JPanel {
    protected void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(100, 100, 250, 100);
        g.drawRect(50, 200, 200, 100);
        g.fillOval(300, 100, 100, 200);
        g.setColor(Color.orange);
        g.fillOval(80, 300, 200, 200);
        g.setColor(Color.pink);
        g.fillRect(300, 300, 200, 200);
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("Test2");
        frame.setBounds(400,100,500,500);
        frame.getContentPane().add(new DrawingClass2());
        frame.setVisible(true);
    }
}
