package org.example.colproj.labs.lab8.repository;

import org.example.colproj.labs.lab8.config.ConnectionToDb;
import org.example.colproj.labs.lab8.entity.Application;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ApplicationRepository {

    ConnectionToDb connectionToDb = new ConnectionToDb();

    public void save(Application app) { // використання багаторядкового літерала для зручності читання SQL
        String sql = """
                INSERT INTO applications
                (client_id, places, class, date_from, date_to, status, apartment_id)
                VALUES (?,?,?,?,?,?,?)
                """;

        try (Connection conn = connectionToDb.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
// послідовне заповнення параметрів запиту
            ps.setLong(1, app.getClientId());
            ps.setInt(2, app.getPlaces());
            ps.setString(3, app.getApartmentClass());
            ps.setDate(4, Date.valueOf(app.getDateFrom()));
            ps.setDate(5, Date.valueOf(app.getDateTo()));
            ps.setString(6, app.getStatus());
            ps.setLong(7, app.getApartmentId());
            ps.executeUpdate();

        } catch (SQLException e) {
           throw new RuntimeException(e);
        }
    }

    public Application getById(Long id) {
        Application app = null;

        try (Connection conn = connectionToDb.getConnection();
             PreparedStatement ps =
                     conn.prepareStatement("SELECT * FROM applications WHERE id=?")) {

            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
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
           throw new RuntimeException(e);
        }
        return app;
    }

    public List<Application> getAll() {
        List<Application> list = new ArrayList<>();

        try (Connection conn = connectionToDb.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM applications")) {

            while (rs.next()) {
                Application app = new Application();
                app.setId(rs.getLong("id"));
                app.setClientId(rs.getLong("client_id"));
                app.setApartmentClass(rs.getString("class"));
                app.setStatus(rs.getString("status"));
                list.add(app);
            }
        } catch (SQLException e) {
           throw new RuntimeException(e);
        }
        return list;
    }
}
