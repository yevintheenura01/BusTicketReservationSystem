package com.my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registerDButil {

    public static boolean insertcustomer(String name, String email, String phone, String userName, String password) {
        boolean isSuccess = false;

        String url = "jdbc:mysql://localhost:3306/buybus";
        String user = "root";
        String pass = "sliit123";

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            String sql = "INSERT INTO customer3 (name, email, phone, userName, password) VALUES (?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, phone);
            
            pstmt.setString(4, userName);
            pstmt.setString(5, password);

            int rs = pstmt.executeUpdate();

            if (rs > 0) {
                isSuccess = true;
            } else {
                isSuccess = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return isSuccess;
    }
}
