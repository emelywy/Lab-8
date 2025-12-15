package org.example.colproj.labs.lab6.flyweight;

public class Point implements Shape {

    @Override
    public void draw(int x, int y) {
        System.out.println("Point - x: " + x + ", y: " + y);

    }
}