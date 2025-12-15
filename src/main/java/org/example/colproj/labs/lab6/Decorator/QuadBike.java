package org.example.colproj.labs.lab6.Decorator;

public class QuadBike extends RoomDecorator {

    public QuadBike(Room room)

    {

        super(room);

    }

    @Override
    public String getDescription() {

        return room.getDescription() + " + Квадроцикли";
    }


    @Override
    public double getPrice() {

        return room.getPrice() + 1500;

    }

    @Override
    public String getServices() {

        return room.getServices() + ", Квадроцикли";

    }
}
