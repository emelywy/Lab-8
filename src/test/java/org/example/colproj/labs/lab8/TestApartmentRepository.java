package org.example.colproj.labs.lab8;

import org.example.colproj.labs.lab8.entity.Apartment;
import org.example.colproj.labs.lab8.repository.ApartmentRepository;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestApartmentRepository {

    ApartmentRepository apartmentRepository = new ApartmentRepository();

    @Test
    public void test1(){
        assertEquals(10, 5 + 5); // проста арифметика для перевірки середовища тестування
    }

    @Test
    public void testApartmentById(){
        Apartment apartment = apartmentRepository.getById(1L);
        assertNotNull("Квартиру з ID 1 не знайдено", apartment); // додаємо повідомлення, яке виведеться, якщо тест впаде
    }

    @Test
    public void testApartmentTypes(){
        List<Apartment> list = apartmentRepository.getAll(); // отримуємо всі апартаменти з бази

        boolean hasEconom = false;
        boolean hasStandard = false;
        boolean hasLux = false;

        // проходимо по списку і перевіряємо чи є такі
        for (Apartment a : list) {

            String type = a.getApartmentClass();
            // використовуємо equalsIgnoreCase для порівняння рядків без врахування регістру
            if ("економ".equalsIgnoreCase(type)) hasEconom = true;
            if ("стандарт".equalsIgnoreCase(type)) hasStandard = true;
            if ("люкс".equalsIgnoreCase(type)) hasLux = true;
        }
        // тест пройде успішно тільки якщо три типи номерів знайдені в БД
        assertTrue("Не знайдено номерів типу ЕКОНОМ", hasEconom);
        assertTrue("Не знайдено номерів типу СТАНДАРТ", hasStandard);
        assertTrue("Не знайдено номерів типу ЛЮКС", hasLux);
    }
}
