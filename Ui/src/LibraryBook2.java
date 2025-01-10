import javax.swing.*;
import java.awt.*;

public class LibraryBook2 extends JFrame {
    private JTextField textFieldBookTitle;
    private JTextField textFieldAuthor;
    private JTextField textFieldPublicationYear;
    private JComboBox cb;
    private JList list;
    private JTextField textFieldISBN;
    private JCheckBox[] checkBoxesGenres;
    private JRadioButton radioButtonNew;
    private JRadioButton radioButtonUsed;
    private ButtonGroup genderBG;

    public LibraryBook2(String title) {
        super("LibraryBook2");
        this.setSize(800, 600);
        this.setLocation(700, 100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.PLAIN, 22);
        ImageIcon icon = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\stack-of-books.png");
        this.setIconImage(icon.getImage());

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu menuOption = new JMenu("Option");
        menuBar.add(menuOption);

        JMenuItem menuItemNewEntry = new JMenuItem("New Entry");
        menuOption.add(menuItemNewEntry);
        menuItemNewEntry.addActionListener(e -> clear());
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.addActionListener(e -> System.exit(0));
        menuOption.add(menuItemExit);

        JPanel panelCenter = new JPanel(null);
        this.getContentPane().add(panelCenter);
        panelCenter.add(menuBar);

        JLabel labelBookTitle = new JLabel("Book Title :");
        labelBookTitle.setFont(font);
        labelBookTitle.setBounds(10, 20, 200, 50);
        panelCenter.add(labelBookTitle);

        textFieldBookTitle = new JTextField();
        textFieldBookTitle.setFont(font);
        textFieldBookTitle.setBounds(190, 30, 200, 30);
        panelCenter.add(textFieldBookTitle);

        JLabel labelAuthor = new JLabel("Author :");
        labelAuthor.setFont(font);
        labelAuthor.setBounds(10, 70, 200, 50);
        panelCenter.add(labelAuthor);

        textFieldAuthor = new JTextField();
        textFieldAuthor.setFont(font);
        textFieldAuthor.setBounds(190, 80, 200, 30);
        panelCenter.add(textFieldAuthor);

        JLabel labelISBN = new JLabel("ISBN :");
        labelISBN.setFont(font);
        labelISBN.setBounds(10, 120, 200, 50);
        panelCenter.add(labelISBN);

        textFieldISBN = new JTextField();
        textFieldISBN.setFont(font);
        textFieldISBN.setBounds(190, 130, 200, 30);
        panelCenter.add(textFieldISBN);

        JLabel labelPublicationYear = new JLabel("Publication Year :");
        labelPublicationYear.setFont(font);
        labelPublicationYear.setBounds(10, 170, 200, 50);
        panelCenter.add(labelPublicationYear);

        textFieldPublicationYear = new JTextField();
        textFieldPublicationYear.setFont(font);
        textFieldPublicationYear.setBounds(190, 180, 200, 30);
        panelCenter.add(textFieldPublicationYear);

        JLabel labelGenres = new JLabel("Genres :");
        labelGenres.setFont(font);
        labelGenres.setBounds(10, 220, 200, 50);
        panelCenter.add(labelGenres);


        String genres[] = {"Fiction", "Non-Fiction", "Mystery", "Science Fiction"};
        checkBoxesGenres = new JCheckBox[genres.length];
        int y = 0;
        for (int i = 0; i < genres.length; i++) {
            checkBoxesGenres[i] = new JCheckBox(genres[i]);
            checkBoxesGenres[i].setFont(font);
            checkBoxesGenres[i].setBounds(190, 220 + y, 200, 50);
            y += 35;
            panelCenter.add(checkBoxesGenres[i]);
        }

        JLabel labelCondition = new JLabel("Condition :");
        labelCondition.setFont(font);
        labelCondition.setBounds(10, 370, 200, 50);
        panelCenter.add(labelCondition);

        radioButtonNew = new JRadioButton("New");
        radioButtonNew.setFont(font);
        radioButtonNew.setBounds(170, 380, 100, 30);
        panelCenter.add(radioButtonNew);

        radioButtonUsed = new JRadioButton("Used");
        radioButtonUsed.setFont(font);
        radioButtonUsed.setBounds(300, 380, 130, 30);
        panelCenter.add(radioButtonUsed);

        genderBG = new ButtonGroup();
        genderBG.add(radioButtonNew);
        genderBG.add(radioButtonUsed);


        JLabel labelAvailability = new JLabel("Availability :");
        labelAvailability.setFont(font);
        labelAvailability.setBounds(10, 420, 200, 50);
        panelCenter.add(labelAvailability);


        String status[] = {"", "Available", "Checked Out", "Reserved"};
        cb = new JComboBox(status);
        cb.setBackground(Color.RED);
        cb.setFont(font);
        cb.setBounds(180, 430, 200, 30);
        panelCenter.add(cb);


        JLabel labelCategories = new JLabel("Categories :");
        labelCategories.setFont(font);
        labelCategories.setBounds(410, 20, 200, 50);
        panelCenter.add(labelCategories);

        String book[] = {" Science ", " Literature ", " Technology ", " Arts ", " History"};
        list = new JList(book);
        list.setFont(font);
        list.setBounds(610, 30, 100, 140);
        list.setBackground(Color.green);
        panelCenter.add(list);

        JPanel panelSouth = new JPanel();
        panelSouth.setBackground(Color.cyan);
        this.getContentPane().add(panelSouth, BorderLayout.SOUTH);

        JButton buttonSave = new JButton("Save");
        buttonSave.setFont(font);
        buttonSave.setBackground(Color.orange);
        buttonSave.addActionListener(e -> {
            String data = "\nBook Title :" + textFieldBookTitle.getText() + " " +
                    "\nAuthor :" + textFieldAuthor.getText() + " " +
                    "\nISBN :" + textFieldISBN.getText() + " " +
                    "\nPublication Year :" + textFieldPublicationYear.getText() + "\nGenre : ";
            for (JCheckBox c : checkBoxesGenres) {
                if (c.isSelected()) data += c.getText() + " ";
            }
            data += "\nConditio : ";
            if (radioButtonNew.isSelected()) data += radioButtonNew.getText();
            else if (radioButtonUsed.isSelected()) data += radioButtonUsed.getText();

            data += "\nAvailability : " + cb.getSelectedItem();
            data += "\nCategories : " + list.getSelectedValuesList();

            JOptionPane.showMessageDialog(null, data);
        });


        panelSouth.add(buttonSave);

        JButton buttonClear = new JButton("Clear");
        buttonClear.addActionListener(e -> {
            clear();
        });
        buttonClear.setFont(font);
        buttonClear.setBackground(Color.orange);
        panelSouth.add(buttonClear);

        JTextField textFieldDisplay = new JTextField();
        textFieldDisplay.setEditable(false);
        textFieldDisplay.setFont(font);
        textFieldDisplay.setPreferredSize(new Dimension(200, 30));

        menuItemNewEntry.addActionListener(e -> {
            clear();
        });


    }

    void clear() {
        textFieldBookTitle.setText(null);
        textFieldAuthor.setText(null);
        textFieldISBN.setText(null);
        textFieldPublicationYear.setText(null);
        genderBG.clearSelection();
        list.clearSelection();
        cb.setSelectedIndex(0);
        for (JCheckBox c : checkBoxesGenres) c.setSelected(false);

    }


    public static void main(String[] args) {
        LibraryBook2 libraryBook2 = new LibraryBook2("LibraryBook2");
        libraryBook2.setVisible(true);
    }
}