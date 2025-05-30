package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String url = "jdbc:mysql://localhost:3306/messaging_app";
    private static final String user = "root";
    private static final String password = "";

    public static Connection gConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

}
