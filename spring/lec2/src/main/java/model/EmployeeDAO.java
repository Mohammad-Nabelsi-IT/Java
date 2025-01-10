package model;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {
    private Connection connection;

    public EmployeeDAO(Connection connection) {
        this.connection = connection;
    }

    public void add(Employee employee) throws SQLException {
        String sql = "INSERT INTO employees (first_name, last_name, email, phone ,job)values (?,?,?,?,?)";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, employee.getfName());
        st.setString(2, employee.getlName());
        st.setString(3, employee.getEmail());
        st.setString(4, employee.getPhone());
        st.setString(5, employee.getJob());
        st.executeUpdate();
        st.close();
    }
}
