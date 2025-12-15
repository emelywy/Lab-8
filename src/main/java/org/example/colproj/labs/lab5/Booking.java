package org.example.colproj.labs.lab5;

import java.util.ArrayList;
import java.util.List;

public class Booking {

    private Long id;
    private Client client; //клієнт який зробив бронь
    private List<Room> bookedRooms = new ArrayList<>(); //номери які мають броню
    private int days; // кількість днів проживання

    public Booking(Long id, Client client, int days) {

        this.id = id;
        this.client = client;
        this.days = days;

    }

    public void addRoom(Room room) { //додавання номера

        bookedRooms.add(room);

    }

    public List<Room> getBookedRooms() {

        return bookedRooms;

    }

    public Client getClient() {

        return client;

    }

    public int getDays() {

        return days;

    }

    public void setDays(int days) {

        this.days = days;

    }

    public double getPrice() { //підрахування вартості

        double total = 0;
        for (Room room : bookedRooms)
        {
            total += room.getPrice() * days;
        }

        return total;
    }

    @Override //вивід інформації
    public String toString() {

        return " Бронювання №  " + id + " Клієнт: " + client.getName() + " Кількість номерів:  " + bookedRooms.size() + " Днів: " + days + " Загальна сума:  " + getPrice() + " грн";

    }
}