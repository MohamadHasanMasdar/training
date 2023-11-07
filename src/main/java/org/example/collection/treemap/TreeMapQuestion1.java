package org.example.collection.treemap;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class TreeMapQuestion1 {


    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(17, "benz");
        treeMap.put(11, "bmw");
        treeMap.put(12, "b");
        treeMap.put(1, "c");

        System.out.println(treeMap);
    }

}
