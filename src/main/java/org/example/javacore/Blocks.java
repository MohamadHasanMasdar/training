package org.example.javacore;

public class Blocks {
    public static void main(String[] args) {
        T obj = new T();
        T obj2 = new T();
        T obj3 = new T();
    }
}

class T {
    static int a = 5;

    static {
        a++;
    }

    {
        a++;
        System.out.println(a);
    }
}

