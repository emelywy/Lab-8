package org.example.colproj.labs.lab8.config;

// імпорт необхідних бібліотек JDBC для роботи з базою даних

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDb { // метод, який повертає об'єкт з'єднання

    public Connection getConnection() {

        Connection connection;

        try { // виклик DriverManager для отримання з'єднання
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3308/hotel_system?useSSL=false&serverTimezone=UTC",
                    "root",
                    ""
            );
            System.out.println("Connected to database successfully"); // вивід повідомлення про успішне підключення
        }
        catch (SQLException e) { //якщо підключитися не вдалося
            throw new RuntimeException(e);
        }

        return connection;  // повертаємо налаштоване з'єднання для подальшого використання
    }
}