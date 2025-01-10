import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLocation(300, 200);

        this.setVisible(true);
    }


    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyFrame frame1 = new MyFrame("Mohammad");
        frame1.setLocation(900, 200);
        MyFrame frame2 = new MyFrame("Berlin");
        frame2.setLocation(1000, 200);
    }
}
