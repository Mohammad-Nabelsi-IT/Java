import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class AnimatedCircles extends JPanel implements Runnable {
    private int x = 0; // Circle's x-coordinate
    private int y = 100; // Circle's y-coordinate
    private int radius = 100; // Circle's radius
    private Color color = Color.BLUE;

    public AnimatedCircles() {
        setPreferredSize(new Dimension(800, 600));
        new Thread(this).start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {

            x = random.nextInt(500);
            y = random.nextInt(400);
            radius = random.nextInt(150);

            color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
            repaint();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animated Circles");
        AnimatedCircles animatedCircles = new AnimatedCircles();
        frame.add(animatedCircles);
        frame.setBounds(400, 150, 600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
