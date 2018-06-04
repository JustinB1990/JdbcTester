package com.somat;
import java.sql.*;

public class DatabaseConnector {

    static final String dbUrl = "jdbc:oracle:thin:localhost:1521:xe";
    static final String username = "hr";
    static final String password = "hr";
    static void connect() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, username, password);
        System.out.println("Connection to Oracle Database Successful.");
    }

}
