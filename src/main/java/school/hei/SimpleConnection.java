package school.hei;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class SimpleConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Connection_JDBC";
        String user = "postgres";
        String password = "andraina250405";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database: " + !connection.isClosed());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
