import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.concurrent.ExecutionException;

public class MyPanel extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3));
        Rectangle2D r2d = new Rectangle2D.Float(100, 50, 300, 200);
        g2d.setColor(Color.RED);
        g2d.draw(r2d);
        Ellipse2D eld =new Ellipse2D.Double(100,300,200,200) ;
        g2d.draw(eld);

    }

}

