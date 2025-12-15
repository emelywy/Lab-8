package org.example.colproj.labs.lab8;

import org.example.colproj.labs.lab8.entity.Bill;
import org.example.colproj.labs.lab8.repository.BillRepository;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestBillRepository {

    BillRepository billRepository = new BillRepository();

    @Test
    public void Test1(){
        assertEquals(6, 3 + 3);
    }

    @Test
    public void TestGetBillById(){ // шукаємо рахунок за ID 1
        Bill bill = billRepository.getById(1L);
        assertNotNull(bill);
    }

    @Test
    public void TestGetAllBills(){
        List<Bill> list = billRepository.getAll();
        assertTrue(list.size() > 0); // переконуємось, що база даних не порожня
    }
}
