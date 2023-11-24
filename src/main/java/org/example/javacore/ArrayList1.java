package org.example.javacore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> ls1 = Arrays.asList(1,2,3,4,5);
        List<Integer> ls2 = ls1;

        System.out.println(ls2);
        System.out.println(ls2 == ls1);

        ls1 = Arrays.asList(7);
        System.out.println(ls2);
        System.out.println(ls2 == ls1);
    }
}
