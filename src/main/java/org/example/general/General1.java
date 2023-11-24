package org.example.general;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class General1 {

    public static void main(String[] args) {
        var p1 = new Person("ali", 25);
        var p2 = new Person("reza", 10);
        var p3 = new Person("ali", 25);
        var set = new HashSet<Person>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set.size());

        var set2 = new LinkedHashSet<Person>();
        set2.add(p1);
        set2.add(p2);
        set2.add(p3);
        System.out.println(set2.size());
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
