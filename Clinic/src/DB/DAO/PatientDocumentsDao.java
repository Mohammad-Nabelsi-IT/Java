package DB.DAO;


import DB.Patient;
import DB.PatientDocuments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PatientDocumentsDao {
    private Connection connection;

    public PatientDocumentsDao(Connection connection) {
        this.connection = connection;
    }

    public void add(PatientDocuments patientDoc) throws SQLException {
        String sql = "insert into patient_documents ( name, file, type, result, comments, patient_id)values(?,?,?,?,?,?)";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, patientDoc.getName());
        st.setString(2, patientDoc.getFile());
        st.setString(3, patientDoc.getType());
        st.setString(4, patientDoc.getResult());
        st.setString(5, patientDoc.getComments());
        if(patientDoc.getPatient()!= null){
            st.setInt(6, patientDoc.getPatient().getId());
        }
        st.executeUpdate();
        st.close();
    }

    public void delete(int id) throws SQLException {
        String sql = "delete from patient_documents where id =?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        st.executeUpdate();
        st.close();
    }

    public void update(PatientDocuments patientDoc) throws SQLException {
        String sql = "update patient_documents set name=?, file=?" +
                ", type=?, result=?, comments=?, created_at=?, patient_id=? where id=?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, patientDoc.getName());
        st.setString(2, patientDoc.getFile());
//        st.setString(3, patientDoc.getType());
        st.setString(4, patientDoc.getResult());
        st.setString(5, patientDoc.getComments());
//        st.setString(6, patientDoc.getCreatedAt());
//        st.setInt(7, patientDoc.getPatientId());
        st.setInt(8, patientDoc.getId());
        st.executeUpdate();
        st.close();

    }

    public PatientDocuments get(int id) throws SQLException {
        String sql = "select name, file, type, result, comments, created_at, patient_id from patient_documents where id=?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        ResultSet resultSet = st.executeQuery();
        if (resultSet.next()) {
            PatientDocuments pDoc = new PatientDocuments();
            pDoc.setId(id);
            pDoc.setName(resultSet.getString("name"));
            pDoc.setFile(resultSet.getString("file"));
            pDoc.setType(resultSet.getString("type"));
            pDoc.setResult(resultSet.getString("result"));
            pDoc.setComments(resultSet.getString("comments"));
            pDoc.setCreatedAt(resultSet.getDate("created_at"));
            PatientDao patientDao= new PatientDao(connection);
            Patient patient = patientDao.get(resultSet.getInt("patient_id"));
            pDoc.setPatient(patient);


            return pDoc;
        } else {
            return null;
        }
    }

    public ArrayList<PatientDocuments> get() throws SQLException {
        String sql = "select id ,name, file, type, result, comments, created_at, patient_id from patient_documents";
        PreparedStatement st = connection.prepareStatement(sql);
        ArrayList<PatientDocuments> list = new ArrayList<>();
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            PatientDocuments pDoc = new PatientDocuments();
            pDoc.setId(resultSet.getInt("id"));
            pDoc.setName(resultSet.getString("name"));
            pDoc.setFile(resultSet.getString("file"));
            pDoc.setType(resultSet.getString("type"));
            pDoc.setResult(resultSet.getString("result"));
            pDoc.setComments(resultSet.getString("comments"));
            pDoc.setCreatedAt(resultSet.getDate("created_at"));
            PatientDao patientDao= new PatientDao(connection);
            Patient patient = patientDao.get(resultSet.getInt("patient_id"));
            pDoc.setPatient(patient);
            list.add(pDoc);
        }
        return list;
    }

    public ArrayList<PatientDocuments> getByPId(int pId) throws SQLException {
        String sql = "select id ,name, file, type, result, comments, created_at, patient_id from patient_documents where patient_id=?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1,pId);
        ArrayList<PatientDocuments> list = new ArrayList<>();
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            PatientDocuments pDoc = new PatientDocuments();
            pDoc.setId(resultSet.getInt("id"));
            pDoc.setName(resultSet.getString("name"));
            pDoc.setFile(resultSet.getString("file"));
            pDoc.setType(resultSet.getString("type"));
            pDoc.setResult(resultSet.getString("result"));
            pDoc.setComments(resultSet.getString("comments"));
            pDoc.setCreatedAt(resultSet.getDate("created_at"));
            PatientDao patientDao= new PatientDao(connection);
            Patient patient = patientDao.get(resultSet.getInt("patient_id"));
            pDoc.setPatient(patient);
            list.add(pDoc);
        }
        return list;
    }
}
