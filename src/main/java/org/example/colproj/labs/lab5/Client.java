package org.example.colproj.labs.lab5;

public class Client {

    private Long id;
    private String name;
    private String phone;
    private String email;
    private Booking booking; // посилання для бронювання

    public Client(Long id, String name, String phone, String email) {

        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;

    }

    public Long getId() {  //геттери та сеттери

        return id;

    }
    public void setId(Long id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }
    public void setName(String name) {

        this.name = name;

    }

    public String getPhone() {

        return phone;

    }
    public void setPhone(String phone) {

        this.phone = phone;

    }

    public String getEmail() {

        return email;

    }
    public void setEmail(String email) {

        this.email = email;

    }

    public Booking getBooking() {

        return booking;

    }
    public void setBooking(Booking booking) {

        this.booking = booking;

    }

    @Override //виведення інформації
    public String toString() {

        return " ID: " + id + " Клієнт: " + name + " Телефон: " + phone + " Email: " + email;

    }
}
