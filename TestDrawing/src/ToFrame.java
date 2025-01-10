import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class ToFrame extends JPanel {

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
        g2d.setColor(Color.red);
//        Rectangle2D rectangle2D1 = new Rectangle2D.Double(50, 20, 300, 300);
//        g2d.draw(rectangle2D1);
//        g2d.setColor(Color.GREEN);
//        g2d.fill(rectangle2D1);
//
//        Rectangle2D rectangle2D2 = new Rectangle2D.Double(450, 20, 300, 300);
//        g2d.setColor(Color.red);
//        g2d.draw(rectangle2D2);
//        g2d.setColor(Color.GREEN);
//        g2d.fill(rectangle2D2);


        Path2D pt1 = new Path2D.Double();
        pt1.moveTo(50, 150);
        pt1.lineTo(200, 30);
        pt1.lineTo(350, 150);
        pt1.lineTo(300, 310);
        pt1.lineTo(110, 310);
        pt1.closePath();
        g2d.setColor(Color.black);
        g2d.draw(pt1);
        g2d.setColor(Color.orange);
        g2d.fill(pt1);

        Path2D pt2 = new Path2D.Double();
        pt2.moveTo(450, 110);
        pt2.lineTo(600, 20);
        pt2.lineTo(750, 110);
        pt2.lineTo(750, 250);
        pt2.lineTo(600, 330);
        pt2.lineTo(450, 250);
        pt2.closePath();
        g2d.setColor(Color.black);
        g2d.draw(pt2);
        g2d.setColor(Color.cyan);
        g2d.fill(pt2);


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new ToFrame());
        frame.setBounds(550, 100, 900, 400);
        frame.setVisible(true);
    }
}
