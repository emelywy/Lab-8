package org.example.colproj.labs.lab8.dao;

import org.example.colproj.labs.lab8.config.ConnectionToDb;
import org.example.colproj.labs.lab8.daointerf.BillDao;
import org.example.colproj.labs.lab8.entity.Bill;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class BillRel implements BillDao {

    private final ConnectionToDb connectionToDb = new ConnectionToDb();

    @Override
    public void save(Bill bill) {
        String sql = "INSERT INTO bills(application_id, total_price, bill_date, paid) VALUES (?,?,?,?)";

        try (Connection conn = connectionToDb.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) { // встановлюємо ID заявки та суму

            ps.setLong(1, bill.getApplicationId());
            ps.setDouble(2, bill.getTotalPrice());
            // конвертуємо поточну дату Java у формат SQL Date
            ps.setDate(3, Date.valueOf(LocalDate.now()));
            ps.setBoolean(4, bill.isPaid()); // встановлюємо статус оплати
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // інші методи поки що не реалізовані

    @Override public List<Bill> getAll() { return null; }
    @Override public Bill getById(Long id) { return null; }
    @Override public void update(Bill bill) {}
    @Override public void delete(Bill bill) {}
    @Override public void delete(Long id) {}
    @Override public void deleteAll() {}
}