package org.example.colproj.labs.lab6.Decorator;

public class Economy implements Room{

    @Override
    public String getDescription() {
        return "Номер Економ";
    }

    @Override
    public double getPrice() {
        return 500;
    }

    @Override
    public String getServices() {
        return "Послуги, які надають:";
    }
}
