package org.example.colproj.labs.lab8.entity;

import java.time.LocalDate;

public class Application {

    private Long id;
    private Long clientId;
    private int places;
    private String apartmentClass;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private String status;
    private Long apartmentId;

    public Application() {  // порожній конструктор
    }

    public Long getId() {  // геттери та сеттери для доступу до приватних полів
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
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

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Long apartmentId) {
        this.apartmentId = apartmentId;
    }
}
