package org.example.colproj.labs.lab8;

import org.example.colproj.labs.lab8.entity.Application;
import org.example.colproj.labs.lab8.repository.ApplicationRepository;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestApplicationRepository {

    ApplicationRepository applicationRepository = new ApplicationRepository();

    @Test
    public void test1(){
        assertEquals(4, 2 * 2); // проста арифметика для перевірки середовища тестування
    }

    @Test
    public void testGetApplicationById(){ // запит до таблиці applications
        Application app = applicationRepository.getById(1L);
        assertNotNull(app);
    }

    @Test
    public void testGetAllApplications(){
        List<Application> list = applicationRepository.getAll();
        assertTrue(list.size() > 0); // переконуємось, що база даних не порожня
    }
}
