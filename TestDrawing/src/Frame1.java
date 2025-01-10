import javax.swing.*;


public class Frame1 extends JFrame {
    public Frame1() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(950, 100, 500, 500);
        getContentPane().add(new MyPanel());
    }

    public static void main(String[] args) {
        new Frame1().setVisible(true);
    }

}
