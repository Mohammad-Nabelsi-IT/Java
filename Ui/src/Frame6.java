import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame6 extends JFrame {
    public Frame6(String title) {
        super(title);
        this.setSize(600, 400);
        this.setLocation(500, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.getContentPane().setLayout(new GridLayout(2 ,2));

        JPanel panel2 = new JPanel(new FlowLayout());
        this.getContentPane().add(panel2);
        JButton button5 = new JButton("5");
        button5.addActionListener(e -> JOptionPane.showMessageDialog(null,"Hi5"));
        JButton button6 = new JButton("6");
        button6.addActionListener(e -> {
            button6.setText("Enter");
            button6.setBackground(Color.BLACK);
        });
        panel2.add(button5);
        panel2.add(button6);

        JPanel panel1 = new JPanel(new GridLayout(2, 1));
        this.getContentPane().add(panel1);
        JButton button1 = new JButton("1");
        button1.addActionListener(new MyAction());
        JButton button2 = new JButton("2");
        button2.addActionListener(new MyAction2());
        JButton button3 = new JButton("3");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hi3");
            }
        });
        JButton button4 = new JButton("4");
        button4.addActionListener(e -> JOptionPane.showMessageDialog(null,"Hi4"));
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);

        JPanel panel4=new JPanel(new BorderLayout());
        this.getContentPane().add(panel4);
        JTextField tf=new JTextField();
        tf.setFont(new Font("Arial",Font.PLAIN,30));
        panel4.add(tf,BorderLayout.NORTH);
        JButton button7=new JButton("7");
        JButton button8=new JButton("8");
        JButton button9=new JButton("9");
        JButton button10=new JButton("10");
        panel4.add(button7,BorderLayout.EAST);
        panel4.add(button8,BorderLayout.WEST);

        JPanel panel5=new JPanel(new GridLayout(1,2));
        JButton button11=new JButton("11");
        panel5.add(button9);
        panel5.add(button11);

        panel4.add(panel5,BorderLayout.SOUTH);
        panel4.add(button10);

        JPanel panel3=new JPanel(new GridLayout(4,1));
        this.getContentPane().add(panel3);
        JTextField textField1=new JTextField();
        textField1.setFont(new Font("Arial",Font.PLAIN,30));
        JTextField textField2=new JTextField();
        textField2.setFont(new Font("Arial",Font.PLAIN,30));
        JTextField textField3=new JTextField();
        textField3.setFont(new Font("Arial",Font.PLAIN,30));
        JTextField textField4=new JTextField();
        textField4.setFont(new Font("Arial",Font.PLAIN,30));
        panel3.add(textField1);
        panel3.add(textField2);
        panel3.add(textField3);
        panel3.add(textField4);




        this.setVisible(true);
    }

    public static void main(String[] args) {
        Frame6 frame6 = new Frame6("Movie");

    }
    class MyAction implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Hi");
        }
    }
    class MyAction2 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Hi2");
        }
    }
}
