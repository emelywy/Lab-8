package org.example.colproj.labs.lab8.config;

// імпорт необхідних бібліотек JDBC для роботи з базою даних

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDb {

    public Connection getConnection() {
        Connection connection;

        try {
            
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3308/hotel_system?useSSL=false&serverTimezone=UTC",
                    "root",
                    ""
            ); // NOSONAR
            
            System.out.println("Connected to database successfully"); // NOSONAR
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }
}
