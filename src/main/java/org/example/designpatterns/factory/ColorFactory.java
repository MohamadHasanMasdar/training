package org.example.designpatterns.factory;

public class ColorFactory {

    public Color getColor() {
        return new ColorGreenImpl();
    }
}
