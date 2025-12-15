package org.example.colproj.labs.lab8;

import org.example.colproj.labs.lab8.entity.Client;
import org.example.colproj.labs.lab8.repository.ClientRepository;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*; // імпорт статичних методів для перевірок

public class TestClientRepository {

    ClientRepository clientRepository = new ClientRepository(); // створюємо об'єкт репозиторія, який будемо тестувати

    @Test
    public void Test1(){ // базовий тест на перевірку працездатності самого JUnit
        int a = 2;
        int b = 3;
        assertEquals(5, a + b); // очікуємо, що сума буде 5, якщо ні — тест впаде
    }

    @Test
    public void TestGetClientById(){
        Client client = clientRepository.getById(1L); // спробуємо отримати клієнта з ID = 1
        assertNotNull(client); // перевіряємо, що повернувся реальний об'єкт, а не null
    }

    @Test
    public void TestGetAllClients(){
        List<Client> list = clientRepository.getAll(); // отримуємо список всіх клієнтів
        assertTrue(list.size() > 0); // перевіряємо, що список не порожній
    }
}
