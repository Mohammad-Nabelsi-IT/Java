import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionListener;

public class MouseEvent extends JFrame {
    private JLabel label;
    private JPanel panel;

    public MouseEvent(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 150, 600, 550);
        label = new JLabel("Result here");
        label.setFont(new Font("Arial", Font.PLAIN, 30));
        this.getContentPane().add(label, BorderLayout.NORTH);
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);
        panel.addMouseMotionListener(new MouseHandler());

        // this.setVisible(true);
    }

    public static void main(String[] args) {
        MouseEvent mouseEvent = new MouseEvent("Test");
        mouseEvent.setVisible(true);
    }

    class MouseHandler implements MouseMotionListener {

        public void mouseDragged(java.awt.event.MouseEvent e) {

        }

        public void mouseMoved(java.awt.event.MouseEvent e) {
            label.setText("X=" + e.getX() + "," + " Y=" + e.getY());
            int x = e.getX() / 2;
            int y = e.getY() / 2;
            if (x > 255) {
                x = 255;
            }
            if (y > 255) {
                y = 255;
            }
            panel.setBackground(new Color(x, y, 100));
        }
    }
}
