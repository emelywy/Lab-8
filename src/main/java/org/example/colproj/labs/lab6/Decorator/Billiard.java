package org.example.colproj.labs.lab6.Decorator;

public class Billiard extends RoomDecorator {

    public Billiard(Room room) {

        super(room);

    }

    @Override
    public String getDescription() {

        return room.getDescription() + " + Більярд";
    }


    @Override
    public double getPrice() {

        return room.getPrice() + 650;

    }

    @Override
    public String getServices() {

        return room.getServices() + ", Більярд";

    }
}
