package org.example.colproj.labs.lab8.entity;

import java.time.LocalDate;

public class Bill {

    private Long id;
    private Long applicationId;
    private double totalPrice;
    private LocalDate billDate;
    private boolean paid;

    public Bill() { // порожній конструктор
    }

    public Long getId() {  // геттери та сеттери для доступу до приватних полів
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDate billDate) {
        this.billDate = billDate;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
