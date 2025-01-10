package AllFrame;

import DB.*;
import DB.DAO.ClinicDao;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private Users users;
    public MainFrame(Users users) {
        this.users=users;
        setTitle("Clinic Program");
        setLocation(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu menu = new JMenu("Manage");
        menuBar.add(menu);

        JMenuItem menuItemManageClinic = new JMenuItem("Manage Clinic");
        menuItemManageClinic.addActionListener(e -> {
            new ClinicFrame(users).setVisible(true);
            this.setVisible(false);
        });

        JMenuItem menuItemUser = new JMenuItem("User");
        menuItemUser.addActionListener(e -> {
            UserFrame f = new UserFrame();
            f.setVisible(true);
            this.setVisible(false);
        });

        menu.add(menuItemManageClinic);




//        JMenuItem menuItemPatientDocuments = new JMenuItem("Patient Documents");
//        menu.add(menuItemPatientDocuments);
//        menuItemPatientDocuments.addActionListener(e -> {
//            PatientDocumentsMangement patientDocuments = new PatientDocumentsMangement();
//            patientDocuments.setVisible(true);
//            this.setVisible(false);
//        });
//
//        JMenuItem menuItemPrescriptionManage = new JMenuItem("Prescription Manage");
//        menu.add(menuItemPrescriptionManage);
//        menuItemPrescriptionManage.addActionListener(e -> {
////            Prescription prescription = new Prescription();
////            prescription.setVisible(true);
////            this.setVisible(false);
//        });

        JLabel labelUser = new JLabel("Welcome " + users.getName());
        getContentPane().add(labelUser, BorderLayout.NORTH);

        JPanel panelFlow = new JPanel();
        panelFlow.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        getContentPane().add(panelFlow);

        try {
            Connection connection = DBConfig.createConnection();
            ClinicDao clinicDao = new ClinicDao(connection);
            ArrayList<Clinic> list = clinicDao.get();

            for (Clinic clinic : list) {
                JButton button = new JButton("<html><center>" + clinic.getName() + "<br><br>" + clinic.getDoctorName() + "<html><center>");
                button.setPreferredSize(new Dimension(200, 200));
                button.setFont(new Font("Arial", Font.BOLD, 18));
                panelFlow.add(button);
                button.addActionListener(e -> {
                    ShowClinicFrame f = new ShowClinicFrame(clinic,users);
                    f.setVisible(true);
                    this.setVisible(false);
                });
            }
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
