package DB.DAO;

import DB.Appointment;
import DB.Clinic;
import DB.Patient;
import DB.Users;

import java.sql.*;
import java.util.ArrayList;

public class AppointmentDao {
    public Connection connection;

    public AppointmentDao(Connection connection) {
        this.connection = connection;
    }

    public void add(Appointment ab) throws SQLException {
        String sql = "insert into appointments ( appointment_date, clinic_id, patient_id, medical_diagnosis, notes, bill_amount, user_id)values(?,?,?,?,?,?,?)";
        PreparedStatement st = connection.prepareStatement(sql);
        Date pd=new Date(ab.getAppointmentDate().getTime());
        st.setDate(1,pd);
        st.setInt(2, ab.getClinic().getId());
        st.setInt(3, ab.getPatient().getId());
        st.setString(4, ab.getMedicalDiagnosis());
        st.setString(5, ab.getNotes());
        st.setDouble(6, ab.getBillAmount());
        st.setInt(7, ab.getUser().getId());
        st.executeUpdate();
        st.close();
    }

    public void delete(int id) throws SQLException {
        String sql = "delete from appointments where id =?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        st.executeUpdate();
        st.close();
    }

    public void update(Appointment ab) throws SQLException {
        String sql = "update appointments set appointment_date=?, clinic_id=?, patient_id=?, medical_diagnosis=?, notes=?, bill_amount=?, user_id=? where id=?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setDate(1, new Date(ab.getAppointmentDate().getTime()));
        st.setInt(2, ab.getClinic().getId());
        st.setInt(3, ab.getPatient().getId());
        st.setString(4, ab.getMedicalDiagnosis());
        st.setString(5, ab.getNotes());
        st.setDouble(6, ab.getBillAmount());
        st.setInt(7, ab.getUser().getId());
        st.setInt(8,ab.getId());
        st.executeUpdate();
        st.close();

    }

    public Appointment get(int id) throws SQLException {
        String sql = "select id, appointment_date, clinic_id, patient_id, medical_diagnosis, notes, bill_amount, user_id from appointments where id=?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        ResultSet resultSet = st.executeQuery();

        if (resultSet.next()) {
            Appointment ab = new Appointment();
            ab.setId(resultSet.getInt("id"));
            ab.setAppointmentDate(resultSet.getDate("appointment_date"));
            ab.setMedicalDiagnosis(resultSet.getString("medical_diagnosis"));
            ab.setNotes(resultSet.getString("notes"));
            ab.setBillAmount(resultSet.getDouble("bill_amount"));

            ClinicDao clinicDao = new ClinicDao(connection);
            Clinic clinic = clinicDao.get(resultSet.getInt("clinic_id"));
            ab.setClinic(clinic);

            PatientDao patientDao =new PatientDao(connection);
            Patient patient = patientDao.get(resultSet.getInt("patient_id"));
            ab.setPatient(patient);

            UserDao userDao = new UserDao(connection);
            Users users = userDao.get(resultSet.getInt("user_id"));
            ab.setUser(users);
            return ab;
        } else {
            return null;
        }
    }

    public ArrayList<Appointment> getByClinic(int cid) throws SQLException {
        String sql = "select id, appointment_date, clinic_id, patient_id, medical_diagnosis, notes, bill_amount, user_id from appointments where clinic_id=?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1,cid);
        ArrayList<Appointment> list = new ArrayList<>();
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            Appointment ab = new Appointment();
            ab.setId(resultSet.getInt("id"));
            ab.setAppointmentDate(resultSet.getDate("appointment_date"));
            ab.setMedicalDiagnosis(resultSet.getString("medical_diagnosis"));
            ab.setNotes(resultSet.getString("notes"));
            ab.setBillAmount(resultSet.getDouble("bill_amount"));

            ClinicDao clinicDao = new ClinicDao(connection);
            Clinic clinic = clinicDao.get(cid);
            ab.setClinic(clinic);

            PatientDao patientDao =new PatientDao(connection);
            Patient patient = patientDao.get(resultSet.getInt("patient_id"));
            ab.setPatient(patient);

            UserDao userDao = new UserDao(connection);
            Users users = userDao.get(resultSet.getInt("user_id"));
            ab.setUser(users);
            list.add(ab);
        }
        return list;
    }

}
