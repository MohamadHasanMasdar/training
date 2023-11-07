package org.example.collection.list;

import java.util.Arrays;
import java.util.List;

public class ListQuestion1 {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,3,4,3);

        //traverse list using java8 features
        list.forEach(element -> System.out.println(element));

        //count if element exist in list
        System.out.println(list.stream().filter(element -> element.equals(3)).count());
    }
}
