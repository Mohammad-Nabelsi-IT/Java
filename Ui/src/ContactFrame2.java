import javax.swing.*;
import java.awt.*;

public class ContactFrame2 extends JFrame {


    public ContactFrame2(String title) {
        super("Contact");
        setBounds(1000, 100, 500, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.PLAIN, 22);
        ImageIcon iconContact = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\contact-us.png");
        this.setIconImage(iconContact.getImage());
        ImageIcon iconSave = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\bookmark.png");
        ImageIcon iconClear = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\eraser.png");
        ImageIcon iconMale = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\hairstyle.png");
        ImageIcon iconFemale = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\" +
                "female-hair-shape-and-face-silhouette.png");


        JPanel panelCenter = new JPanel(null);
        this.getContentPane().add(panelCenter);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(font);
        labelName.setBounds(20, 10, 100, 50);
        panelCenter.add(labelName);

        JTextField tfName = new JTextField();
        tfName.setFont(font);
        tfName.setBounds(100, 20, 100, 30);
        panelCenter.add(tfName);

        ////////////////////////////////

        JLabel labelPhone = new JLabel("Phone :");
        labelPhone.setFont(font);
        labelPhone.setBounds(20, 60, 100, 30);
        panelCenter.add(labelPhone);

        JTextField tfPhone = new JTextField();
        tfPhone.setFont(font);
        tfPhone.setBounds(100, 70, 100, 30);
        panelCenter.add(tfPhone);

        /////////////////////////

        JLabel labelGender = new JLabel("Gender :");
        labelGender.setFont(font);
        labelGender.setBounds(20, 110, 100, 30);
        panelCenter.add(labelGender);

        JRadioButton radioButtonMale = new JRadioButton("Male");
        radioButtonMale.setFont(font);
        radioButtonMale.setIcon(iconMale);
        JRadioButton radioButtonFemale = new JRadioButton("Female");
        radioButtonFemale.setIcon(iconFemale);
        radioButtonFemale.setFont(font);


        ButtonGroup genderBG = new ButtonGroup();
        genderBG.add(radioButtonMale);
        genderBG.add(radioButtonFemale);

        panelCenter.add(radioButtonMale);
        radioButtonMale.setBounds(150, 110, 100, 30);

        panelCenter.add(radioButtonFemale);
        radioButtonFemale.setBounds(260, 110, 150, 30);

        JLabel labelLanguage = new JLabel("Language :");
        labelLanguage.setFont(font);
        labelLanguage.setBounds(20, 160, 130, 30);
        panelCenter.add(labelLanguage);

        String langs[] = {"English", "German", "Arabic", "French", "Italy"};
        JCheckBox[] checkBoxlangs = new JCheckBox[langs.length];
        int y = 0;
        for (int i = 0; i < checkBoxlangs.length; i++) {
            checkBoxlangs[i] = new JCheckBox(langs[i]);
            checkBoxlangs[i].setFont(font);
            checkBoxlangs[i].setBounds(150, 170 + y, 150, 30);
            y += 30;
            panelCenter.add(checkBoxlangs[i]);
        }

//            JCheckBox checkBoxEn = new JCheckBox("English");
//            checkBoxEn.setFont(font);
//            JCheckBox checkBoxGE = new JCheckBox("German");
//            checkBoxGE.setFont(font);
//            JCheckBox checkBoxAr = new JCheckBox("Arabic");
//            checkBoxAr.setFont(font);
//
//            checkBoxEn.setBounds(150, 160, 150, 30);
//            checkBoxGE.setBounds(150, 190, 150, 30);
//            checkBoxAr.setBounds(150, 220, 150, 30);
//
//            panelCenter.add(checkBoxEn);
//            panelCenter.add(checkBoxGE);
//            panelCenter.add(checkBoxAr);

        JButton buttonSave = new JButton("Save");
        buttonSave.addActionListener(e -> {
            String data = "Name :" + tfName.getText() + " " +
                    "\nPhone :" + tfPhone.getText() + " ";
            String userGender = "";
            if (radioButtonMale.isSelected()) {
                userGender += radioButtonMale.getText();
            } else {
                userGender += radioButtonFemale.getText();
            }
            data += "\nGender :" + userGender;
            String language = " ";
//                if (checkBoxEn.isSelected()) {
//                    language += checkBoxEn.getText() + " ";
//                }
//                if (checkBoxGE.isSelected()) {
//                    language += checkBoxGE.getText() + " ";
//                }
//                if (checkBoxAr.isSelected()) {
//                    language += checkBoxAr.getText() + " ";
//                }
            data += "\nlanguage :";

            for (JCheckBox ck : checkBoxlangs)
                if (ck.isSelected()) data += ck.getText() + " ";

            JOptionPane.showMessageDialog(null, data);
        });
        buttonSave.setIcon(iconSave);
        JButton buttonClear = new JButton("Clear");
        buttonClear.addActionListener(e -> {
            tfName.setText(null);
            tfPhone.setText(null);

        });
        buttonClear.setIcon(iconClear);

        buttonSave.setBounds(140, 350, 100, 30);
        buttonClear.setBounds(260, 350, 100, 30);

        panelCenter.add(buttonSave);
        panelCenter.add(buttonClear);

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenuItem menuItemNew = new JMenuItem("New");
        menuItemNew.addActionListener(e -> {
            tfName.setText(null);
            tfPhone.setText(null);
        });
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.addActionListener(e -> System.exit(0));
        menu.add(menuItemNew);
        menu.addSeparator();
        menu.add(menuItemExit);


    }

    public static void main(String[] args) {
        ContactFrame2 contactFrame = new ContactFrame2("Contact");
        contactFrame.setVisible(true);
    }
}


