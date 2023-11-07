package org.example.designpatterns.factory;

public class ShapeCircleImpl implements Shape {
    @Override
    public void draw() {
        System.out.println("circle impl of shape");
    }
}
