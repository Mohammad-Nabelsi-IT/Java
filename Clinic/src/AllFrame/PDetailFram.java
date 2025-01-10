package AllFrame;

import DB.Patient;

import javax.swing.*;

public class PDetailFram extends JFrame{
    private JPanel panel1;
    private JTextField textFieldName;
    private JTextField textFieldPhone;
    private JTextField textFieldMobile;
    private JTextField textFieldAddress;
    private JTextField textFieldGender;

    public PDetailFram(Patient patient) {
        getContentPane().add(panel1);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBounds(150, 150, 600, 500);

        textFieldName.setText(patient.getName());
        textFieldPhone.setText(patient.getPhone());
        textFieldMobile.setText(patient.getMobile());
        textFieldGender.setText(patient.getGender().name());

        JTabbedPane tabbedPane = new JTabbedPane();
        panel1.add(tabbedPane);
        tabbedPane.addTab("Documents", new PatientDocumentsMangement(patient));
        tabbedPane.addTab("Prescription", new PrescriptionFrame(patient));

    }
}
