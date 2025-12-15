package org.example.colproj.labs.lab8.dao;

import org.example.colproj.labs.lab8.config.ConnectionToDb;
import org.example.colproj.labs.lab8.daointerf.ApplicationDao;
import org.example.colproj.labs.lab8.entity.Application;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ApplicationRel implements ApplicationDao {

    private final ConnectionToDb connectionToDb = new ConnectionToDb();

    @Override
    public List<Application> getAll() {
        List<Application> list = new ArrayList<>();
        String sql = "SELECT * FROM applications";

        try (Connection conn = connectionToDb.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) { // отримуємо текстове значення ENUM
                Application app = new Application();
                app.setId(rs.getLong("id"));
                app.setClientId(rs.getLong("client_id"));
                app.setPlaces(rs.getInt("places"));
                app.setApartmentClass(rs.getString("class"));
                app.setDateFrom(rs.getDate("date_from").toLocalDate());
                app.setDateTo(rs.getDate("date_to").toLocalDate());
                app.setStatus(rs.getString("status"));
                app.setApartmentId(rs.getLong("apartment_id"));
                list.add(app);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Application getById(Long id) {
        Application app = null;
        String sql = "SELECT * FROM applications WHERE id=?"; // пошук за конкретним ID

        try (Connection conn = connectionToDb.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) { // перевіряємо, чи є результат
                app = new Application();
                app.setId(rs.getLong("id"));
                app.setClientId(rs.getLong("client_id"));
                app.setPlaces(rs.getInt("places"));
                app.setApartmentClass(rs.getString("class"));
                app.setDateFrom(rs.getDate("date_from").toLocalDate());
                app.setDateTo(rs.getDate("date_to").toLocalDate());
                app.setStatus(rs.getString("status"));
                app.setApartmentId(rs.getLong("apartment_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return app;
    }

    @Override
    public void save(Application app) { // використання Text Blocks (""") для зручного запису довгого SQL запиту
        String sql = """
                INSERT INTO applications
                (client_id, places, class, date_from, date_to, status, apartment_id)
                VALUES (?,?,?,?,?,?,?)
                """;

        try (Connection conn = connectionToDb.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) { // встановлення всіх параметрів по порядку

            ps.setLong(1, app.getClientId());
            ps.setInt(2, app.getPlaces());
            ps.setString(3, app.getApartmentClass());
            ps.setDate(4, Date.valueOf(app.getDateFrom()));
            ps.setDate(5, Date.valueOf(app.getDateTo()));
            ps.setString(6, app.getStatus());
            ps.setLong(7, app.getApartmentId());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // інші методи поки що не реалізовані

    @Override public void update(Application app) {}
    @Override public void delete(Application app) {}
    @Override public void delete(Long id) {}
    @Override public void deleteAll() {}
}