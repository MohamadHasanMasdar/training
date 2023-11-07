package org.example.collection.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueQuestion1 {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("z");
        queue.add("d");
        queue.add("a");
        queue.add("y");
        queue.add("b");
        queue.add("e");

        String peek = queue.peek();
        System.out.println(peek);

//        System.out.println(queue);
//        while (!queue.isEmpty())
//            System.out.println(queue.poll());
    }
}
