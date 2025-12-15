package org.example.colproj.labs.lab6.Decorator;

public abstract class RoomDecorator implements Room {

    protected Room room;

    public RoomDecorator(Room room) {

        this.room = room;

    }

    @Override
    public String getDescription() {

        return room.getDescription();

    }

    @Override
    public double getPrice() {

        return room.getPrice();

    }

    @Override
    public String getServices() {

        return room.getServices();

    }
    public boolean douhaveServise(String serviceName) {

        return getServices().toLowerCase().contains(serviceName.toLowerCase());

    }

    }