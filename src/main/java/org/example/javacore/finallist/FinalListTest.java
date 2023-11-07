package org.example.javacore.finallist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalListTest {

    public static void main(String[] args) {


        final List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println(list);

        final List<Integer> list1 = Arrays.asList(10,20);
        list1.add(30);
        System.out.println(list1);


    }
}
