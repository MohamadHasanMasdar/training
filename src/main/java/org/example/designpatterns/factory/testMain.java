package org.example.designpatterns.factory;

public class testMain {

    private static Shape shape;
    private static Color color;

    public testMain(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    static {
        MainFactory.get();
    }

    public static void main(String[] args) {
        shape.draw();
        color.fill();
    }
}
