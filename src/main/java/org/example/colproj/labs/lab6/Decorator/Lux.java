package org.example.colproj.labs.lab6.Decorator;

public class Lux implements Room{

    @Override
    public String getDescription() {
        return "Номер Люкс";
    }

    @Override
    public double getPrice() {
        return 1500;
    }

    @Override
    public String getServices() {
        return "Послуги, які надають:";
    }
}
