package org.example.colproj.labs.lab8.entity;

public class Apartment {

    private Long id;
    private int roomNumber;
    private int places;
    private String apartmentClass;
    private double pricePerDay;
    private String status;

    public Apartment() {  // порожній конструктор
    }

    public Long getId() {  // геттери та сеттери для доступу до приватних полів
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public String getApartmentClass() {
        return apartmentClass;
    }

    public void setApartmentClass(String apartmentClass) {
        this.apartmentClass = apartmentClass;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
