package org.example.designpatterns.singelton;

import java.lang.reflect.Constructor;

public class TestBreakSingletonReflection {

    public static void main(String[] args) {
        SingletonClass ins1 = SingletonClass.getInstance();
        SingletonClass ins2 = null;


        //break singleton pattern with reflection
        //to avoid this, we should throw exception inside constructor of singleton class
        try {
            Constructor constructor = SingletonClass.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            ins2 = (SingletonClass) constructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(ins1);
        System.out.println(ins2);
        System.out.println(ins1 == ins2);
    }
}
