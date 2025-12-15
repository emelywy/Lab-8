package org.example.colproj.labs.lab8.dao;

import org.example.colproj.labs.lab8.config.ConnectionToDb;
import org.example.colproj.labs.lab8.daointerf.ClientDao;
import org.example.colproj.labs.lab8.entity.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientRel implements ClientDao {


    private final Connection connection = new ConnectionToDb().getConnection(); // отримуємо з'єднання з БД

    @Override
    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();
        try (Statement stmt = connection.createStatement())  // використовуємо try-with-resources для автоматичного закриття Statement
        {
            ResultSet rs = stmt.executeQuery("SELECT * FROM clients"); // виконуємо SQL-запит для отримання всіх рядків з таблиці clients
            while (rs.next()) { // проходимо по кожному рядку результату
                Client c = new Client(); // переносимо дані з колонок таблиці в поля об'єкта Java
                c.setId(rs.getLong("id"));
                c.setFullName(rs.getString("full_name"));
                c.setPhone(rs.getString("phone"));
                c.setEmail(rs.getString("email"));
                clients.add(c); // додаємо заповнений об'єкт у список
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clients;
    }

    @Override
    public void save(Client client) {
        String sql =
                "INSERT INTO clients(full_name, phone, email) VALUES (?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) { // підставляємо значення замість знаків питання
            ps.setString(1, client.getFullName());
            ps.setString(2, client.getPhone());
            ps.setString(3, client.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) { // виконуємо запит на оновлення
            throw new RuntimeException(e);
        }
    }

    // інші методи поки що не реалізовані

    public Client getById(Long id) { return null; }
    public void update(Client client) {}
    public void delete(Client client) {}
    public void delete(Long id) {}
    public void deleteAll() {}
}