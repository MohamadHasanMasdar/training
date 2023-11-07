package org.example.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListQuestion2 {

    public static void main(String[] args) {
        List<ListType> list = new ArrayList<>();
        list.add(new ListType("mamad", "1"));
        list.add(new ListType("ali", "2"));
        list.add(new ListType("hasan", "3"));
        list.add(new ListType("hossein", "4"));

        list.stream()
                .sorted(Comparator.comparing(ListType::getTypeName))
                .forEach(System.out::println);
    }
}
