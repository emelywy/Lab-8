package org.example.colproj.labs.lab8.entity;

public class Client {

    private Long id;
    private String fullName;
    private String phone;
    private String email;

    public Client() { // порожній конструктор
    }

    public Long getId() {  // геттери та сеттери для доступу до приватних полів
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
}
