package org.example.ds;

import java.util.Map;

public class TreeMap {

    public static void main(String[] args) {
        Map<Integer, Integer> a = new java.util.TreeMap<>();

        a.put(10,1);
        a.put(8,1);
        a.put(1,1);
        a.put(11,1);
        a.put(19,1);
        a.put(2,1);
        a.put(18,1);

        for(Integer key: a.keySet())
            System.out.println(key);
    }
}
