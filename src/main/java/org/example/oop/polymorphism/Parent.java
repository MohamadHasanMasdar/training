package org.example.oop.polymorphism;

public class Parent {
    protected int x=1;
    protected void setX(int a){
        x=a;
    }
    protected int getX(){
        return x;
    }
}

class Child extends Parent {
    protected int x = 3;
    public int getX(){
        return x;
    }
    public int getB(){
        return x;
    }
}


