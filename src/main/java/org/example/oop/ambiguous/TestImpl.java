package org.example.oop.ambiguous;

public class TestImpl implements Test1, Test2{
    public static void main(String[] args) {
        System.out.println(Test1.a);
    }
}
