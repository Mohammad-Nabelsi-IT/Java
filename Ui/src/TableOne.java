import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableOne extends JFrame {
    public TableOne(String title) {
        super(title);
        this.setBounds(1000, 100, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 22);

        String[] colon = {"No", "Name", "Phone"};
        String[][] row = {{"1", "Mohammad", "45646"},

        };
        DefaultTableModel dtm =new DefaultTableModel(row,colon);
        JTable table = new JTable(dtm);
        JScrollPane scrollPane = new JScrollPane(table);
        this.getContentPane().add(scrollPane);

    }

    public static void main(String[] args) {
        TableOne table = new TableOne("Table");
        table.setVisible(true);
    }
}
