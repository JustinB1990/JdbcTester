package com.somat;

import java.sql.*;

public class JdbcTester
{
    public static void main( String[] args ) throws SQLException {

        Connection conn = null;

        try {
            conn = DBUtil.getConnection(DBType.ORADB);

            System.out.println("Connection with Oracle Database Successful.");
        } catch (SQLException e) {
            DBUtil.showErrorMessage(e);
        }
        finally{
            conn.close();
        }

    }
}
