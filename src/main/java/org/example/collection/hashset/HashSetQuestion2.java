package org.example.collection.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetQuestion2 {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(17);
        hashSet.add(5);
        hashSet.add(1);
        hashSet.add(19);
        hashSet.add(null);

        hashSet.forEach(element -> System.out.println(element));
    }
}
