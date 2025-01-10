package AllFrame;

import DB.Clinic;
import DB.DAO.PatientDao;
import DB.DBConfig;
import DB.Patient;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class PatientsFrame extends JPanel {
    private JPanel panel1;
    private JPanel panelNord;
    private JLabel labelPatients;
    private JTextField textFieldName;
    private JTextField textFieldBirthData;
    private JTextField textFieldAddress;
    private JTextField textFieldPhone;
    private JTextField textFieldMobile;
    private JTextField textFieldEmail;
    private JTextField textFieldDisease;
    private JTextField textFieldMD;
    private JPanel panelWest;
    private JLabel labelName;
    private JLabel labelGender;
    private JLabel labelBirthDate;
    private JLabel labelAddress;
    private JLabel labelPhone;
    private JLabel labelMobile;
    private JLabel labelEmail;
    private JLabel labelDisease;
    private JLabel labelMedicalDiagnosis;
    private JButton buttonAdd;
    private JPanel panelSouth;
    private JButton buttonClear;
    private JRadioButton radioButtonMale;
    private JRadioButton radioButtonFemale;
    private Clinic clinic;

    public PatientsFrame(Clinic clinic) {
        this.clinic = clinic;

        buttonClear.addActionListener(e -> {
            textFieldName.setText("");
            textFieldAddress.setText("");
            textFieldPhone.setText("");
            textFieldMobile.setText("");
            textFieldEmail.setText("");
            textFieldDisease.setText("");
            textFieldMD.setText("");
            textFieldBirthData.setText("");
            radioButtonMale.setSelected(false);
            radioButtonFemale.setSelected(false);
        });


        buttonAdd.addActionListener(e -> {
            AddPatient();
        });
        this.add(panel1);
    }

    private void AddPatient() {
        try {
            Connection c = DBConfig.createConnection();
            PatientDao patientDao = new PatientDao(c);

            Patient patient = new Patient();
            patient.setName(textFieldName.getText());
            if (radioButtonMale.isSelected()) {
                patient.setGender(Patient.Gender.male);
            } else {
                patient.setGender(Patient.Gender.female);
            }

            patient.setBirthDate(new Date());
            patient.setAddress(textFieldAddress.getText());
            patient.setMobile(textFieldMobile.getText());
            patient.setPhone(textFieldPhone.getText());
            patient.setEmail(textFieldEmail.getText());
            patient.setDisease(textFieldDisease.getText());
            patient.setMedicalDiagnosis(textFieldMD.getText());
            patient.setClinic(clinic);
            patientDao.add(patient);
            c.close();
            JOptionPane.showMessageDialog(this, "Patient Added Successfully");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
