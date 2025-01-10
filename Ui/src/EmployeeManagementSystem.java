import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class EmployeeManagementSystem extends JFrame {
    private JTextField textFieldDisplay;
    private DefaultTableModel dtm;
    private JTextField textFieldName;
    private JTextField textFieldPhone;
    private JTextField textFieldDepartment;
    private JRadioButton radioButtonMale;
    private JRadioButton radioButtonFemale;
    private JComboBox cb;
    private JList list;
    private JButton buttonAddEmployee;
    private JButton buttonClear;
    private JButton buttonSave;
    private ButtonGroup bg;

    public EmployeeManagementSystem(String title) {
        super(title);
        this.setBounds(500, 10, 900, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.PLAIN, 18);
        ImageIcon icon = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\employee.png");
        this.setIconImage(icon.getImage());

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu menuOption = new JMenu("Option");
        menuBar.add(menuOption);

        JMenuItem menuItemNewEmployee = new JMenuItem("New Employee");

        menuItemNewEmployee.addActionListener(e -> {
            Delete();
        });
        menuOption.add(menuItemNewEmployee);

        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.addActionListener(e -> System.exit(0));
        menuOption.add(menuItemExit);

        JPanel panelWest = new JPanel(null);
        panelWest.setPreferredSize(new Dimension(450, 600));
        this.getContentPane().add(panelWest, BorderLayout.WEST);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(font);
        labelName.setBounds(10, 10, 200, 50);
        panelWest.add(labelName);

        textFieldName = new JTextField();
        textFieldName.setBounds(120, 25, 200, 30);
        panelWest.add(textFieldName);

        JLabel labelPhone = new JLabel("Phone :");
        labelPhone.setFont(font);
        labelPhone.setBounds(10, 60, 200, 50);
        panelWest.add(labelPhone);

        textFieldPhone = new JTextField();
        textFieldPhone.setBounds(120, 75, 200, 30);
        panelWest.add(textFieldPhone);

        JLabel labelDepartment = new JLabel("Department :");
        labelDepartment.setFont(font);
        labelDepartment.setBounds(10, 110, 200, 50);
        panelWest.add(labelDepartment);

        textFieldDepartment = new JTextField();
        textFieldDepartment.setBounds(120, 120, 200, 30);
        panelWest.add(textFieldDepartment);

        JLabel labelGender = new JLabel("Gender :");
        labelGender.setFont(font);
        labelGender.setBounds(10, 160, 200, 50);
        panelWest.add(labelGender);

        radioButtonMale = new JRadioButton("Male");
        radioButtonMale.setFont(font);
        radioButtonMale.setBounds(120, 170, 100, 30);
        panelWest.add(radioButtonMale);

        radioButtonFemale = new JRadioButton("Female");
        radioButtonFemale.setFont(font);
        radioButtonFemale.setBounds(230, 170, 100, 30);
        panelWest.add(radioButtonFemale);

        bg = new ButtonGroup();
        bg.add(radioButtonMale);
        bg.add(radioButtonFemale);


        JLabel labelPosition = new JLabel("Position :");
        labelPosition.setFont(font);
        labelPosition.setBounds(10, 210, 200, 50);
        panelWest.add(labelPosition);

        String Position[] = {"", "Manager", "Developer", "Designer", "Tester", "HR"};
        cb = new JComboBox(Position);
        cb.setFont(font);
        cb.setBounds(120, 220, 200, 30);
        cb.setBackground(Color.LIGHT_GRAY);
        panelWest.add(cb);

        JLabel labelSkills = new JLabel("Skills :");
        labelSkills.setFont(font);
        labelSkills.setBounds(10, 260, 200, 50);
        labelSkills.setBackground(Color.LIGHT_GRAY);
        panelWest.add(labelSkills);

        String skills[] = {"Java", "C++", "Python", "HTML,", "CSS", "JavaScript"};
        list = new JList(skills);
        list.setFont(font);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBounds(120, 260, 200, 100);
        panelWest.add(scrollPane);

        buttonAddEmployee = new JButton("AddEmployee");
        buttonAddEmployee.addActionListener(e -> {
            addToTable();
        });
        buttonAddEmployee.setFont(font);
        buttonAddEmployee.setBounds(10, 390, 140, 30);
        panelWest.add(buttonAddEmployee);

        buttonClear = new JButton("Clear");
        buttonClear.addActionListener(e -> {
            Delete();
        });
        buttonClear.setFont(font);
        buttonClear.setBounds(155, 390, 90, 30);
        panelWest.add(buttonClear);

        buttonSave = new JButton("Save");
        buttonSave.addActionListener(e -> {
            String data = "Name :" + textFieldName.getText() + " " +
                    "\nPhone:" + textFieldPhone.getText() + " " +
                    "\nDepartment:" + textFieldDepartment.getText() + " ";

            data += "\nGender:";
            if (radioButtonMale.isSelected()) data += radioButtonMale.getText();
            else if (radioButtonFemale.isSelected()) data += radioButtonFemale.getText();

            data += "\nPosition : " + cb.getSelectedItem();
            data += "\nSkills : " + list.getSelectedValuesList();

            JOptionPane.showMessageDialog(null, data);
            textFieldDisplay.setText("Hotel Reservation Saved Sucessfuly");
        });
        buttonSave.setFont(font);
        buttonSave.setBounds(250, 390, 90, 30);
        panelWest.add(buttonSave);

        textFieldDisplay = new JTextField();
        textFieldDisplay.setEditable(false);
        textFieldDisplay.setBackground(Color.orange);
        textFieldDisplay.setFont(font);
        textFieldDisplay.setBounds(10, 440, 330, 30);
        panelWest.add(textFieldDisplay);

        String colon[] = {"No", "Name", "Phone", "Department", "Gender", "Position"
                , "Skills"};
        dtm = new DefaultTableModel(null, colon);
        JTable table = new JTable(dtm);
        JScrollPane scrollPane2 = new JScrollPane(table);
        this.getContentPane().add(scrollPane2);

    }

    private void addToTable() {
        String no = String.valueOf(dtm.getRowCount() + 1);
        String name = textFieldName.getText();
        String phone = textFieldPhone.getText();
        String Department = textFieldDepartment.getText();
        String Gender = radioButtonMale.isSelected() ? "Male" :
                radioButtonFemale.isSelected() ? "Female" : "";
        String Position = cb.getSelectedItem().toString();
        String aList = list.getSelectedValuesList().toString();

        String[] row = {no, name, phone, Department, Gender, Position, aList};
        dtm.addRow(row);
    }

    void Delete() {
        textFieldName.setText(null);
        textFieldPhone.setText(null);
        textFieldDepartment.setText(null);
        textFieldDisplay.setText(null);
        cb.setSelectedIndex(0);
        list.clearSelection();
        bg.clearSelection();

    }


    public static void main(String[] args) {
        EmployeeManagementSystem em = new EmployeeManagementSystem("Employee");
        em.setVisible(true);
    }
}
