package org.example.colproj.labs.lab6.Decorator;

public class Standart implements Room{

    @Override
    public String getDescription() {
        return "Номер Стандарт";
    }

    @Override
    public double getPrice() {
        return 900;
    }

    @Override
    public String getServices() {
        return "Послуги, які надають:";
    }
}
