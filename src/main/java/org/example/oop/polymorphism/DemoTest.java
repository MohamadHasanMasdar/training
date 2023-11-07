package org.example.oop.polymorphism;

import java.io.Serializable;

public class DemoTest {
    public static void main(String[] args) {
        Parent a = new Parent();
        Parent b = new Child(); //polymorphism, making shadowing possible!
        System.out.println(a.getX());
        System.out.println(b.getX());//override, access subclass attri.
//        System.out.println(b.getb()); //not able to load subclass method!
        System.out.println(a.x);
        System.out.println(b.x);
    }
}
