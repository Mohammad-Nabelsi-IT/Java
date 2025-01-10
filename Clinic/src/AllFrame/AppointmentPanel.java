package AllFrame;

import DB.*;
import DB.DAO.AppointmentDao;
import DB.DAO.PatientDao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


public class AppointmentPanel  extends JPanel {
    private JPanel panel1;
    private JLabel labelAppointment;
    private JPanel panelNorth;
    private JPanel panelWest;
    private JTextField textFieldAppointmentDate;
    private JTextField textFieldPatient_id;
    private JTextField textFieldClincId;
    private JTextField textFieldMedicalDiagnosis;
    private JTextField textFieldNotes;
    private JTextField textFieldBill_amount;
    private JTextField textFieldUser_id;
    private JLabel labelAppointment_date;
    private JLabel labelPatient_id;
    private JLabel labelClinic_id;
    private JLabel labelMedicalDiagnosis;
    private JLabel labelNotes;
    private JLabel labelBillAmount;
    private JLabel labelUserId;
    private JPanel panelSouth;
    private JButton buttonSave;
    private JButton buttonClear;
    private JComboBox <Patient>comboBoxPatient;
    private Clinic clinic;
    private Users user;
    private DBConfig DbConfig;

    public AppointmentPanel(Clinic clinic , Users user) {
        this.add(panel1);
        this.user=user;
        this.clinic = clinic;
        this.setBounds(150, 100, 700, 550);

        try {
            Connection connection = DBConfig.createConnection();
            PatientDao patientDao = new PatientDao(connection);
            ArrayList<Patient> allPatients= patientDao.getByClinic(clinic.getId());
            for (Patient p: allPatients){
                comboBoxPatient.addItem(p);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

//        comboBoxPatient.setModel(dm);
        buttonSave.addActionListener(e -> {
            try {
                save();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });
        buttonClear.addActionListener(e -> {
            clear();
        });

    }

    private void save() throws SQLException {
        try {
            Connection connection = DBConfig.createConnection();
            AppointmentDao appointmentDao = new AppointmentDao(connection);
            Appointment appointment = new Appointment();
            String appointmentDateString = textFieldAppointmentDate.getText();
            if (appointmentDateString.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a valid appointment date.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            java.sql.Date appointmentDate = java.sql.Date.valueOf(appointmentDateString);
            appointment.setAppointmentDate(appointmentDate);

            appointment.setMedicalDiagnosis(textFieldMedicalDiagnosis.getText());
            appointment.setNotes(textFieldNotes.getText());
            appointment.setBillAmount(Double.parseDouble(textFieldBill_amount.getText()));
            appointment.setClinic(clinic);

            Patient patient = (Patient) comboBoxPatient.getSelectedItem();
            appointment.setPatient(patient);
            appointment.setUser(user);

            appointmentDao.add(appointment);

            JOptionPane.showMessageDialog(this, "Appointment added successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {

            JOptionPane.showMessageDialog(this, "Invalid date format. Please use yyyy-MM-dd.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clear() {
        // textFieldId.setText("");
        textFieldAppointmentDate.setText("");
        textFieldClincId.setText("");
        comboBoxPatient.setSelectedIndex(0);
        textFieldMedicalDiagnosis.setText("");
        textFieldNotes.setText("");
        textFieldBill_amount.setText("");
        textFieldUser_id.setText("");
    }
}
