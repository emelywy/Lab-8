package org.example.colproj.labs.lab5;

import java.util.ArrayList;
import java.util.List;

public class Admin {

    private Long id;
    private String name;
    private List<Hotel> hotels = new ArrayList<>();

    public Admin(Long id, String name) {

        this.id = id;
        this.name = name;

    }

    public void addHotel(Hotel hotel) { //додавання готелю для певного адміністратора

        hotels.add(hotel);

    }

    public List<Hotel> getHotels() {

        return hotels;

    }

    public void showAllBookings() { //показ всіх бронювань

        for (Hotel hotel : hotels) {

            System.out.println(hotel.getBookings());

        }
    }

    public void confirm(Booking booking) { //підтвердження бронювання певним адміном

        System.out.println("Адміністратор " + name + " підтвердив " + booking);
    }

    @Override //вивід інформації
    public String toString() {

        return "Адмін: " + name + " (ID: " + id + ")";

    }
}

