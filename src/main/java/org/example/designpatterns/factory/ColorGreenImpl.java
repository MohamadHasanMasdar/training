package org.example.designpatterns.factory;

public class ColorGreenImpl implements Color {
    @Override
    public void fill() {
        System.out.println("green impl of color");
    }
}
