import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class LineOne extends JPanel implements MouseListener, MouseMotionListener {
    private int x1, x2, y1, y2;

    private static String shape = "line";
    private static Color color;
    private static int strokwidth;

    public LineOne() {
        color = Color.orange;
        strokwidth = 5;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
        g2d.setColor(color);

        if (shape.equals("Line")) {
            Line2D l2d = new Line2D.Double(x1, y1, x2, y2);
            g2d.draw(l2d);
        } else if (shape.equals("Rect")) {
            int w = x2 - x1;
            int h = y2 - y1;
            Rectangle2D r2d = new Rectangle2D.Double(x1, y1, w, h);
            g2d.fill(r2d);
        } else if (shape.equals("Oval")) {
            int w = x2 - x1;
            int h = y2 - y1;
            Ellipse2D el2d = new Ellipse2D.Double(x1, y1, w, h);
            g2d.fill(el2d);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new LineOne());
        frame.setBounds(850, 100, 500, 500);

        JToolBar toolBar = new JToolBar();

        frame.getContentPane().add(toolBar, BorderLayout.NORTH);

        JToggleButton buttonLine = new JToggleButton("Line");
        JToggleButton buttonRect = new JToggleButton("Rect");
        JToggleButton buttonOval = new JToggleButton("Oval");

        buttonLine.addActionListener(e -> {
            shape = "Line";
        });
        buttonRect.addActionListener(e -> {
            shape = "Rect";
        });
        buttonOval.addActionListener(e -> {
            shape = "Oval";
        });

        ButtonGroup bg = new ButtonGroup();
        bg.add(buttonLine);
        bg.add(buttonRect);
        bg.add(buttonOval);

        toolBar.add(buttonLine);
        toolBar.add(buttonRect);
        toolBar.add(buttonOval);
        toolBar.addSeparator();

        JToggleButton bR = new JToggleButton();
        bR.setBackground(Color.red);
        bR.setPreferredSize(new Dimension(30, 30));

        JToggleButton bG = new JToggleButton();
        bG.setBackground(Color.green);
        bG.setPreferredSize(new Dimension(30, 30));

        JToggleButton bB = new JToggleButton();
        bB.setBackground(Color.BLUE);
        bB.setPreferredSize(new Dimension(30, 30));

        JToggleButton bP = new JToggleButton();
        bP.setBackground(Color.PINK);
        bP.setPreferredSize(new Dimension(30, 30));

        ButtonGroup bgC = new ButtonGroup();
        bgC.add(bR);
        bgC.add(bG);
        bgC.add(bB);
        bgC.add(bP);

        bR.addActionListener(e -> color = Color.red);
        bG.addActionListener(e -> color = Color.green);
        bB.addActionListener(e -> color = Color.BLUE);
        bP.addActionListener(e -> color = Color.PINK);

        toolBar.add(bR);
        toolBar.add(bG);
        toolBar.add(bB);
        toolBar.add(bP);
        toolBar.addSeparator();

        JTextField tf = new JTextField(strokwidth + "");
        tf.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {

            }


            public void keyPressed(KeyEvent e) {

            }


            public void keyReleased(KeyEvent e) {
                strokwidth = Integer.parseInt(tf.getText());
            }
        });
        toolBar.add(tf);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        this.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }


    @Override
    public void mouseExited(MouseEvent e) {

    }


    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}


