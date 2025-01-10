
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class Conference extends JFrame {
    private JTextField textFieldParticipantName;
    private JTextField textFieldParticipantId;
    private JComboBox cb1 ;
    private JComboBox cb2;
    private JRadioButton radioButtonOnline;
    private JRadioButton radioButtonOffline;
    private ButtonGroup bg;
    private JCheckBox checkBoxOption[];
    private JList listSkills;
    private JButton buttonRegister;
    private JButton buttonClear;
    private JButton buttonSave;
    private JTextField textFieldDisplay;
    private DefaultTableModel dtm;

    public Conference(String title) {
        super(title);
        this.setBounds(500, 10, 900, 610);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.PLAIN, 18);

        ImageIcon icon = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\employee.png");
        this.setIconImage(icon.getImage());

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu menuOption = new JMenu("Option");
        menuBar.add(menuOption);

        JMenuItem menuItemNewRegistration = new JMenuItem("New Registration");

        menuItemNewRegistration.addActionListener(e -> {
            Delete();
        });
        menuOption.add(menuItemNewRegistration);

        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.addActionListener(e -> System.exit(0));
        menuOption.add(menuItemExit);

        JPanel panelWest = new JPanel(null);
        panelWest.setPreferredSize(new Dimension(450, 600));
        this.getContentPane().add(panelWest, BorderLayout.WEST);

        JLabel labelParticipantName = new JLabel("Participant Name :");
        labelParticipantName.setFont(font);
        labelParticipantName.setBounds(10, 10, 200, 50);
        panelWest.add(labelParticipantName);

        textFieldParticipantName = new JTextField();
        textFieldParticipantName.setBounds(170, 25, 200, 30);
        panelWest.add(textFieldParticipantName);

        JLabel labelParticipantId = new JLabel("Participant ID :");
        labelParticipantId.setFont(font);
        labelParticipantId.setBounds(10, 60, 200, 50);
        panelWest.add(labelParticipantId);

        textFieldParticipantId = new JTextField();
        textFieldParticipantId.setBounds(170, 75, 200, 30);
        panelWest.add(textFieldParticipantId);

        JLabel labelConferenceName = new JLabel("Conference Name :");
        labelConferenceName.setFont(font);
        labelConferenceName.setBounds(10, 110, 200, 50);
        panelWest.add(labelConferenceName);

        String option[] = {"", "AI Conference", "Web Development Conference", "Cyber Security Conference"};
        cb1 = new JComboBox(option);
        cb1.setFont(font);
        cb1.setBounds(170, 120, 200, 30);
        cb1.setBackground(Color.LIGHT_GRAY);
        panelWest.add(cb1);

        JLabel labelSessionTime = new JLabel("Session Time :");
        labelSessionTime.setFont(font);
        labelSessionTime.setBounds(10, 160, 200, 50);
        panelWest.add(labelSessionTime);

        String optionSession[] = {"", "Morning", "Afternoon", "Evening"};
        cb2 = new JComboBox(optionSession);
        cb2.setFont(font);
        cb2.setBounds(170, 170, 200, 30);
        cb2.setBackground(Color.LIGHT_GRAY);
        panelWest.add(cb2);

        JLabel labelAttendanceMode = new JLabel("Attendance Mode :");
        labelAttendanceMode.setFont(font);
        labelAttendanceMode.setBounds(10, 210, 200, 50);
        panelWest.add(labelAttendanceMode);

        radioButtonOnline = new JRadioButton("Online");
        radioButtonOnline.setFont(font);
        radioButtonOnline.setBounds(180, 220, 100, 30);
        panelWest.add(radioButtonOnline);

        radioButtonOffline = new JRadioButton("Offline");
        radioButtonOffline.setFont(font);
        radioButtonOffline.setBounds(290, 220, 100, 30);
        panelWest.add(radioButtonOffline);

        bg = new ButtonGroup();
        bg.add(radioButtonOnline);
        bg.add(radioButtonOffline);

        JLabel labelTopicsOfInterest = new JLabel("Topics of Interest :");
        labelTopicsOfInterest.setBounds(10, 260, 200, 50);
        labelTopicsOfInterest.setFont(font);
        panelWest.add(labelTopicsOfInterest);

        String optionCheck[] = {"Machine Learning", "Web Technologies", "Network Security"};
        checkBoxOption = new JCheckBox[optionCheck.length];
        int y = 0;
        for (int i = 0; i < optionCheck.length; i++) {
            checkBoxOption[i] = new JCheckBox(optionCheck[i]);
            checkBoxOption[i].setFont(font);
            checkBoxOption[i].setBounds(180, 270 + y, 200, 30);
            y += 35;
            panelWest.add(checkBoxOption[i]);
        }

        JLabel labelSkills = new JLabel("Skills :");
        labelSkills.setFont(font);
        labelSkills.setBounds(10, 370, 200, 50);
        panelWest.add(labelSkills);

        String skills[] = {"Critical Thinking", "Teamwork", "Communication", "Technical Skills"};
        listSkills = new JList(skills);
        listSkills.setFont(font);
        JScrollPane scrollPane = new JScrollPane(listSkills);
        scrollPane.setBounds(180, 380, 200, 80);
        panelWest.add(scrollPane);

        buttonRegister = new JButton("Register");
        buttonRegister.addActionListener(e -> {
            addToTable();
        });
        buttonRegister.setFont(font);
        buttonRegister.setBounds(10, 470, 150, 30);
        panelWest.add(buttonRegister);

        buttonClear = new JButton("Clear");
        buttonClear.addActionListener(e -> {
            Delete();
        });
        buttonClear.setFont(font);
        buttonClear.setBounds(170, 470, 100, 30);
        panelWest.add(buttonClear);

        buttonSave = new JButton("Save");
        buttonSave.addActionListener(e -> {
            String data = "Participant Name :" + textFieldParticipantName.getText() + " " +
                    "\nParticipant Id:" + textFieldParticipantId.getText() + " ";

            data += "\nAttendance Mode:";
            if (radioButtonOnline.isSelected()) data += radioButtonOnline.getText();
            else if (radioButtonOffline.isSelected()) data += radioButtonOffline.getText();

            for (JCheckBox c : checkBoxOption) {
                if (c.isSelected()) data += c.getText() + " ";
            }

            data += "\nConference Name : " + cb1.getSelectedItem();
            data += "\nSession Time : " + cb2.getSelectedItem();
            data += "\nSkills : " + listSkills.getSelectedValuesList();

            JOptionPane.showMessageDialog(null, data);
            textFieldDisplay.setText("Conference Reservation Saved Successfully");
        });
        buttonSave.setFont(font);
        buttonSave.setBounds(280, 470, 100, 30);
        panelWest.add(buttonSave);

        textFieldDisplay = new JTextField();
        textFieldDisplay.setEditable(false);
        textFieldDisplay.setBackground(Color.LIGHT_GRAY);
        textFieldDisplay.setFont(font);
        textFieldDisplay.setBounds(10, 510, 370, 30);
        panelWest.add(textFieldDisplay);

        String colon[] = {"No", "Participant Name", "Participant Id", "Conference Name", "Session Time",
                "Attendance Mode", "Topics of Interest", "Skills"};
        dtm = new DefaultTableModel(null, colon);
        JTable table = new JTable(dtm);
        JScrollPane scrollPaneTable = new JScrollPane(table);
        this.getContentPane().add(scrollPaneTable);
    }

    private void addToTable() {
        String no = String.valueOf(dtm.getRowCount() + 1);
        String name = textFieldParticipantName.getText();
        String id = textFieldParticipantId.getText();
        String conferenceName = cb1.getSelectedItem().toString();
        String sessionTime = cb2.getSelectedItem().toString();
        String attendanceMode = radioButtonOnline.isSelected() ? "Online" :
                radioButtonOffline.isSelected() ? "Offline" : " ";
        String topicsOfInterest=  "";
        for (JCheckBox c : checkBoxOption) {
            if (c.isSelected()) topicsOfInterest += c.getText() + " - ";
        }
        String skills = listSkills.getSelectedValuesList().toString();
        String row[] = {no, name, id, conferenceName, sessionTime, attendanceMode, topicsOfInterest,skills};
        dtm.addRow(row);
    }

    void Delete() {
        textFieldParticipantName.setText(null);
        textFieldParticipantId.setText(null);
        cb1.setSelectedIndex(0);
        cb2.setSelectedIndex(0);
        bg.clearSelection();
        listSkills.clearSelection();
        radioButtonOnline.setSelected(false);
        radioButtonOffline.setSelected(false);
        for (JCheckBox c : checkBoxOption) c.setSelected(false);
    }

    public static void main(String[] args) {
        Conference conference = new Conference("Conference");
        conference.setVisible(true);
    }
}

