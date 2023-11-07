package org.example.oop.inheritence;

public class Inheritence1 extends Base{

    public void message() {
        System.out.println("child Class Message");
    }

    public static void main(String[] args) {
        new Inheritence1().message();
    }
}

class Base{
    public void message() {
        System.out.println("Base Class Message");
    }
}
