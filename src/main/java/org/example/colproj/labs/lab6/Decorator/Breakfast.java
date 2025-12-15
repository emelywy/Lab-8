package org.example.colproj.labs.lab6.Decorator;

public class Breakfast extends RoomDecorator{

    public Breakfast(Room room) {

        super(room);

    }

    @Override
    public String getDescription() {

        return room.getDescription() + " + Сніданок";
    }


    @Override
    public double getPrice() {

        return room.getPrice() + 250;

    }

    @Override
    public String getServices() {

        return room.getServices() + ", Сніданок";

    }
}
