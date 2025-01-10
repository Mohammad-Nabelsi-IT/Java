import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Banner extends JFrame implements Runnable {
    private JLabel labelBanner;
    private JLabel labelText;
    private JLabel labelClock;

    public Banner(String title) {
        super(title);

        // this.setBounds(500, 100, 600, 500);

        ImageIcon imageIcon = new ImageIcon("Images/1.png");

        labelBanner = new JLabel(imageIcon);

        this.getContentPane().add(labelBanner, BorderLayout.CENTER);
        labelBanner.setPreferredSize(new Dimension(1200, 300));

        //labelText.setPreferredSize(new Dimension(1200, 300));

        labelText = new JLabel("E60");
        labelText.setFont(new Font("Arial", Font.BOLD, 70));
        labelText.setHorizontalAlignment(SwingConstants.CENTER);
        labelText.setForeground(Color.orange);
        this.getContentPane().add(labelText, BorderLayout.SOUTH);

        labelClock = new JLabel();
        labelClock.setFont(new Font("Arial", Font.BOLD, 50));
        labelClock.setPreferredSize(new Dimension(800, 100));

        labelClock.setHorizontalAlignment(SwingConstants.CENTER);
        labelClock.setBackground(Color.black);
        labelClock.setForeground(Color.orange);
        getContentPane().add(labelClock, BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();

        Thread t = new Thread(this);
        Thread t2 = new Thread(new clock());
        t.start();
        t2.start();
        getContentPane().setBackground(Color.black);

    }

    public static void main(String[] args) {
        new Banner("Banner").setVisible(true);
    }

    @Override
    public void run() {
        int sleepTime[] = {1000, 1000, 1000, 1000};
        String text[] = {"E60", "X7", "X5", "850i"};
        ImageIcon[] images = {
                new ImageIcon("Images/1.png"),
                new ImageIcon("Images/2.png"),
                new ImageIcon("Images/3.png"),
                new ImageIcon("Images/4.png")

        };
        Random random = new Random();
        while (true) {
            labelBanner.setIcon(images[random.nextInt(4)]);
            int r = random.nextInt(4);
            labelBanner.setIcon(images[r]);
            labelText.setText(text[r]);

            try {
                Thread.sleep(sleepTime[r]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    class clock implements Runnable {
        public void run() {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            while (true) {

                labelClock.setText(sdf.format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}