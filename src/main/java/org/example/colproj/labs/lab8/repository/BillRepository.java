package org.example.colproj.labs.lab8.repository;

import org.example.colproj.labs.lab8.config.ConnectionToDb;
import org.example.colproj.labs.lab8.entity.Bill;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BillRepository {

    ConnectionToDb connectionToDb = new ConnectionToDb();

    public void save(Bill bill) {
        String sql = "INSERT INTO bills(application_id, total_price, bill_date, paid) VALUES (?,?,?,?)";

        try (Connection conn = connectionToDb.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, bill.getApplicationId());
            ps.setDouble(2, bill.getTotalPrice());
            ps.setDate(3, Date.valueOf(bill.getBillDate()));
            ps.setBoolean(4, bill.isPaid());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Bill getById(Long id) {
        Bill bill = null;

        try (Connection conn = connectionToDb.getConnection();
             PreparedStatement ps =
                     conn.prepareStatement("SELECT * FROM bills WHERE id=?")) {

            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                bill = new Bill();
                bill.setId(rs.getLong("id"));
                bill.setApplicationId(rs.getLong("application_id"));
                bill.setTotalPrice(rs.getDouble("total_price"));
                bill.setPaid(rs.getBoolean("paid"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return bill;
    }

    public List<Bill> getAll() {
        List<Bill> list = new ArrayList<>();

        try (Connection conn = connectionToDb.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM bills")) {

            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getLong("id"));
                bill.setTotalPrice(rs.getDouble("total_price"));
                bill.setPaid(rs.getBoolean("paid"));
                list.add(bill);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
