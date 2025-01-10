import AllFrame.MainFrame;
import DB.DBConfig;
import DB.Patient;
import DB.Users;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Login extends JFrame {

    public Login(String title) {
        setTitle("Login...");
        setBounds(600, 300, 500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JLabel labelEmail = new JLabel("Email");
        JLabel labelPas = new JLabel("Password");

        JTextField textFieldEmail = new JTextField("admin@gmail.com");
        textFieldEmail.setPreferredSize(new Dimension(250, 30));
        JPasswordField passwordField = new JPasswordField("123");
        passwordField.setPreferredSize(new Dimension(250, 30));
        JButton buttonLogin = new JButton("Login");

        c.insets = new Insets(10, 10, 10, 10);

        c.gridx = 0;
        c.gridy = 0;
        add(labelEmail, c);
        c.gridx = 1;
        c.gridy = 0;
        add(textFieldEmail, c);

        c.gridx = 0;
        c.gridy = 1;
        add(labelPas, c);
        c.gridx = 1;
        c.gridy = 1;
        add(passwordField, c);

        c.gridx = 1;
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(buttonLogin, c);

        JLabel labelMassage = new JLabel();
        labelMassage.setForeground(Color.red);
        c.gridx = 1;
        c.gridy = 3;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(labelMassage, c);

        buttonLogin.addActionListener(e -> {
            // check email and password

            String email = textFieldEmail.getText().trim();
            String pas = passwordField.getText();
            if (email.isEmpty() || pas.isEmpty()) {
                labelMassage.setText("Email and password cannot be empty!");
                return;
            }
            Users authenticatedUser;
            authenticatedUser = authenticateUser(email, pas);
            if (authenticatedUser != null) {
                labelMassage.setText("");

                MainFrame mainFrame = new MainFrame(authenticatedUser);
                mainFrame.pack();
                mainFrame.setVisible(true);
                this.setVisible(false);

            } else {
                labelMassage.setText("Invalid email or password.");
            }
        });
    }

private Users authenticateUser(String email, String password) {
    String sql = "SELECT id, name, email, password FROM users WHERE email = ? AND password = ?";
    try  {
        Connection connection = DBConfig.createConnection();
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, email);
        st.setString(2, password);
        ResultSet resultSet;
        resultSet = st.executeQuery();
        if (resultSet.next()) {
            Users user = new Users();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setEmail(resultSet.getString("email"));
            user.setPassword(resultSet.getString("password"));
            return user;
        }
    } catch (SQLException e) {

    }

    return null;


}

public static void main(String[] args) {

    Login login = new Login("Login...");
    login.setVisible(true);


}

}


