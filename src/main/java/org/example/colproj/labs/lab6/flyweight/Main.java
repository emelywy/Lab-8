package org.example.colproj.labs.lab6.flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public  static void main(String[] args) {

        FactoryShare factoryShare = new FactoryShare();

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(factoryShare.getShape("квадрат"));
        shapes.add(factoryShare.getShape("точка"));
        shapes.add(factoryShare.getShape("коло"));
        shapes.add(factoryShare.getShape("трикутник"));

        for (Shape shape : shapes) {

            int x = new Random().nextInt(101);
            int y = new Random().nextInt(101);

            shape.draw(x,y);
        }
    }
}
