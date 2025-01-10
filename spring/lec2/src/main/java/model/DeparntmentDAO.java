package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeparntmentDAO {
    private Connection connection;

    public DeparntmentDAO(Connection connection) {
        this.connection = connection;
    }

    public void add(Department department) throws SQLException {
        String sql = "insert into department (name, manager)values(?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, department.getName());
        ps.setString(2, department.getManager());
        ps.executeUpdate();
        ps.close();

    }
}
