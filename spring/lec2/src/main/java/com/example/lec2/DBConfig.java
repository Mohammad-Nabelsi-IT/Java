package com.example.lec2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
    public static Connection createConnection() throws SQLException {
        String dbURL = "jdbc:mysql://127.0.0.1:3306/hr2";
        return DriverManager.getConnection(dbURL, "root", "Bmwe602114106");
    }
}
