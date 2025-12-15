package org.example.colproj.labs.lab5;

public class Room {

    private Long id; // індифікатор
    private String type; // тип номера
    private double price; // ціна
    private int capacity; // кількість місць

    public Room(Long id, String type, double price, int capacity) { //конструктор для ініціалізації
        this.id = id;
        this.type = type;
        this.price = price;
        this.capacity = capacity;
    }

    public Long getId() { return id; }  // гетери і сеттери для доступу до полів
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    @Override // для відображення інформації
    public String toString() {
        return "ID: " + id + "  "  + type +" (місць: " + capacity + ", ціна: " + price + " грн/доба)";
    }
}