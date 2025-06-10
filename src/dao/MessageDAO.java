package dao;

import model.Message;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MessageDAO {

    public void ajouterMessage(Message message) {
        String sql = "INSERT INTO messages (auteur, contenu) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, message.getAuteur());
            stmt.setString(2, message.getContenu());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public List<Message> getTousLesMessages() {
        List<Message> messages = new ArrayList<>();
        String sql = "SELECT * FROM messages ORDER BY date_envoi DESC";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Message message = new Message(
                    rs.getInt("id"),
                    rs.getString("auteur"),
                    rs.getString("contenu"),
                    rs.getTimestamp("date_envoi").toLocalDateTime()
                );
                messages.add(message);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return messages;
    }
}
