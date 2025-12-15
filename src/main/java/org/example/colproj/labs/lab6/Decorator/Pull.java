package org.example.colproj.labs.lab6.Decorator;

public class Pull extends RoomDecorator
{
    public Pull(Room room) {

        super(room);

    }

    @Override
    public String getDescription() {

        return room.getDescription() + " + Басейн";
    }


    @Override
    public double getPrice() {

        return room.getPrice() + 650;

    }

    @Override
    public String getServices() {

        return room.getServices() + ", Басейн";

    }
}
