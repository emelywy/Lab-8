package org.example.colproj.labs.lab8.repository;

import org.example.colproj.labs.lab8.config.ConnectionToDb;
import org.example.colproj.labs.lab8.entity.Apartment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ApartmentRepository {

    ConnectionToDb connectionToDb = new ConnectionToDb();

    public void save(Apartment a) {
        String sql = """
                INSERT INTO apartments(room_number, places, class, price_per_day, status)
                VALUES (?,?,?,?,?)
                """;

        try (Connection conn = connectionToDb.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, a.getRoomNumber());
            ps.setInt(2, a.getPlaces());
            ps.setString(3, a.getApartmentClass());
            ps.setDouble(4, a.getPricePerDay());
            ps.setString(5, a.getStatus());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Apartment getById(Long id) {
        Apartment a = null;

        try (Connection conn = connectionToDb.getConnection();
             PreparedStatement ps =
                     conn.prepareStatement("SELECT * FROM apartments WHERE id=?")) {

            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                a = new Apartment();
                a.setId(rs.getLong("id"));
                a.setRoomNumber(rs.getInt("room_number"));
                a.setPlaces(rs.getInt("places"));
                a.setApartmentClass(rs.getString("class"));
                a.setPricePerDay(rs.getDouble("price_per_day"));
                a.setStatus(rs.getString("status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    public List<Apartment> getAll() {
        List<Apartment> list = new ArrayList<>();

        try (Connection conn = connectionToDb.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM apartments")) {

            while (rs.next()) {
                Apartment a = new Apartment();
                a.setId(rs.getLong("id"));
                a.setApartmentClass(rs.getString("class"));
                a.setPlaces(rs.getInt("places"));
                a.setPricePerDay(rs.getDouble("price_per_day"));
                a.setStatus(rs.getString("status"));
                list.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
