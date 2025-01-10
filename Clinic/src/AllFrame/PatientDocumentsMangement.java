package AllFrame;

import DB.DAO.PatientDao;
import DB.DAO.PatientDocumentsDao;
import DB.DBConfig;
import DB.Patient;
import DB.PatientDocuments;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class PatientDocumentsMangement extends JPanel{
    private JPanel panel1;
    private JLabel labelPatientDocumentsMangement;
    private JPanel panelWest;
    private JTextField textFieldName;
    private JTextField textFieldFile;
    private JTextField textFieldComments;
    private JTextField textFieldResult;
    private JTextField textFieldCreatedAt;
    private JLabel labelName;
    private JLabel labelFile;
    private JLabel labelType;
    private JLabel labelComments;
    private JLabel labelResult;
    private JTextField textFieldPatiantId;
    private JButton buttonAdd;
    private JButton buttonClear;
    private JPanel panelNorth;
    private JPanel panelSouth;
    private DefaultTableModel dtm;
    private JTable table;
    private JComboBox<String> comboBoxType;
    private JComboBox<Patient> comboBoxPatient;
    private Patient patient;

    public PatientDocumentsMangement(Patient patient) {
        this.patient = patient;
        this.setBounds(150, 100, 700, 500);
        setLayout(new BorderLayout());
        this.add(panel1);


        String[] columns = {"id", "name", "file", "type", "result", "comments", " created_at", " patient_id"};
        dtm = new DefaultTableModel(null, columns);
        table = new JTable(dtm);
        Font font = new Font("Arial", Font.PLAIN, 20);
        table.setFont(font);
        table.setForeground(Color.DARK_GRAY);
        table.getTableHeader().setFont(font);
        table.getTableHeader().setBackground(new Color(100, 227, 212));
        fillTable();
        JScrollPane scrollPane = new JScrollPane(table);
        panel1.add(scrollPane);


        buttonAdd.addActionListener(e -> {
            save();
        });
    }

    private void save() {
        try {

            Connection connection = DBConfig.createConnection();
            PatientDocumentsDao patientDocumentsDao = new PatientDocumentsDao(connection);
            DB.PatientDocuments patientDocuments = new DB.PatientDocuments();
            patientDocuments.setName(textFieldName.getText());
            patientDocuments.setFile(textFieldFile.getText());
            patientDocuments.setResult(textFieldResult.getText());
            patientDocuments.setComments(textFieldComments.getText());
            patientDocuments.setCreatedAt(new Date());
            String type = (String) comboBoxType.getSelectedItem();

            patientDocuments.setType(type);

            patientDocuments.setPatient(patient);
            patientDocumentsDao.add(patientDocuments);
            fillTable();

            JOptionPane.showMessageDialog(this, "Patient Document added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Patient Document added  Error");
        }
    }

    private void fillTable() {
        dtm.setRowCount(0);
        try {
            Connection pd = DBConfig.createConnection();
            PatientDocumentsDao patientDocumentsDao = new PatientDocumentsDao(pd);
            ArrayList<PatientDocuments> documentsList = patientDocumentsDao.getByPId(patient.getId());

            for (DB.PatientDocuments document : documentsList) {
                String[] row = {
                        document.getId() +"",
                        document.getName(),
                        document.getFile(),
                        document.getType(),
                        document.getResult(),
                        document.getComments(),
                        document.getCreatedAt().toString(),
                        document.getPatient().getName()

                };
                dtm.addRow(row);
            }
            pd.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        buttonClear.addActionListener(e -> {

            textFieldName.setText("");
            textFieldFile.setText("");
            textFieldResult.setText("");
            textFieldComments.setText("");
            textFieldCreatedAt.setText("");
//            textFieldPatiantId.setText("");
        });
        table.getModel().addTableModelListener(e -> {
            int row = e.getFirstRow();
            int col = e.getColumn();
            if (row >= 0 && row < table.getRowCount() && col >= 0 && col < table.getColumnCount()) {
                String value = (String) table.getValueAt(row, col);
                String patientDocuments = (String) table.getValueAt(row, 0);
                try {
                    Connection pd = DBConfig.createConnection();
                    PatientDocumentsDao patientDocumentsDao = new PatientDocumentsDao(pd);
                    pd.close();
                } catch (SQLException exception) {
                    throw new RuntimeException();
                }
            }
        });
    }


}
