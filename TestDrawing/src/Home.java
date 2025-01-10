import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class Home extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
        g2d.setColor(Color.red);
        Rectangle2D rectangle2D1 = new Rectangle2D.Double(100, 240, 500, 400);
        g2d.draw(rectangle2D1);
        g2d.setColor(Color.cyan);
        g2d.fill(rectangle2D1);
        Rectangle2D rectangle2D2 = new Rectangle2D.Double(170, 300, 100, 100);
        g2d.setColor(Color.black);
        g2d.draw(rectangle2D2);
        g2d.setColor(Color.orange);
        g2d.fill(rectangle2D2);

        Rectangle2D rectangle2D3 = new Rectangle2D.Double(420, 300, 100, 100);
        g2d.setColor(Color.black);
        g2d.draw(rectangle2D3);
        g2d.setColor(Color.orange);
        g2d.fill(rectangle2D3);


        Rectangle2D rectangle2D4 = new Rectangle2D.Double(295, 430, 100, 200);
        g2d.setColor(Color.black);
        g2d.draw(rectangle2D4);
        g2d.setColor(Color.orange);
        g2d.fill(rectangle2D4);

        Ellipse2D ellipse2D = new Ellipse2D.Double(-100, -100, 200, 200);
        g2d.setColor(Color.orange);
        g2d.draw(ellipse2D);
        g2d.setColor(Color.yellow);
        g2d.fill(ellipse2D);

        Path2D pt2D = new Path2D.Double();
        pt2D.moveTo(100, 240);
        pt2D.lineTo(350, 100);
        pt2D.lineTo(600,240);
        pt2D.closePath();
        g2d.setColor(Color.black);
        g2d.draw(pt2D);
        g2d.setColor(Color.orange);
        g2d.fill(pt2D);


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new Home());
        frame.setBounds(850, 100, 700, 700);
        frame.setVisible(true);
    }
}
