package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.conn.DBConnection;
import com.entity.UserInput;

public class UserInputDAO {
    private Connection con;

    public UserInputDAO() {
        con = DBConnection.getConnection();
    }

    public void insertUser(UserInput user) {
        try {
            String query = "INSERT INTO user_data (name, email) VALUES (?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, user.getName());
            pst.setString(2, user.getEmail());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public UserInput getUserById(int id) {
        UserInput user = null;
        try {
            String query = "SELECT * FROM user_data WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                user = new UserInput(rs.getString("name"), rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
