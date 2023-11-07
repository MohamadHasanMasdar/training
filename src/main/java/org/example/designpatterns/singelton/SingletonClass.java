package org.example.designpatterns.singelton;

public class SingletonClass {

    private static SingletonClass uniqueInstance = null;

    private SingletonClass() {
        if (uniqueInstance != null)
            throw new RuntimeException("object already exist");
    }

    public static SingletonClass getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new SingletonClass();
        return uniqueInstance;
    }
}
