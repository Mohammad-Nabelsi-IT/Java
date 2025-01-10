import javax.swing.*;
import java.awt.*;
import java.io.*;

public class ToDoListApp extends JFrame {
    private JTextField textField;
    private DefaultListModel<String> dlm;
    private JList<String> list;
    private File file;

    public ToDoListApp(String title) {
        super(title);
        this.setBounds(1100, 100, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        dlm = new DefaultListModel<>();

        list = new JList<>(dlm);
        JScrollPane scrollPane = new JScrollPane(list);
        this.getContentPane().add(scrollPane, BorderLayout.CENTER);


        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);


        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);
        JMenu menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);

        JMenuItem menuItemNew = new JMenuItem("New");
        menuFile.add(menuItemNew);
        menuItemNew.addActionListener(e -> {
            dlm.clear();
            this.setTitle("");
            file = null;
        });
        menuFile.addSeparator();


        JMenuItem menuItemSave = new JMenuItem("Save");
        menuFile.add(menuItemSave);
        menuFile.addSeparator();

        menuItemSave.addActionListener(e -> {
            if (file == null) {
                JFileChooser fileChooser = new JFileChooser();
                int choice = fileChooser.showSaveDialog(null);
                if (choice == 0) {
                    try {
                        file = fileChooser.getSelectedFile();
                        this.setTitle(file.getAbsolutePath());
                        FileWriter writer = new FileWriter(file);
                        PrintWriter out = new PrintWriter(writer);
                        for (int i = 0; i < dlm.size(); i++) {
                            out.println(dlm.get(i));
                        }
                        out.close();
                        writer.close();
                    } catch (IOException ioException) {
                        System.out.println(ioException.getMessage());
                    }
                }
            } else {
                try {
                    FileWriter writer = new FileWriter(file);
                    PrintWriter out = new PrintWriter(writer);
                    for (int i = 0; i < dlm.size(); i++) {
                        out.println(dlm.get(i));
                    }
                    out.close();
                    writer.close();
                } catch (IOException ioException) {
                    System.out.println(ioException.getMessage());
                }
            }

        });
        JMenuItem menuItemSaveAs = new JMenuItem("Save as");
        menuItemSaveAs.addActionListener(e -> {

            if (file == null) {
                JFileChooser fileChooser = new JFileChooser();
                int choice = fileChooser.showSaveDialog(null);
                if (choice == 0) {
                    try {
                        file = fileChooser.getSelectedFile();
                        this.setTitle(file.getAbsolutePath());
                        FileWriter writer = new FileWriter(file);
                        PrintWriter out = new PrintWriter(writer);
                        for (int i = 0; i < dlm.size(); i++) {
                            out.println(dlm.get(i));
                        }
                        out.close();
                        writer.close();
                    } catch (IOException ioException) {
                        System.out.println(ioException.getMessage());
                    }
                }
            }
//                try {
//                    FileWriter writer = new FileWriter(file);
//                    PrintWriter out = new PrintWriter(writer);
//                    for (int i = 0; i < dlm.size(); i++) {
//                        out.println(dlm.get(i));
//                    }
//                    out.close();
//                    writer.close();
//                } catch (IOException ioException) {
//                    System.out.println(ioException.getMessage());
//                }


        });
        menuFile.add(menuItemSaveAs);
        menuFile.addSeparator();

        JMenuItem menuItemLoad = new JMenuItem("Load");
        menuFile.add(menuItemLoad);
        menuItemLoad.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(null);
            if (choice == 0) {
                file = fileChooser.getSelectedFile();
                this.setTitle(file.getAbsolutePath());
                try {
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    dlm.clear();
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        dlm.add(dlm.size(), line);
                    }
                    bufferedReader.close();
                    fileReader.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }

            }
        });

        menuFile.add(menuItemLoad);
        menuFile.addSeparator();


        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuFile.add(menuItemExit);
        menuItemExit.addActionListener(e -> {
            System.exit(0);
        });
        JMenuItem menuItemRemove = new JMenuItem("Remove");
        menuItemRemove.addActionListener(e -> {
            int indexes[] = list.getSelectedIndices();
            for (int i = indexes.length - 1; i >= 0; i--) {
                dlm.remove(indexes[i]);
            }
        });
        menuEdit.add(menuItemRemove);
        menuEdit.addSeparator();

        JMenuItem menuItemMarkAsCompleted = new JMenuItem("Mark as Completed");
        menuItemMarkAsCompleted.addActionListener(e -> {
            //  int i = list.getSelectedIndex();
            //   dlm.set(i, "<html><s><i><span color ='gray'>" + dlm.get(i) + "</span></i><s></html>");
            int indexes[] = list.getSelectedIndices();
            for (int i = 0; i < indexes.length; i++) {
                dlm.set(indexes[i], "<html><s><i><span color ='gray'>" + dlm.get(indexes[i]) + "</span></i><s></html>");
            }
        });
        menuEdit.add(menuItemMarkAsCompleted);

        JPanel panelNorth = new JPanel(new BorderLayout());
        panelNorth.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelNorth.setBackground(Color.orange);
        this.getContentPane().add(panelNorth, BorderLayout.NORTH);


        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        panelNorth.add(textField, BorderLayout.CENTER);

        JButton buttonAddTask = new JButton("ADD TASK");
        buttonAddTask.addActionListener(e -> {
            dlm.add(dlm.size(), textField.getText());
            textField.setText("");
        });
        buttonAddTask.setBackground(Color.green);
        panelNorth.add(buttonAddTask, BorderLayout.EAST);

    }

    public static void main(String[] args) {
        ToDoListApp toDoListApp = new ToDoListApp("To-Do-List");
        toDoListApp.setVisible(true);
    }
}
