package org.example.colproj.labs.lab8;

import org.example.colproj.labs.lab8.entity.Apartment;
import org.example.colproj.labs.lab8.entity.Application;
import org.example.colproj.labs.lab8.entity.Bill;
import org.example.colproj.labs.lab8.entity.Client;
import org.example.colproj.labs.lab8.repository.ApartmentRepository;
import org.example.colproj.labs.lab8.repository.ApplicationRepository;
import org.example.colproj.labs.lab8.repository.BillRepository;
import org.example.colproj.labs.lab8.repository.ClientRepository;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ClientRepository clientRepository = new ClientRepository();
        Client client = new Client();

        client.setFullName("Іван Петренко"); // створення об'єкта клієнта
        client.setPhone("0991112233");
        client.setEmail("ivan@gmail.com");

        List<Client> clients = clientRepository.getAll(); // отримання списку всіх клієнтів з БД та виведення в консоль
        for (Client c : clients) {
            System.out.println(c.getId() + " " + c.getFullName());
        }

        Client clientFromDb = clientRepository.getById(1L); // перевірка пошуку конкретного клієнта за ID
        System.out.println("Client by ID: " + clientFromDb.getFullName());

        ApartmentRepository apartmentRepository = new ApartmentRepository();

        Apartment apartment = new Apartment();
        apartment.setRoomNumber(101);
        apartment.setPlaces(2);
        apartment.setApartmentClass("STANDARD");
        apartment.setPricePerDay(1200);
        apartment.setStatus("FREE");

        List<Apartment> apartments = apartmentRepository.getAll(); // виведення списку номерів
        for (Apartment a : apartments) {
            System.out.println(a.getId() + " " + a.getApartmentClass());
        }

        ApplicationRepository applicationRepository = new ApplicationRepository();

        Application application = new Application();
        application.setClientId(1L);
        application.setPlaces(2);
        application.setApartmentClass("STANDARD");
        application.setDateFrom(LocalDate.now());
        application.setDateTo(LocalDate.now().plusDays(3));
        application.setStatus("NEW");
        application.setApartmentId(1L);

        List<Application> applications = applicationRepository.getAll(); // виведення списку заявок та їх статусів
        for (Application app : applications) {
            System.out.println(app.getId() + " " + app.getStatus());
        }

        BillRepository billRepository = new BillRepository();

        Bill bill = new Bill();
        bill.setApplicationId(1L);
        bill.setTotalPrice(3600);
        bill.setBillDate(LocalDate.now());
        bill.setPaid(false);

        List<Bill> bills = billRepository.getAll(); // виведення списку рахунків та сум до сплати
        for (Bill b : bills) {
            System.out.println(b.getId() + " " + b.getTotalPrice());
        }
    }
}
