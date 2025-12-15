package org.example.colproj.labs.lab6.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FactoryShare {

    private static final Map<String, Shape> shares = new HashMap<>();

    public Shape getShape(String shapeName) {

        Shape shape = shares.get(shapeName);

        if  (shape == null) {
            switch(shapeName) {
                case "точка":
                    shape = new Point();
                    break;
                case "коло":
                    shape = new Circle();
                    break;
                case "квадрат":
                    shape = new Square();
                    break;
                case "трикутник":
                    shape = new Triangle();
                    break;
            }
            shares.put(shapeName, shape);
        }
        return shape;
    }
}
