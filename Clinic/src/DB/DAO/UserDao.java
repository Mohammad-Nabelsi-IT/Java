package DB.DAO;



import DB.Clinic;
import DB.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDao {
    public Connection connection;

    public UserDao(Connection connection) {
        this.connection = connection;
    }

    //id, name, role, email, password
    public void add(Users users) throws SQLException {
        String sql = "insert into users (id, name, role, email, password)values(?,?,?,?,?)";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, users.getId());
        st.setString(2, users.getName());
        st.setString(3, users.getRole());
        st.setString(4, users.getEmail());
        st.setString(5, users.getPassword());
        st.executeUpdate();
        st.close();
    }

    public void delete(int id) throws SQLException {
        String sql = "delete from users where id =?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        st.executeUpdate();
        st.close();
    }

    public void update(Users users) throws SQLException {
        String sql = "update users set name=?, role=? email=?, password=? where id=?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, users.getName());
        st.setString(2, users.getRole());
        st.setString(3, users.getEmail());
        st.setString(4, users.getPassword());
        st.executeUpdate();
        st.close();

    }

    public Users get(int id) throws SQLException {
        String sql = "select name,role, email, password from users where id=?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        ResultSet resultSet = st.executeQuery();
        if (resultSet.next()) {
            Users users = new Users();
            users.setId(id);
            users.setName(resultSet.getString("name"));
           // users.setRole(resultSet.getString("role"));
            users.setEmail(resultSet.getString("email"));
            users.setPassword(resultSet.getString("password"));
            return users;
        } else {
            return null;
        }
    }

    public ArrayList<Users> get() throws SQLException {
        String sql = "select id ,name,role, email,password from users";
        PreparedStatement st = connection.prepareStatement(sql);
        ArrayList<Users> list = new ArrayList<>();
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            Users users = new Users();
            users.setId(resultSet.getInt("id"));
            users.setName(resultSet.getString("name"));
            //users.setRole(resultSet.getString("role"));
            users.setEmail(resultSet.getString("Email"));
            users.setPassword(resultSet.getString("password"));
            list.add(users);
        }
        return list;
    }
}
