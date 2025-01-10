import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Clock extends JPanel implements Runnable {

    private JLabel labelClock;
    private JPanel panelClock;

    public Clock() throws FontFormatException {
        panelClock = this;

        labelClock = new JLabel();
        labelClock.setForeground(Color.orange);

        labelClock.setFont(new Font("Thoma", Font.PLAIN, 40));

        add(labelClock);
        panelClock.setBackground(Color.black);

        Thread t1 = new Thread(this);
        Thread t2 = new Thread(new ColorThread());

        t1.start();
        t2.start();
    }

    public static void main(String[] args) throws FontFormatException {
        JFrame frame = new JFrame();
        frame.setBounds(1340, 725, 200, 100);
        frame.getContentPane().add(new Clock());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH,mm,ss");
        while (true) {
            labelClock.setText(sdf.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    class ColorThread implements Runnable {

        @Override
        public void run() {
            Random random = new Random();
            while (true) {
                int r = random.nextInt(255);
                int g = random.nextInt(255);
                int b = random.nextInt(255);

                panelClock.setBackground(new Color(r, g, b));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
