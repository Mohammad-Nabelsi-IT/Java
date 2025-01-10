import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.HashSet;

public class BookInventory extends JFrame {
    private JTextField textFieldBookTitle, textFieldAuthor, textFieldGenre;
    private JTable tableDisplay;
    private JButton buttonAdding, buttonDeletingBooks, buttonViewingGenres;
    private JLabel labelBookTitle, labelAuthor, labelGenre;
    private DefaultTableModel dtm;
    private File file;
    JPanel panelInput, panelTable;
    private DefaultListModel<String> dlm;
    private JList<String> listGenres;

    public BookInventory(String title) {
        super("Book Inventory Management");
        this.setBounds(500, 100, 900, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);

        JMenuItem menuItemNew = new JMenuItem("New");
        JMenuItem menuItemSave = new JMenuItem("Save");
        JMenuItem menuItemSaveAs = new JMenuItem("Save as");
        JMenuItem menuItemOpen = new JMenuItem("Open");
        JMenuItem menuItemExit = new JMenuItem("Exit");

        menuFile.add(menuItemNew);
        menuFile.addSeparator();
        menuFile.add(menuItemSave);
        menuFile.addSeparator();
        menuFile.add(menuItemSaveAs);
        menuFile.addSeparator();
        menuFile.add(menuItemOpen);
        menuFile.addSeparator();
        menuFile.add(menuItemExit);

        ///////////////////////////////////////////////////////////////////

        menuItemNew.addActionListener(e -> {
            clear();
        });
        menuItemSave.addActionListener(e -> {
            if (file == null) {
                saveBook();
            } else {
                writeFile();
            }
        });
        menuItemSaveAs.addActionListener(e -> {
            saveBook();
        });
        menuItemOpen.addActionListener(e -> {
            openFile();
        });
        menuItemExit.addActionListener(e -> {
            System.exit(0);
        });

        ////////////////////////////////////////////////

        panelInput = new JPanel(null);
        panelInput.setPreferredSize(new Dimension(900, 50));
        panelInput.setBackground(Color.orange);
        this.getContentPane().add(panelInput, BorderLayout.SOUTH);

        labelBookTitle = new JLabel("BookTitle :");
        labelBookTitle.setBounds(5, 5, 100, 30);
        panelInput.add(labelBookTitle);

        labelAuthor = new JLabel("Author :");
        labelAuthor.setBounds(200, 5, 100, 30);
        panelInput.add(labelAuthor);

        labelGenre = new JLabel("Genre :");
        labelGenre.setBounds(370, 5, 100, 30);
        panelInput.add(labelGenre);

        /////////////////////////////////////////////////////////////////

        textFieldBookTitle = new JTextField();
        textFieldBookTitle.setBounds(70, 5, 100, 30);
        panelInput.add(textFieldBookTitle);

        textFieldAuthor = new JTextField();
        textFieldAuthor.setBounds(250, 5, 100, 30);
        panelInput.add(textFieldAuthor);

        textFieldGenre = new JTextField();
        textFieldGenre.setBounds(420, 5, 100, 30);
        panelInput.add(textFieldGenre);

        buttonAdding = new JButton("Add Book");
        buttonDeletingBooks = new JButton("DeletingBooks");
        buttonViewingGenres = new JButton("ViewingGenres");

        buttonAdding.setBounds(550, 5, 300, 30);
        buttonAdding.addActionListener(e -> {
            addBook();
        });
        panelInput.add(buttonAdding);

        //////////////////////////////////////////////////////////////

        panelTable = new JPanel(null);
        panelTable.setBackground(Color.GRAY);
       panelTable.setPreferredSize(new Dimension(600, 50));

        buttonDeletingBooks.setBounds(20, 10, 400, 30);
        buttonViewingGenres.setBounds(450, 10, 400, 30);

        buttonDeletingBooks.addActionListener(e -> {
            deleteManyBook();
        });
        buttonViewingGenres.addActionListener(e -> {
            showGenres();
        });

        panelTable.add(buttonDeletingBooks);
        panelTable.add(buttonViewingGenres);

        this.getContentPane().add(panelTable, BorderLayout.NORTH);

        String colon[] = {"Title", "Author", "Genre",};
        dtm = new DefaultTableModel(null, colon);
        tableDisplay = new JTable(dtm);
        JScrollPane scrollPane = new JScrollPane(tableDisplay);
        this.getContentPane().add(scrollPane, BorderLayout.EAST);

        dlm = new DefaultListModel<>();
        listGenres = new JList<>(dlm);
        listGenres.setPreferredSize(new Dimension(50, 300));
        JScrollPane listScrollPane = new JScrollPane(listGenres);
        this.getContentPane().add(listScrollPane, BorderLayout.CENTER);


    }

    private void deleteManyBook() {
        int rowNums[] = tableDisplay.getSelectedRows(); // [2 , 4]
        if (rowNums.length > 0) {
            for (int i = rowNums.length - 1; i >= 0; i--) {
                dtm.removeRow(rowNums[i]);
            }
        } else {
            JOptionPane.showMessageDialog(null, "please select row to delete");
        }
    }

    private void saveBook() {
        JFileChooser fileChooser = new JFileChooser();
        int choice = fileChooser.showSaveDialog(null);
        if (choice == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            this.setTitle(file.getAbsolutePath());
            writeFile();
        }
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        int choice = fileChooser.showOpenDialog(null);
        if (choice == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            this.setTitle(file.getAbsolutePath());
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);
                String line = null;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");
                    dtm.addRow(data);
                }
                reader.close();
                fileReader.close();

            } catch (Exception exp) {
                System.out.println(exp.getMessage());
            }
        }
    }

    private void clear() {
        textFieldBookTitle.setText("");
        textFieldAuthor.setText("");
        textFieldGenre.setText("");
        this.setTitle("");
        dlm.clear();
        for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
    }

    private void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter out = new PrintWriter(fileWriter);

            for (int i = 0; i < dtm.getRowCount(); i++) {
                String exp = (String) dtm.getValueAt(i, 0);
                String amount = (String) dtm.getValueAt(i, 1);
                String cat = (String) dtm.getValueAt(i, 2);
                out.println(exp + "," + amount + "," + cat);
            }

            out.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void addBook() {
        String[] expense = {textFieldBookTitle.getText(), textFieldAuthor.getText(), textFieldGenre.getText()};
        dtm.addRow(expense);
    }

    private void showGenres() {
        HashSet<String> genresSet = new HashSet<>();

        for (int i = 0; i < dtm.getRowCount(); i++) {
            genresSet.add((String) dtm.getValueAt(i, 2));
        }

        dlm.clear();
        dlm.addAll(genresSet);
    }


    public static void main(String[] args) {
        BookInventory bookInventory = new BookInventory("Book Inventory Management");
        bookInventory.setVisible(true);
    }
}
