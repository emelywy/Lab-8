package org.example.colproj.labs.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Admin admin = new Admin(1L, "Омелько Готельний"); //створення адміна

        Hotel royal = new Hotel("Royal Kisit"); //створення готелів
        Hotel comfort = new Hotel("Comfort");

        admin.addHotel(royal); //додавання готелів адміну
        admin.addHotel(comfort);

        Room r1 = new Room(1L, "Економ", 800, 1); //створення номерів для готелю Royal Kisit
        Room r2 = new Room(2L, "Стандарт", 1200, 2);
        Room r3 = new Room(3L, "Сімейний", 1600, 4);
        Room r4 = new Room(4L, "Люкс", 2000, 3);
        Room r5 = new Room(5L, "Люкс+", 2500, 5);

        royal.addRoom(r1); //додавання номерів Royal Kisit
        royal.addRoom(r2);
        royal.addRoom(r3);
        royal.addRoom(r4);
        royal.addRoom(r5);

        Room c1r = new Room(6L, "Комфорт", 1500, 2); //створення номерів для готелю Comfort
        Room c2r = new Room(7L, "Люкс", 2200, 3);
        Room c3r = new Room(8L, "Люкс+", 3000, 4);

        comfort.addRoom(c1r); //додавання номерів Comfort
        comfort.addRoom(c2r);
        comfort.addRoom(c3r);

        Client c1 = new Client(1L, "Анна Пупкіна", "0981234567", "anna@gmail.com"); // створення клієнтів
        Client c2 = new Client(2L, "Роман Маленький", "0939876543", "roman@ukr.net");
        Client c3 = new Client(3L, "Олег Нордвест", "0977773333", "oleg@ukr.ua");
        Client c4 = new Client(4L, "Марія Перша", "maria@gmail.com", "0994445566");
        Client c5 = new Client(5L, "Ігор Петренко", "0962223344", "ihor@ukr.net");

        Booking b1 = new Booking(1L, c1, 3); //створювання бронювань і зв'язку з клієнтом
        b1.addRoom(r4);
        b1.addRoom(r5);
        c1.setBooking(b1);

        Booking b2 = new Booking(2L, c2, 2);
        b2.addRoom(r2);
        b2.addRoom(c3r);
        c2.setBooking(b2);

        Booking b3 = new Booking(3L, c3, 5);
        b3.addRoom(c1r);
        c3.setBooking(b3);

        Booking b4 = new Booking(4L, c4, 1);
        b4.addRoom(r5);
        c4.setBooking(b4);

        Booking b5 = new Booking(5L, c5, 4);
        b5.addRoom(r3);
        b5.addRoom(c2r);
        c5.setBooking(b5);

        royal.addBooking(b1); //додавання бронювань
        royal.addBooking(b2);
        comfort.addBooking(b3);
        comfort.addBooking(b5);

        System.out.println("Всі номери у готелях"); //вивід всієї інформації
        for (Hotel h : admin.getHotels()) {

            System.out.println("Готель: " + h.getName());
            for (Room r : h.getRooms()) {

                System.out.println("   " + r);

            }
        }

        System.out.println("\nВсі клієнти");  //вивід всіх клієнтів
        Client[] clients = {c1, c2, c3, c4, c5};
        for (Client c : clients) {

            System.out.println(c);

        }

        System.out.println("\nВсі бронювання"); //вивід всіх бронювань
        admin.showAllBookings();

        System.out.println("\nНомери дорожчі за 1800 грн у Royal Kisit"); //вивід номерів, які дорожче 1800
        for (Room r : royal.getRooms()) {

            if (r.getPrice() > 1800) {

                System.out.println(r);
            }
        }

        System.out.println("\nГотелі, якими керує адмін"); //вивід інформації якими готелями керує адмін
        for (Hotel h : admin.getHotels()) {
            System.out.println(h);
        }
    }
}