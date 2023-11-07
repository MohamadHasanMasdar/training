package org.example.designpatterns.factory;

public class MainFactory {
    public static testMain get() {
        return new testMain(
                new ShapeFactory().getShape(),
                new ColorFactory().getColor()
        );
    }
}
