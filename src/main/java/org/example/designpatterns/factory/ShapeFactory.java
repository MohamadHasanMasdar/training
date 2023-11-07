package org.example.designpatterns.factory;

public class ShapeFactory {

    public Shape getShape() {
        return new ShapeCircleImpl();
    }
}
