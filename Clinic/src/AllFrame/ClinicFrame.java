package AllFrame;

import DB.Clinic;
import DB.DAO.ClinicDao;
import DB.DBConfig;
import DB.Users;
import com.sun.tools.javac.Main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClinicFrame extends JFrame {
    private JPanel panel1;
    private JPanel panelNorth;
    private JTextField textFieldName;
    private JTextField textFieldSpecilty;
    private JTextField textFieldAddress;
    private JTextField textFieldPhone;
    private JTextField textFieldMobile;
    private JTextField textFieldEmail;
    private JTextField textFieldDoctorName;
    private JButton buttonSave;
    private JLabel labelName;
    private JLabel LabelSpecialty;
    private JLabel LabelAddress;
    private JLabel LabelPhone;
    private JLabel LabelMobile;
    private JLabel LabelEmail;
    private JLabel LabelDoctor_name;
    private JLabel LabelManageClinic;
    private JPanel panelSouth;
    private JButton buttonClear;
    private JButton buttonDelete;
    private JButton buttonHome;
    private DefaultTableModel dtm;
    private JTable table;
    private ArrayList<Clinic> clinicArrayList;
    private boolean editAble = true;
private Users user;
    public  ClinicFrame(Users user) {
        this.user=user;
        setBounds(150, 150, 700, 600);
        getContentPane().add(panel1);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        String[] columns = {"id", "name", "specialty", "address", "phone", "mobile", "email", "doctor_name"};
        dtm = new DefaultTableModel(null, columns);
        table = new JTable(dtm);
        Font font = new Font("Arial", Font.PLAIN, 18);
        table.setFont(font);
        table.setForeground(new Color(119, 164, 18));//rgb(119, 164, 18)
        table.getTableHeader().setFont(font);
        table.getTableHeader().setForeground(Color.blue);
        fillTable();
        JScrollPane scrollPane = new JScrollPane(table);
        panel1.add(scrollPane);
        buttonSave.addActionListener(e -> {
            save();
        });

        buttonClear.addActionListener(e -> {
            clear();
        });

        buttonDelete.addActionListener(e -> {
            try {
                delete();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });

        buttonHome.addActionListener(e -> {
            showMain();
            this.setVisible(false);
        });

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                showMain();
            }
        });
    }

    private void showMain(){
        AllFrame.MainFrame mainFrame = new AllFrame.MainFrame(user);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void save() {
        try {
            Connection c = DBConfig.createConnection();
            ClinicDao clinicDao = new ClinicDao(c);

            Clinic clinic = new Clinic();
            clinic.setName(textFieldName.getText());
            clinic.setSpecialty(textFieldSpecilty.getText());
            clinic.setDoctorName(textFieldDoctorName.getText());
            clinic.setMobile(textFieldMobile.getText());
            clinic.setPhone(textFieldPhone.getText());
            clinic.setEmail(textFieldEmail.getText());
            clinic.setAddress(textFieldAddress.getText());

            clinicDao.add(clinic);
            c.close();
            fillTable();
            JOptionPane.showMessageDialog(this, "Clinic Added Successfully");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void fillTable() {
        dtm.setRowCount(0);
        try {
            Connection cn = DBConfig.createConnection();
            ClinicDao clinicDao = new ClinicDao(cn);
            ArrayList<Clinic> clinicArrayList = clinicDao.get();
            for (Clinic clinic : clinicArrayList) {
                String[] row = {
                        clinic.getId() + "",
                        clinic.getName(),
                        clinic.getSpecialty(),
                        clinic.getAddress(),
                        clinic.getPhone(),
                        clinic.getMobile(),
                        clinic.getEmail(),
                        clinic.getDoctorName()
                };
                dtm.addRow(row);
                cn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error retrieving clinics: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void clear() {
        textFieldName.setText(null);
        textFieldSpecilty.setText(null);
        textFieldDoctorName.setText(null);
        textFieldMobile.setText(null);
        textFieldPhone.setText(null);
        textFieldEmail.setText(null);
        textFieldAddress.setText(null);
        clinicArrayList.clear();
    }

    void delete() throws SQLException {
        int row = table.getSelectedRow();
        int id = Integer.parseInt((String) dtm.getValueAt(row, 0));
        try {
            Connection connection = DBConfig.createConnection();
            ClinicDao clinic = new ClinicDao(connection);
            clinic.delete(id);
            dtm.removeRow(row);
            JOptionPane.showMessageDialog(this ,"Clinic Deleted Successfully");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
