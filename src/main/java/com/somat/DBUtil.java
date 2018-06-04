package com.somat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String oraUser = "hr";
    private static final String oraPwd = "hr";
    private static final String oraCS = "jdbc:oracle:thin:@localhost:1521:xe";

    public static Connection getConnection(DBType dbType) throws SQLException {
        switch (dbType){
            case ORADB:
                return DriverManager.getConnection(oraCS, oraUser, oraPwd);

            default:
                return null;
        }
    }

    public static void showErrorMessage(SQLException e){
        System.err.println("Error: " + e.getMessage());
        System.err.println("Error Code: " + e.getErrorCode());
    }
}
