package org.example.collection.hashmap;

import java.util.HashMap;

public class HashMapQuestion2 {

    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person ali = new Person("ali", 1);
        Person mamad = new Person("mamad", 1);
        map.put(ali, "");
        map.put(mamad, "aaa");



        System.out.println(mamad.equals(ali));
        System.out.println(map);
    }
}
