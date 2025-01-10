import javax.swing.*;
import java.awt.*;
import java.io.*;

public class FrameNewFile extends JFrame {
    private JTextArea textArea;

    public FrameNewFile(String title) {
        super(title);
        this.setBounds(1100, 100, 300, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);


        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        //    menue:new/open/save/save as /exite
        JMenuItem menuItemNew = new JMenuItem("New");
        JMenuItem menuItemOpen = new JMenuItem("Open");
        JMenuItem menuItemSave = new JMenuItem("Save");
        JMenuItem menuItemSaveAs = new JMenuItem("Save as");
        JMenuItem menuItemExit = new JMenuItem("Exit");


        menu.add(menuItemNew);
        menuItemNew.addActionListener(e -> {
            textArea.setText("");
            this.setTitle("");
        });
        menu.addSeparator();
        menu.add(menuItemOpen);
        menuItemOpen.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(null);
            if (choice == 0) {
                try {
                    File file = fileChooser.getSelectedFile();
                    this.setTitle(file.getAbsolutePath());

                    FileReader reader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    String line;
                    int c = 0;
                    while ((line = bufferedReader.readLine()) != null) {
                        if (c++ == 0) textArea.setText(line);
                        else textArea.setText(textArea.getText() + "\n" + line);
                    }
                    bufferedReader.close();
                    reader.close();

                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }

        });

        menu.addSeparator();
        menu.add(menuItemSave);
        menuItemSave.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showSaveDialog(null);
            if (choice == 0) {
                try {
                    File file = fileChooser.getSelectedFile();
                    this.setTitle(file.getAbsolutePath());
                    FileWriter writer = new FileWriter(file);
                    PrintWriter out = new PrintWriter(writer);
                    out.println(textArea.getText());
                    out.close();
                    writer.close();


                } catch (IOException ioException) {
                    System.out.println(ioException.getMessage());
                }
            }

        });
        menu.addSeparator();
        menu.add(menuItemSaveAs);
        menu.addSeparator();
        menu.add(menuItemExit);
        menuItemExit.addActionListener(e -> {
            System.exit(0);
        });


        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        this.getContentPane().add(scrollPane);


    }

    public static void main(String[] args) {
        FrameNewFile file = new FrameNewFile("test");
        file.setVisible(true);

    }
}
