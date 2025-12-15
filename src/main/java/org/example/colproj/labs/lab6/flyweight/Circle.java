package org.example.colproj.labs.lab6.flyweight;

public class Circle implements Shape {

    int r = 15;

    @Override
    public void draw(int x, int y) {
        System.out.println("Circle - x: " + x + ", y: " + y+", r:"+r);

    }
}
