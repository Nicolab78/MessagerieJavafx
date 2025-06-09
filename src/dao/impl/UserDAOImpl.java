package dao.impl;

import dao.UserDAO;
import model.User;
import utils.DBConnection;

import java.sql.*;

public class UserDAOImpl implements UserDAO {

    @Override
    public User findByUsername(String username) {
        User user = null;

        String sql = "SELECT * FROM users WHERE username = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                user = new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
