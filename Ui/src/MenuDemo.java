import javax.swing.*;
import java.awt.*;

public class MenuDemo extends JFrame {
    public MenuDemo(String title) {
        super(title);
        this.setSize(500, 400);
        this.setLocation(400, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textField=new JTextField();
        this.getContentPane().add(textField,BorderLayout.NORTH);
        textField.setFont(new Font("Arial",Font.PLAIN,30));
        JPanel panel1=new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.getContentPane().add(panel1);
        panel1.setBackground(Color.DARK_GRAY);
        JButton button1=new JButton("Hello");
        panel1.add(button1);

        JMenuBar jMenuBar = new JMenuBar();
        this.setJMenuBar(jMenuBar);

        JMenu jMenu1 = new JMenu("File");
        jMenuBar.add(jMenu1);

        JMenu jMenu2 = new JMenu("Edit");
        jMenuBar.add(jMenu2);

        JMenu jMenu3 = new JMenu("View");
        jMenuBar.add(jMenu3);

        JMenu jMenu4 = new JMenu("Help");
        //jMenuBar.add(jMenu4);

        JMenuItem menuItemOpen = new JMenuItem("Open");
        JMenuItem menuItemClose = new JMenuItem("Close");

        jMenu1.add(menuItemOpen);
        menuItemOpen.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"Hi Open File");
        });
        menuItemClose.addActionListener(e -> {
            System.exit(0);
        });
        jMenu1.addSeparator();
        jMenu1.add(menuItemClose);
        jMenu1.add(jMenu4);

        JMenuItem menuItemCopy = new JMenuItem("Copy");
        JMenuItem menuItemPaste = new JMenuItem("Paste");
        JMenuItem menuItemDelete = new JMenuItem("Delete");

        jMenu2.add(menuItemCopy);
        jMenu2.addSeparator();
        jMenu2.add(menuItemPaste);
        jMenu2.addSeparator();
        jMenu2.add(menuItemDelete);

        JMenuItem menuItemZoomIn = new JMenuItem("Zoom In" + " (+)");
        JMenuItem menuItemZoomOUt = new JMenuItem("Zoom Out" + " (-)");

        jMenu3.add(menuItemZoomIn);
        jMenu3.addSeparator();
        jMenu3.add(menuItemZoomOUt);

        JMenuItem menuItemShow = new JMenuItem("Show");
        JMenuItem menuItemContact = new JMenuItem("Contact");
        jMenu4.add(menuItemShow);
        jMenu4.addSeparator();
        jMenu4.add(menuItemContact);




        this.setVisible(true);
    }

    public static void main(String[] args) {
        MenuDemo menuDemo = new MenuDemo("Test Menu");

    }
}
