package org.example.colproj.labs.lab6.Decorator;

public class LuxPlus implements Room{

    @Override
    public String getDescription() {
        return "Номер Люкс+";
    }

    @Override
    public double getPrice() {
        return 2500;
    }

    @Override
    public String getServices() {
        return "Послуги, які надають:";
    }
}
