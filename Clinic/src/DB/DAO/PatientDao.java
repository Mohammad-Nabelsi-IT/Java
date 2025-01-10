package DB.DAO;

import DB.Clinic;
import DB.Patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PatientDao {
    private Connection connection;

    public PatientDao(Connection connection) {
        this.connection = connection;
    }

    public void add(Patient patient) throws SQLException {
        String sql = "insert into patients (name, gender, birth_date, address, phone, mobile, email, disease, medical_diagnosis, clinic_id)values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, patient.getName());
        st.setString(2, patient.getGender().name());
        java.sql.Date bd = new java.sql.Date(patient.getBirthDate().getTime());
        st.setDate(3, bd);
        st.setString(4, patient.getAddress());
        st.setString(5, patient.getPhone());
        st.setString(6, patient.getMobile());
        st.setString(7, patient.getEmail());
        st.setString(8, patient.getDisease());
        st.setString(9, patient.getMedicalDiagnosis());
        st.setInt(10, patient.getClinic().getId());
        st.executeUpdate();
        st.close();
    }

    public void delete(int id) throws SQLException {
        String sql = "delete from patient where id =?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        st.executeUpdate();
        st.close();
    }

    public void update(Patient patientDao) throws SQLException {
        String sql = "update patients set name=?, gender=?" +
                ",birth_date=?,address=?, phone=?, mobile=?, email=?, disease=? ,medical_diagnosis=?, created_at=?, user_id=?,where id=?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, patientDao.getName());
        st.setString(2, patientDao.getGender().name());
        st.setString(3, patientDao.getAddress());
        st.setString(4, patientDao.getPhone());
        st.setString(5, patientDao.getMobile());
        st.setString(6, patientDao.getEmail());
        st.setString(7, patientDao.getDisease());
        st.setString(8, patientDao.getMedicalDiagnosis());
        st.setDate(9, new java.sql.Date(patientDao.getCreatedAt().getTime()));
        st.setInt(10, patientDao.getClinic().getId());
        st.setInt(11, patientDao.getId());
        st.executeUpdate();
        st.close();

    }

    public Patient get(int id) throws SQLException {
        String sql = "select id, name, gender, birth_date, address, phone, mobile, email, disease, medical_diagnosis, created_at, clinic_id,user_id from patients  where id=?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        ResultSet resultSet = st.executeQuery();
        if (resultSet.next()) {
            Patient pDoc = new Patient();
            pDoc.setId(resultSet.getInt("id"));
            pDoc.setName(resultSet.getString("name"));
            if (resultSet.getString("gender").equals("male")) {
                pDoc.setGender(Patient.Gender.male);
            } else {
                pDoc.setGender(Patient.Gender.female);
            }
            pDoc.setBirthDate(resultSet.getDate("birth_date"));
            pDoc.setAddress(resultSet.getString("address"));
            pDoc.setPhone(resultSet.getString("phone"));
            pDoc.setMobile(resultSet.getString("Mobile"));
            pDoc.setEmail(resultSet.getString("Email"));
            pDoc.setDisease(resultSet.getString("disease"));
            pDoc.setMedicalDiagnosis(resultSet.getString("medical_diagnosis"));
            pDoc.setCreatedAt(resultSet.getDate("created_at"));
            ClinicDao clinicDao = new ClinicDao(connection);
            Clinic clinic = clinicDao.get(resultSet.getInt("clinic_id"));
            pDoc.setClinic(clinic);
            return pDoc;
        } else {
            return null;
        }
    }
    public ArrayList<Patient> get() throws SQLException {
        String sql = "select id, name, gender, birth_date, address, phone, mobile, email, disease, medical_diagnosis, created_at, clinic_id,user_id from patients";
        PreparedStatement st = connection.prepareStatement(sql);

        ArrayList<Patient> list = new ArrayList<>();
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            Patient pDoc = new Patient();
            pDoc.setId(resultSet.getInt("id"));
            pDoc.setName(resultSet.getString("name"));
            if (resultSet.getString("gender").equals("male")) {
                pDoc.setGender(Patient.Gender.male);
            } else {
                pDoc.setGender(Patient.Gender.female);
            }
            pDoc.setBirthDate(resultSet.getDate("birth_date"));
            pDoc.setAddress(resultSet.getString("address"));
            pDoc.setPhone(resultSet.getString("phone"));
            pDoc.setMobile(resultSet.getString("Mobile"));
            pDoc.setEmail(resultSet.getString("Email"));
            pDoc.setDisease(resultSet.getString("disease"));
            pDoc.setMedicalDiagnosis(resultSet.getString("medical_diagnosis"));
            pDoc.setCreatedAt(resultSet.getDate("created_at"));
            ClinicDao clinicDao = new ClinicDao(connection);
            Clinic clinic = clinicDao.get(resultSet.getInt("clinic_id"));
            pDoc.setClinic(clinic);

            list.add(pDoc);
        }
        return list;
    }

    public ArrayList<Patient> getByClinic(int clinicId) throws SQLException {
        String sql = "select id, name, gender, birth_date, address, phone, mobile, email, disease, medical_diagnosis, created_at, clinic_id,user_id from patients where clinic_id =?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, clinicId);
        ArrayList<Patient> list = new ArrayList<>();
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            Patient pDoc = new Patient();
            pDoc.setId(resultSet.getInt("id"));
            pDoc.setName(resultSet.getString("name"));
            if (resultSet.getString("gender").equals("male")) {
                pDoc.setGender(Patient.Gender.male);
            } else {
                pDoc.setGender(Patient.Gender.female);
            }
            pDoc.setBirthDate(resultSet.getDate("birth_date"));
            pDoc.setAddress(resultSet.getString("address"));
            pDoc.setPhone(resultSet.getString("phone"));
            pDoc.setMobile(resultSet.getString("Mobile"));
            pDoc.setEmail(resultSet.getString("Email"));
            pDoc.setDisease(resultSet.getString("disease"));
            pDoc.setMedicalDiagnosis(resultSet.getString("medical_diagnosis"));
            pDoc.setCreatedAt(resultSet.getDate("created_at"));
            ClinicDao clinicDao = new ClinicDao(connection);
            Clinic clinic = clinicDao.get(resultSet.getInt("clinic_id"));
            pDoc.setClinic(clinic);

            list.add(pDoc);
        }
        return list;
    }
}
