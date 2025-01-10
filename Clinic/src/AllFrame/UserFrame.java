package AllFrame;

import javax.swing.*;

public class UserFrame extends JFrame {
    private JPanel panel1;
    private JPanel panelNorth;
    private JLabel labelUser;
    private JPanel panelWest;
    private JTextField textFieldName;
    private JTextField textFieldRole;
    private JTextField textFieldEmail;
    private JPasswordField passwordFieldPassword;
    private JLabel labelName;
    private JLabel labelRole;
    private JLabel labelEmail;
    private JLabel labelPassword;
    private JPanel panelSouth;
    private JButton buttonAdd;
    private JButton buttonClear;

    public UserFrame() {
        setBounds(100,150,400,400);
    }

}
