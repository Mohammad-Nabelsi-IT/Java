package DB.DAO;

import DB.Clinic;
import DB.Patient;
import DB.Prescription;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PrescriptionDao {
    private Connection connection;

    public PrescriptionDao(Connection connection) {
        this.connection = connection;
    }

    public void add(Prescription pre) throws SQLException {
        String sql = "insert into prescriptions ( medicine_name, dosage, duration, patient_id)values(?,?,?,?)";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, pre.getMedicineName());
        st.setString(2, pre.getDosage());
        st.setString(3, pre.getDuration());
        st.setInt(4,pre.getPatient().getId());
        st.executeUpdate();
        st.close();
    }

    public void delete(int id) throws SQLException {
        String sql = "delete from prescriptions where id =?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        st.executeUpdate();
        st.close();
    }

    public void update(Prescription pre) throws SQLException {
        String sql = "update prescriptions set medicine_name=?, dosage=?, duration=?, patient_id=? where id=?";
        PreparedStatement st = connection.prepareStatement(sql);

        st.setString(1, pre.getMedicineName());
        st.setString(2, pre.getDosage());
        st.setString(3, pre.getDuration());
        st.setInt(4, pre.getPatient().getId());
        st.setInt(5, pre.getId());
        st.executeUpdate();
        st.close();

    }

    public Prescription get(int id) throws SQLException {
        String sql = "select medicine_name, dosage, duration, patient_id from prescriptions where id=?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        ResultSet resultSet = st.executeQuery();
        if (resultSet.next()) {
            Prescription pre = new Prescription();
            pre.setId(id);
            pre.setMedicineName(resultSet.getString("medicine_name"));
            pre.setDosage(resultSet.getString("dosage"));
            pre.setDuration(resultSet.getString("duration"));
            PatientDao patientDao=new PatientDao(connection);
            Patient patient= patientDao.get(resultSet.getInt("patient_id"));
            pre.setPatient(patient);

            return pre;
        } else {
            return null;
        }
    }

    public ArrayList<Prescription> get() throws SQLException {
        String sql = "select id, medicine_name, dosage, duration, patient_id from prescriptions";
        PreparedStatement st = connection.prepareStatement(sql);
        ArrayList<Prescription> list = new ArrayList<>();
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            Prescription pre = new Prescription();
            pre.setId(resultSet.getInt("id"));
            pre.setMedicineName(resultSet.getString("medicine_name"));
            pre.setDosage(resultSet.getString("dosage"));
            pre.setDuration(resultSet.getString("duration"));
            PatientDao patientDao=new PatientDao(connection);
            Patient patient= patientDao.get(resultSet.getInt("patient_id"));
            pre.setPatient(patient);
            list.add(pre);
        }
        return list;
    }

    public ArrayList<Prescription> getByPId(int pid) throws SQLException {
        String sql = "select id,medicine_name,dosage,duration,patient_id from prescriptions where patient_id=?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1,pid);
        ArrayList<Prescription> list = new ArrayList<>();
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            Prescription pr = new Prescription();
            pr.setId(resultSet.getInt("id"));
            pr.setMedicineName(resultSet.getString("Medicine_Name"));
            pr.setDosage(resultSet.getString("Dosage"));
            pr.setDuration(resultSet.getString("Duration"));
            PatientDao patientDao=new PatientDao(connection);
            Patient patient= patientDao.get(resultSet.getInt("patient_id"));
            pr.setPatient(patient);
            list.add(pr);
        }
        return list;
    }
}
