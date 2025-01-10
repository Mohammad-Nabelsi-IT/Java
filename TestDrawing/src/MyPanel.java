import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class MyPanel extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(Color.cyan);
        Rectangle rect = new Rectangle (100, 50, 300, 150);
        g2d.fill(rect);
        g2d.setColor(Color.RED);
        g2d.draw(rect);






//        g2d.setColor(Color.RED);
//        g2d.draw(r2d);
//        Ellipse2D eld =new Ellipse2D.Double(100,300,200,200) ;
//        g2d.fill(eld);
//        g2d.draw(eld);

    }

}

