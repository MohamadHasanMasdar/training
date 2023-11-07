package org.example.designpatterns.factory;

public class ColorRedImpl implements Color {
    @Override
    public void fill() {
        System.out.println("red impl of color");
    }
}
