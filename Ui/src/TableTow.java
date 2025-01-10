import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableTow extends JFrame {
    public TableTow(String title) {
        super(title);
        this.setBounds(500, 100, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        String colon[] = {"No", "Name"};
        DefaultTableModel dtm = new DefaultTableModel(null, colon);
        JTable table = new JTable(dtm);
        JScrollPane scrollPane = new JScrollPane(table);
        this.getContentPane().add(scrollPane);

        JPanel panelNorth = new JPanel();
        this.getContentPane().add(panelNorth, BorderLayout.NORTH);

        JLabel label = new JLabel("Enter Student Name");
        panelNorth.add(label);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 30));
        panelNorth.add(textField);

        JButton buttonAdd = new JButton("ADD");
        panelNorth.add(buttonAdd);

        buttonAdd.addActionListener(e -> {
            int c = dtm.getRowCount() + 1;
            String[] row = {c + "", textField.getText()};
            dtm.addRow(row);
        });

    }

    public static void main(String[] args) {
        TableTow tableTow = new TableTow("test");
        tableTow.setVisible(true);
    }
}
