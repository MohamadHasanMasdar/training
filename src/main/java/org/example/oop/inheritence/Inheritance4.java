package org.example.oop.inheritence;

public class Inheritance4 {

    public static void main(String[] args) {
        BaseClass ins = new Derived();
        ins.show();
    }
}

class Derived extends BaseClass {

    public void show() {
        System.out.println("Derived::show() called");
    }
}

class BaseClass {
    public void show() {
        System.out.println("Base::show() called");
    }
}

