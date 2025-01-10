import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.HashSet;

public class ExpenseTracker extends JFrame {

    private JTable tableDisplayExpenses;
    private JTextField textFieldNameExpenses, textFieldAmount, textFieldCategory;
    private JList<String> listCategory;
    private JButton buttonAddExpense, buttonDeleteExpense, buttonViewCategories;
    private DefaultListModel<String> listModel;
    private DefaultTableModel dtm;
    private File file;


    public ExpenseTracker(String title) {
        super(title);

        this.setSize(900, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.PLAIN, 18);

        JPanel panelNorth = new JPanel(null);
        panelNorth.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panelNorth.setBackground(Color.orange);
        panelNorth.setPreferredSize(new Dimension(100, 60));
        this.getContentPane().add(panelNorth, BorderLayout.NORTH);

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);


        JMenu menuFile = new JMenu("File");
        menuBar.setBackground(Color.yellow);
        menuBar.add(menuFile);

        JMenuItem menuItemNew = new JMenuItem("New");
        JMenuItem menuItemOpen = new JMenuItem("Open");
        JMenuItem menuItemSave = new JMenuItem("Save");
        JMenuItem menuItemSaveAS = new JMenuItem("Save as");
        JMenuItem menuItemExit = new JMenuItem("Exit");

        menuFile.add(menuItemNew);
        menuFile.addSeparator();
        menuFile.add(menuItemOpen);
        menuFile.addSeparator();
        menuFile.add(menuItemSave);
        menuFile.addSeparator();
        menuFile.add(menuItemSaveAS);
        menuFile.addSeparator();
        menuFile.add(menuItemExit);

        listModel = new DefaultListModel<>();

        menuItemNew.addActionListener(e -> {
            clear();

        });

        menuItemOpen.addActionListener(e -> {
            loadFile();
        });

        menuItemSave.addActionListener(e -> {
            if (file == null) {
                saveExpense(); // show dialog // =  save as
            } else {
                writeToFile(); // save
            }
        });


        menuItemExit.addActionListener(e -> System.exit(0));

        JLabel labelExpense = new JLabel("Expense :");
        labelExpense.setFont(font);
        labelExpense.setBounds(10, 5, 200, 50);
        panelNorth.add(labelExpense);

        textFieldNameExpenses = new JTextField(10);
        textFieldNameExpenses.setBounds(100, 10, 150, 30);
        panelNorth.add(textFieldNameExpenses);


        JLabel labelAmount = new JLabel("Amount :");
        labelAmount.setFont(font);
        labelAmount.setBounds(270, 5, 200, 50);
        panelNorth.add(labelAmount);

        textFieldAmount = new JTextField();
        textFieldAmount.setBounds(350, 10, 150, 30);
        panelNorth.add(textFieldAmount);


        JLabel labelCategory = new JLabel("Category :");
        labelCategory.setFont(font);
        labelCategory.setBounds(520, 5, 200, 50);
        panelNorth.add(labelCategory);

        textFieldCategory = new JTextField();
        textFieldCategory.setBounds(620, 10, 150, 30);
        panelNorth.add(textFieldCategory);

        buttonAddExpense = new JButton("Add Expense");
        buttonAddExpense.setBackground(Color.green);
        buttonAddExpense.addActionListener(e -> {
            addExpense();
        });
        buttonAddExpense.setBounds(780, 10, 100, 30);
        panelNorth.add(buttonAddExpense);


        String colon[] = {"Name Expenses", "Amount", "Category",};
        dtm = new DefaultTableModel(null, colon);
        tableDisplayExpenses = new JTable(dtm);
        JScrollPane scrollPaneTable = new JScrollPane(tableDisplayExpenses);
        this.getContentPane().add(scrollPaneTable, BorderLayout.CENTER);

//        JScrollPane tableScrollPane = new JScrollPane(tableDisplayExpenses);
//        add(tableScrollPane, BorderLayout.CENTER);

//////////////////////////////////////////////////////////////////

//        String[] columnNames = {"Expense", "Amount", "Category"};
//        dtm = new DefaultTableModel(columnNames, 0);
//        tableDisplayExpenses = new JTable(dtm);

        listModel = new DefaultListModel<>();
        listCategory = new JList<>(listModel);
        listCategory.setPreferredSize(new Dimension(250, 300));

        JScrollPane listScrollPane = new JScrollPane(listCategory);
        add(listScrollPane, BorderLayout.EAST);

        //listModel = new DefaultListModel<>();
//        listCategory = new JList<>(listModel);
//        listCategory.setPreferredSize(new Dimension(200, 300));
//        listCategory.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//        this.getContentPane().add(listCategory, BorderLayout.EAST);


        JPanel panelSouth = new JPanel();
        panelSouth.setBackground(Color.GRAY);
        this.getContentPane().add(panelSouth, BorderLayout.SOUTH);

        buttonDeleteExpense = new JButton("Delete Expense");
        buttonViewCategories = new JButton("View Categories");
        panelSouth.add(buttonDeleteExpense);
        panelSouth.add(buttonViewCategories);

        buttonDeleteExpense.setBackground(Color.red);
        buttonDeleteExpense.addActionListener(e -> {
            deleteManyExpense();
        });

        buttonViewCategories.addActionListener(e -> {
            showCategories();
        });


    }


//    private void addToTable() {
//        String name = textFieldNameExpenses.getText();
//        String am = textFieldAmount.getText();
//        String ct = textFieldCategory.getText();
//        String row[] = {name, am, ct};
//        dtm.addRow(row);
//    }

    private void deleteExpense() {
        int selectedRow = tableDisplayExpenses.getSelectedRow();
        if (selectedRow != -1) {
            dtm.removeRow(selectedRow);
        }
    }

    private void deleteManyExpense() {
        int rowNums[] = tableDisplayExpenses.getSelectedRows(); // [2 , 4]
        if (rowNums.length > 0) {
            for (int i = rowNums.length - 1; i >= 0; i--) {
                dtm.removeRow(rowNums[i]);
            }
        } else {
            JOptionPane.showMessageDialog(null, "please select row to delete");
        }
    }

    private void saveExpense() {
        JFileChooser fileChooser = new JFileChooser();
        int choice = fileChooser.showSaveDialog(null);
        if (choice == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            this.setTitle(file.getAbsolutePath());
            writeToFile();
        }
    }

    private void loadFile() {
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
                    String[] data = line.split(",");  // Apple,70,Fruits
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
        textFieldNameExpenses.setText("");
        textFieldAmount.setText("");
        textFieldCategory.setText("");
        listModel.clear();
        this.setTitle("");
        for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
    }

    private void writeToFile() {
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

    private void addExpense() {
        String[] expense = {textFieldNameExpenses.getText(), textFieldAmount.getText(), textFieldCategory.getText()};
        dtm.addRow(expense);
    }

    private void showCategories() {
        // columns : 0 , 1 , 2 Category
        HashSet<String> categoriesSet = new HashSet<>();
        HashSet<String> categoriesSetWithAmount = new HashSet<>();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            categoriesSet.add((String) dtm.getValueAt(i, 2));
        }
        for (String c : categoriesSet) {
            int sumCatAmount = 0;
            for (int i = 0; i < dtm.getRowCount(); i++) {
                String cat = (String) dtm.getValueAt(i, 2);
                if (cat.equals(c)) {

                    int amount = Integer.parseInt((String) dtm.getValueAt(i, 1));
                    sumCatAmount += amount;
                }
            }
            categoriesSetWithAmount.add(c + " - " + sumCatAmount);
        }
        listModel.clear();
        listModel.addAll(categoriesSetWithAmount);
    }

    public static void main(String[] args) {
        ExpenseTracker expenseTracker = new ExpenseTracker("Expense Tracker");
        expenseTracker.setVisible(true);
    }
}
