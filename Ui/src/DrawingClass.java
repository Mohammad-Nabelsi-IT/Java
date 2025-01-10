import javax.swing.*;
import java.awt.*;

public class DrawingClass extends JFrame {
    public DrawingClass(String title) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(500, 100, 600, 600);
        this.getContentPane().add(new myPanel());
    }

    public static void main(String[] args) {
        DrawingClass dc = new DrawingClass("Test");
        dc.setVisible(true);
    }
}

class myPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(100, 100, 250, 100);
        g.drawRect(50, 200, 200, 100);
       g.fillOval(300,100,100,200);
        g.setColor(Color.orange);
        g.fillOval(80, 300, 200, 200);
        g.setColor(Color.pink);
        g.fillRect(300, 300, 200, 200);



    }
}

