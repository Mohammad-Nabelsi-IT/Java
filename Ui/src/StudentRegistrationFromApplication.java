import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentRegistrationFromApplication extends JFrame {
    private JTextField textFieldPhone ,textFieldEmail;
    private  JTextField textFieldStudentName;
    private  JTextField textFieldStudentId;
    private JComboBox cb;
    private JList list;

    public StudentRegistrationFromApplication(String title) {
        super(title);
        this.setBounds(700, 100, 800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.PLAIN, 22);
        ImageIcon icon = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\education-cap.png");
        ImageIcon iconMale = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\hairstyle.png");
        ImageIcon iconFemale = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\" +
                "female-hair-shape-and-face-silhouette.png");
        this.setIconImage(icon.getImage());

        JPanel panelCenter = new JPanel(null);
        this.getContentPane().add(panelCenter);

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        JMenuItem menuItemNew = new JMenuItem("New");

        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.addActionListener(e -> System.exit(0));
        menu.add(menuItemNew);
        menu.addSeparator();
        menu.add(menuItemExit);
        panelCenter.add(menuBar);

        //////////////
        JLabel labelStudentName = new JLabel("Student Name :");
        labelStudentName.setFont(font);
        labelStudentName.setBounds(10, 20, 200, 50);
        panelCenter.add(labelStudentName);

        textFieldStudentName = new JTextField();
        textFieldStudentName.setFont(font);
        textFieldStudentName.setBounds(170, 30, 200, 30);
        panelCenter.add(textFieldStudentName);

        JLabel labelStudentId = new JLabel("Student Id :");
        labelStudentId.setFont(font);
        labelStudentId.setBounds(10, 70, 200, 50);
        panelCenter.add(labelStudentId);

        textFieldStudentId = new JTextField();
        textFieldStudentId.setFont(font);
        textFieldStudentId.setBounds(170, 80, 200, 30);
        panelCenter.add(textFieldStudentId);

        JLabel labelEmail = new JLabel("Emai :");
        labelEmail.setFont(font);
        labelEmail.setBounds(10, 120, 200, 50);
        panelCenter.add(labelEmail);

        textFieldEmail = new JTextField();
        textFieldEmail.setFont(font);
        textFieldEmail.setBounds(170, 130, 200, 30);
        panelCenter.add(textFieldEmail);

        JLabel labelPhone = new JLabel("Phone :");
        labelPhone.setFont(font);
        labelPhone.setBounds(10, 170, 200, 50);
        panelCenter.add(labelPhone);

        textFieldPhone = new JTextField();
        textFieldPhone.setFont(font);
        textFieldPhone.setBounds(170, 180, 200, 30);
        panelCenter.add(textFieldPhone);

        JLabel labelGender = new JLabel("Gender :");
        labelGender.setFont(font);
        labelGender.setBounds(10, 220, 200, 50);
        panelCenter.add(labelGender);

        JRadioButton radioButtonMale = new JRadioButton("Male");
        radioButtonMale.setFont(font);
        radioButtonMale.setIcon(iconMale);
        radioButtonMale.setBounds(170, 230, 100, 30);
        panelCenter.add(radioButtonMale);

        JRadioButton radioButtonFemale = new JRadioButton("Female");
        radioButtonFemale.setFont(font);
        radioButtonFemale.setIcon(iconFemale);
        radioButtonFemale.setBounds(300, 230, 130, 30);
        panelCenter.add(radioButtonFemale);

        ButtonGroup genderBG = new ButtonGroup();
        genderBG.add(radioButtonMale);
        genderBG.add(radioButtonFemale);

        JLabel labelCourses = new JLabel("Courses :");
        labelCourses.setFont(font);
        labelCourses.setBounds(10, 270, 200, 50);
        panelCenter.add(labelCourses);

        String cours[] = {"Mathematics ", "Science ", "Literature "};
        JCheckBox[] checkBoxCours = new JCheckBox[cours.length];
        int y = 0;
        for (int i = 0; i < cours.length; i++) {
            checkBoxCours[i] = new JCheckBox(cours[i]);
            checkBoxCours[i].setFont(font);
            checkBoxCours[i].setBounds(170, 270 + y, 200, 50);
            y += 35;
            panelCenter.add(checkBoxCours[i]);
        }

        JLabel labelYearOfStudy = new JLabel("Year of Study :");
        labelYearOfStudy.setFont(font);
        labelYearOfStudy.setBounds(10, 380, 200, 50);
        panelCenter.add(labelYearOfStudy);

        JPanel panelSouth = new JPanel();
        panelSouth.setBackground(Color.ORANGE);
        this.getContentPane().add(panelSouth, BorderLayout.SOUTH);

        JButton buttonRegister = new JButton("Register");
        buttonRegister.setFont(font);
        buttonRegister.setBounds(100, 440, 200, 30);
        buttonRegister.addActionListener(e -> {
            String data = "Student Name :" + textFieldStudentName.getText() + " " +
                    "\nStudent Id :" + textFieldStudentId.getText() + " " +
                    "\nPhone :" + textFieldPhone.getText() + " " +
                    "\nEmail :" + textFieldEmail.getText() + " ";
            String gender = "";
            if (radioButtonMale.isSelected()) {
                gender += radioButtonMale.getText();
            } else {
                gender += radioButtonFemale.getText();
            }
            data += "\nGendeer :" + gender;
            data += "\nCourses :";
            for (JCheckBox cb : checkBoxCours)
                if (cb.isSelected()) data += cb.getText();
            data += "\nYear :" + cb.getSelectedItem();
            data+= "\nColors :"+list.getSelectedValuesList();
            JOptionPane.showMessageDialog(null, data);
        });


        panelSouth.add(buttonRegister);

        JButton buttonClear = new JButton("Clear");
        buttonClear.addActionListener(e -> {
            clearFrame();
        });
        buttonClear.setFont(font);
        buttonClear.setBounds(380, 440, 200, 30);
        panelSouth.add(buttonClear);


        menuItemNew.addActionListener(e -> {
            clearFrame();
        });

        String yaer[] = {"", "First Year", "Second Year", "Third Year", "Fourth Year"};
        cb = new JComboBox(yaer);
        cb.setBackground(Color.ORANGE);
        cb.setFont(font);
        cb.setBounds(180, 390, 200, 30);
        panelCenter.add(cb);

        JButton buttonShow = new JButton("Show");
        buttonShow.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,
                    cb.getSelectedIndex() + " " + cb.getSelectedItem());
        });
        buttonShow.setFont(font);
        buttonShow.setBounds(390, 390, 100, 30);
        buttonShow.setBackground(Color.GREEN);
        panelCenter.add(buttonShow);

        String color[] = {" Red ", " Black ", " White ", " Blue "};
        list = new JList(color);
        list.setFont(font);
        list.setBounds(500, 30, 100, 130);
        list.setBackground(Color.cyan);
        panelCenter.add(list);

        buttonShow.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,
                    cb.getSelectedIndex() + " " + cb.getSelectedItem());
            JOptionPane.showMessageDialog(null,
                    Arrays.toString(list.getSelectedIndices()) + " " + list.getSelectedValuesList());
        });

    }

    void clearFrame(){
        textFieldStudentName.setText(null);
        textFieldStudentId.setText(null);
        textFieldEmail.setText(null);
        textFieldPhone.setText(null);
        list.clearSelection();
        cb.setSelectedIndex(0);
    }


    public static void main(String[] args) {
        StudentRegistrationFromApplication st = new StudentRegistrationFromApplication("S,R,F,A");
        st.setVisible(true);
    }


}
