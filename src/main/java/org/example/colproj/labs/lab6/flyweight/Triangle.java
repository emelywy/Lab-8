package org.example.colproj.labs.lab6.flyweight;

public class Triangle implements Shape {

    int a = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("Triangle - x: " + x + ", y: " + y+ ",a:"+a);

    }
}
