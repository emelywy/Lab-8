package org.example.colproj.labs.lab6.Decorator;

public class Family implements Room{

    @Override
    public String getDescription() {
        return "Номер Сіменйний";
    }

    @Override
    public double getPrice() {
        return 800;
    }

    @Override
    public String getServices() {
        return "Послуги, які надають:";
    }
}
