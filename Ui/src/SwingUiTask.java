import javax.swing.*;
import java.awt.*;

public class SwingUiTask extends JFrame {
    private JTextField textField;
    private JTextField textFieldStatus;

    public SwingUiTask(String title) {
        super(title);
        this.setSize(600, 400);
        this.setLocation(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("File");
        JMenu menuEdit = new JMenu("Edit");

        menuBar.add(menuFile);
        menuBar.add(menuEdit);


        JMenuItem menuItemNew = new JMenuItem("New");
        menuItemNew.addActionListener(e -> {
            textField.setText(null);
        });
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.addActionListener(e -> System.exit(0));
        JMenuItem menuItemCut = new JMenuItem("Cut");
        menuItemCut.addActionListener(e -> textField.cut());
        JMenuItem menuItemPaste = new JMenuItem("Paste");
        menuItemPaste.addActionListener(e -> textField.paste());

        menuFile.add(menuItemNew);
        menuFile.addSeparator();
        menuFile.add(menuItemExit);
        menuEdit.add(menuItemCut);
        menuEdit.addSeparator();
        menuEdit.add(menuItemPaste);

        //////////////////////////////

        JPanel panel = new JPanel(new BorderLayout());
        this.getContentPane().add(panel, BorderLayout.NORTH);

        JLabel label = new JLabel("Welcome to the Swing UI Design Task");
        panel.add(label);

        JPanel panel1 = new JPanel();
        this.getContentPane().add(panel1, BorderLayout.CENTER);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 30));
        panel1.add(textField);
        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.addActionListener(e -> JOptionPane.showMessageDialog(null, textField.getText()));
        panel1.add(buttonSubmit);
        JButton buttonClear = new JButton("Clear");
        buttonClear.addActionListener(e -> {
            textField.setText(null);
            textFieldStatus.setText(null);
        });
        panel1.add(buttonClear);

        JPanel panelSouth = new JPanel(null);
        this.getContentPane().add(panelSouth, BorderLayout.SOUTH);
        panelSouth.setPreferredSize(new Dimension(200, 40));
//        panelSouth.setBackground(Color.ORANGE);

        JLabel labelStatus = new JLabel("Status");
        labelStatus.setBounds(10, 10, 100, 20);
        textFieldStatus = new JTextField();
        textFieldStatus.setBounds(60, 10, 400, 20);
//
        panelSouth.add(labelStatus);
        panelSouth.add(textFieldStatus);
    }


    public static void main(String[] args) {
        SwingUiTask ui = new SwingUiTask("Swing Ui Design Task");
        ui.setVisible(true);
    }
}
