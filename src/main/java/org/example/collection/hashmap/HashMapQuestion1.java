package org.example.collection.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeSet;

public class HashMapQuestion1 {

    {
        System.out.println("1");
    }
    public HashMapQuestion1 () {
        System.out.println("2");
    }
    static {
        System.out.println("3");
    }
    {
        System.out.println("4");
    }

    public static void main(String[] args) {
        HashMapQuestion1 o = new HashMapQuestion1();
    }

//    public static void main(String[] args) {
//        HashMap<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(10, "10");
//        hashMap.put(1, "1");
//        hashMap.put(16, "16");
//        hashMap.put(12, "12-0");
//        hashMap.put(6, "6");
//        hashMap.put(19, "19");
//        hashMap.put(12, "12-1");
//        hashMap.put(12, "12-2");
//
//
//        //iterate values
//        hashMap.values().forEach(System.out::println);
//
//        //sort keys
//        hashMap.keySet().stream().sorted().forEach(System.out::println);
//    }
}
