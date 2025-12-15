package org.example.colproj.labs.lab6.Decorator;

public class Spa extends RoomDecorator{

    public Spa(Room room) {

        super(room);

    }

    @Override
    public String getDescription() {

        return room.getDescription() + " + СПА";
    }


    @Override
    public double getPrice() {

        return room.getPrice() + 450;

    }

    @Override
    public String getServices() {

        return room.getServices() + ", СПА";

    }
}
