package org.example.designpatterns.singelton;

import java.lang.reflect.Constructor;

public class TestMain {

    public static void main(String[] args) {
        SingletonClass ins1 = SingletonClass.getInstance();
        SingletonClass ins2 = SingletonClass.getInstance();

        System.out.println(ins1);
        System.out.println(ins2);
        System.out.println(ins1 == ins2);
    }
}
