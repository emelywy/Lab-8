package org.example.colproj.labs.lab5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String name; // назвв
    private List<Room> rooms = new ArrayList<>(); //список номерів
    private List<Booking> bookings = new ArrayList<>(); //список бронювань

    public Hotel(String name) {

        this.name = name;

    }

    public void addRoom(Room room) { //додавання номерів

        rooms.add(room);

    }

    public List<Room> getRooms() {

        return rooms;

    }

    public void addBooking(Booking booking) { //додавання бронювань

        bookings.add(booking);

    }

    public List<Booking> getBookings() {

        return bookings;

    }

    public String getName() {

        return name;

    }

    @Override // виведення інформації
    public String toString() {
        return "Готель: " + name + " Кількість номерів: " + rooms.size() + " Кількість бронювань: " + bookings.size();
    }
}