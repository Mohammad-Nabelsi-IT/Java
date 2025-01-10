import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class HotelReservation extends JFrame {
    private ButtonGroup bg;
    private JTextField textFieldGustName;
    private JTextField textFieldPhoneNumber;
    private JTextField textFieldCheckInDate;
    private JTextField textFieldCheckOutDate;
    private JRadioButton radioButtonSingle;
    private JRadioButton radioButtonSuite;
    private JRadioButton radioButtonDouble;
    private JComboBox cb;
    private JList list;
    private JButton buttonSave;
    private JButton buttonClear;
    private JButton buttonAddReservation;
    private JTextField textFieldDisplay;
    private DefaultTableModel dtm;

    public HotelReservation(String title) {
        super(title);
        this.setBounds(500, 10, 900, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.PLAIN, 18);
        ImageIcon icon = new ImageIcon("C:\\java\\java-level-one\\Ui\\src\\hotel.png");
        this.setIconImage(icon.getImage());

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);


        JMenu menuOption = new JMenu("Option");
        menuBar.add(menuOption);

        JMenuItem menuItemNewReservation = new JMenuItem("New Reservation");
        menuItemNewReservation.addActionListener(e -> {
            Delete();
        });
        menuOption.add(menuItemNewReservation);

        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.addActionListener(e -> System.exit(0));
        menuOption.add(menuItemExit);

        JPanel panelCenter = new JPanel(null);
        panelCenter.setPreferredSize(new Dimension(450, 600));
        panelCenter.setBackground(Color.cyan);
        this.getContentPane().add(panelCenter, BorderLayout.WEST);

        JLabel labelGustName = new JLabel("Gust Name :");
        labelGustName.setFont(font);
        labelGustName.setBounds(10, 20, 200, 50);
        panelCenter.add(labelGustName);

        textFieldGustName = new JTextField();
        textFieldGustName.setBounds(150, 30, 200, 30);
        panelCenter.add(textFieldGustName);

        JLabel labelPhoneNumber = new JLabel("Phone Number :");
        labelPhoneNumber.setFont(font);
        labelPhoneNumber.setBounds(10, 70, 200, 50);
        panelCenter.add(labelPhoneNumber);

        textFieldPhoneNumber = new JTextField();
        textFieldPhoneNumber.setBounds(150, 80, 200, 30);
        panelCenter.add(textFieldPhoneNumber);

        JLabel labelCheckInDate = new JLabel("Check In Date :");
        labelCheckInDate.setFont(font);
        labelCheckInDate.setBounds(10, 120, 200, 50);
        panelCenter.add(labelCheckInDate);

        textFieldCheckInDate = new JTextField();
        textFieldCheckInDate.setBounds(150, 130, 200, 30);
        panelCenter.add(textFieldCheckInDate);

        JLabel labelCheckOutDate = new JLabel("Check Out Date :");
        labelCheckOutDate.setFont(font);
        labelCheckOutDate.setBounds(10, 170, 200, 50);
        panelCenter.add(labelCheckOutDate);

        textFieldCheckOutDate = new JTextField();
        textFieldCheckOutDate.setBounds(150, 180, 200, 30);
        panelCenter.add(textFieldCheckOutDate);

        JLabel labelRoomType = new JLabel("RoomType :");
        labelRoomType.setFont(font);
        labelRoomType.setBounds(10, 220, 200, 50);
        panelCenter.add(labelRoomType);

        radioButtonSingle = new JRadioButton("Single");
        radioButtonSingle.setFont(font);
        radioButtonSingle.setBackground(Color.cyan);
        radioButtonSingle.setBounds(150, 220, 100, 50);
        panelCenter.add(radioButtonSingle);

        radioButtonDouble = new JRadioButton("Double");
        radioButtonDouble.setBackground(Color.cyan);
        radioButtonDouble.setFont(font);
        radioButtonDouble.setBounds(250, 220, 100, 50);
        panelCenter.add(radioButtonDouble);

        radioButtonSuite = new JRadioButton("Suite");
        radioButtonSuite.setFont(font);
        radioButtonSuite.setBackground(Color.cyan);
        radioButtonSuite.setBounds(350, 220, 100, 50);
        panelCenter.add(radioButtonSuite);

        bg = new ButtonGroup();
        bg.add(radioButtonSingle);
        bg.add(radioButtonDouble);
        bg.add(radioButtonSuite);

        JLabel labelMealPlan = new JLabel("Meal Plan :");
        labelMealPlan.setFont(font);
        labelMealPlan.setBounds(10, 270, 200, 50);
        panelCenter.add(labelMealPlan);

        String plan[] = {"", "Breakfast Only", "Half Board", "Full Board"};
        cb = new JComboBox(plan);
        cb.setBackground(Color.green);
        cb.setFont(font);
        cb.setBounds(150, 290, 200, 30);
        panelCenter.add(cb);

        JLabel labelRoomAmenities = new JLabel("Amenities :");
        labelRoomAmenities.setFont(font);
        labelRoomAmenities.setBounds(10, 320, 200, 50);
        panelCenter.add(labelRoomAmenities);

        String plus[] = {"Wifi", "Tv", "Minibar", "Ice"};
        list = new JList(plus);
        list.setBackground(Color.orange);
        list.setFont(font);
        JScrollPane scrollPaneList = new JScrollPane(list);
        scrollPaneList.setBounds(150, 340, 200, 80);
        panelCenter.add(scrollPaneList);

        JPanel panelSouth = new JPanel();
        this.getContentPane().add(panelSouth, BorderLayout.SOUTH);
        panelSouth.setBackground(Color.BLACK);

        buttonSave = new JButton("Save");
        buttonSave.addActionListener(e -> {
            String data = "Gust Name :" + textFieldGustName.getText() + " " +
                    "\nPhone Number :" + textFieldPhoneNumber.getText() + " " +
                    "\nCheck In Date :" + textFieldCheckInDate.getText() + " " +
                    "\nCheck Out Date :" + textFieldCheckOutDate.getText() + " ";

            data += "\nRoom Type :";
            if (radioButtonSingle.isSelected()) data += radioButtonSingle.getText();
            else if (radioButtonDouble.isSelected()) data += radioButtonDouble.getText();
            else if (radioButtonSuite.isSelected()) data += radioButtonSuite.getText();

            data += "\nMeal Plan : " + cb.getSelectedItem();
            data += "\nAmenities : " + list.getSelectedValuesList();

            JOptionPane.showMessageDialog(null, data);
            textFieldDisplay.setText("Hotel Reservation Saved Sucessfuly");

        });
        buttonSave.setFont(font);
        buttonSave.setBackground(Color.green);
        panelSouth.add(buttonSave);

        buttonClear = new JButton("Clear");
        buttonClear.addActionListener(e -> {
            Delete();
        });
        buttonClear.setFont(font);
        buttonClear.setBackground(Color.red);
        panelSouth.add(buttonClear);

        buttonAddReservation = new JButton("Add Reservation");
        buttonAddReservation.setFont(font);
        buttonAddReservation.setBackground(Color.green);
        buttonAddReservation.addActionListener(e -> {
            addToTable();
        });
        panelSouth.add(buttonAddReservation);

        textFieldDisplay = new JTextField();
        textFieldDisplay.setEditable(false);
        textFieldDisplay.setBackground(Color.magenta);
        textFieldDisplay.setFont(font);
        textFieldDisplay.setPreferredSize(new Dimension(300, 30));
        panelSouth.add(textFieldDisplay);


        String colon[] = {"No", "Guest Name", "Phone Number", "Check-In Date", "Check-Out Date", "Room Type"
                , "Meal Plan", "Room Amenities"};
        dtm = new DefaultTableModel(null, colon);
        JTable table = new JTable(dtm);
        JScrollPane scrollPane = new JScrollPane(table);
        this.getContentPane().add(scrollPane);
    }

    private void addToTable() {
        String no = String.valueOf(dtm.getRowCount() + 1);
        String name = textFieldGustName.getText();
        String phone = textFieldPhoneNumber.getText();
        String chickIn = textFieldCheckInDate.getText();
        String checkOut = textFieldCheckOutDate.getText();
        String roomType = radioButtonSingle.isSelected() ? "Single" :
                radioButtonDouble.isSelected() ? "Double" : "Suite";
        String mealPlan = cb.getSelectedItem().toString();
        String aList = list.getSelectedValuesList().toString();

        String[] row = {no, name, phone, chickIn, checkOut, roomType, mealPlan, aList};
        dtm.addRow(row);


    }

    void Delete() {
        textFieldGustName.setText(null);
        textFieldPhoneNumber.setText(null);
        textFieldCheckInDate.setText(null);
        textFieldCheckOutDate.setText(null);
        textFieldDisplay.setText(null);
        cb.setSelectedIndex(0);
        list.clearSelection();
        bg.clearSelection();

    }

    public static void main(String[] args) {
        HotelReservation hotel = new HotelReservation("Hotel");
        hotel.setVisible(true);
    }

}
