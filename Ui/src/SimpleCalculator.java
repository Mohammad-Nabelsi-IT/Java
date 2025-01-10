import javax.swing.*;
import java.awt.*;

public class SimpleCalculator extends JFrame {


    public SimpleCalculator(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocation(500, 200);


        // 2 ///////////////////////////////////////

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu menu = new JMenu("Option");
        menuBar.add(menu);

        JMenuItem menuItemHelp = new JMenuItem("Help");
        menuItemHelp.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Contact Service");
        });
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.addActionListener(e -> System.exit(0));

        menu.add(menuItemHelp);
        menu.add(menuItemExit);

        // 3 ///////////////////////////////

        JPanel panelNorth = new JPanel(new BorderLayout());
        this.getContentPane().add(panelNorth, BorderLayout.NORTH);

        JLabel labelCalculator = new JLabel("Calculator");
        panelNorth.add(labelCalculator, BorderLayout.CENTER);

        // 4 ///////////////////////////////

        JPanel panelCenter = new JPanel();
        this.getContentPane().add(panelCenter, FlowLayout.CENTER);

        JTextField textField1 = new JTextField();
        textField1.setFont(new Font("Arial", Font.BOLD, 30));
        textField1.setBackground(Color.ORANGE);
        textField1.setPreferredSize(new Dimension(100, 30));
        JTextField textField2 = new JTextField();
        textField2.setFont(new Font("Arial", Font.BOLD, 30));
        textField2.setBackground(Color.ORANGE);
        textField2.setPreferredSize(new Dimension(100, 30));

        panelCenter.add(textField1);
        JLabel labelPlus = new JLabel("+");
        panelCenter.add(labelPlus);
        panelCenter.add(textField2);

        JLabel labelequal = new JLabel("=");
        panelCenter.add(labelequal);

        JTextField textFieldResult = new JTextField();
        textFieldResult.setFont(new Font("Arial", Font.BOLD, 30));
        textFieldResult.setBackground(Color.WHITE);
        textFieldResult.setPreferredSize(new Dimension(100, 30));
        textFieldResult.setEditable(false);
        panelCenter.add(textFieldResult);

        // 5 ////////////////////////////////

        JPanel panelSouth = new JPanel(null);
        panelSouth.setPreferredSize(new Dimension(400, 50));
        this.getContentPane().add(panelSouth, BorderLayout.SOUTH);

        JButton buttonCalculate = new JButton("Calculate");
        buttonCalculate.addActionListener(e -> {
            double txt1 = Double.parseDouble(textField1.getText());
            double txt2 = Double.parseDouble(textField2.getText());
            double result = txt1 + txt2;
            textFieldResult.setText(String.valueOf(result));
        });
        buttonCalculate.setBounds(50, 10, 100, 30);
        JButton buttonClear = new JButton("Clear");
        buttonClear.addActionListener(e -> {
            textField1.setText(null);
            textField2.setText(null);
            textFieldResult.setText(null);
        });
        buttonClear.setBounds(160, 10, 100, 30);

        panelSouth.add(buttonCalculate);
        panelSouth.add(buttonClear);

        // 6 ////////////////////////


    }


    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator("Test");
        sc.setVisible(true);
    }

}
