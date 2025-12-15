package org.example.colproj.labs.lab8.repository;

import org.example.colproj.labs.lab8.config.ConnectionToDb;
import org.example.colproj.labs.lab8.entity.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository {

    ConnectionToDb connectionToDb = new ConnectionToDb(); // створюємо екземпляр класу конфігурації для доступу до методу

    public void save(Client client) {  // метод збереження нового клієнта в БД
        String sql = "INSERT INTO clients(full_name, phone, email) VALUES (?,?,?)";

        try (Connection conn = connectionToDb.getConnection(); // використовуємо try-with-resources для автоматичного закриття з'єднання
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, client.getFullName());
            ps.setString(2, client.getPhone());
            ps.setString(3, client.getEmail());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); // у разі помилки
        }
    }

    public Client getById(Long id) { // метод пошуку клієнта за ID
        Client client = null;
        String sql = "SELECT * FROM clients WHERE id=?";

        try (Connection conn = connectionToDb.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) { // якщо запис знайдено, створюємо об'єкт і заповнюємо його даними
                client = new Client();
                client.setId(rs.getLong("id"));
                client.setFullName(rs.getString("full_name"));
                client.setPhone(rs.getString("phone"));
                client.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }

    public List<Client> getAll() { // метод отримання списку всіх клієнтів
        List<Client> list = new ArrayList<>();

        try (Connection conn = connectionToDb.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM clients")) {

            while (rs.next()) {
                Client c = new Client();
                c.setId(rs.getLong("id"));
                c.setFullName(rs.getString("full_name"));
                c.setPhone(rs.getString("phone"));
                c.setEmail(rs.getString("email"));
                list.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
