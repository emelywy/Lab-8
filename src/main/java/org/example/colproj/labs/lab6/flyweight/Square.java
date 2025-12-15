package org.example.colproj.labs.lab6.flyweight;

public class Square implements Shape {

    int a = 25;

    @Override
    public void draw(int x, int y) {
        System.out.println("Square - x: " + x + ", y: " + y+ ",a:"+a);

    }
}