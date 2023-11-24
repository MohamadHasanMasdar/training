package org.example.multithread.forkjoin1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class SumAction extends RecursiveAction {

    private static final int SEQUENTIAL_THRESHOLD = 5;

    private List<Long> data;

    public SumAction(List<Long> data) {
        this.data = data;
    }

    @Override
    protected void compute() {

        if (data.size() <= SEQUENTIAL_THRESHOLD) {
            long sum = computeSumDirectly();
//            System.out.println("sum of the list is: " + sum);
            System.out.format("Sum of %s: %d\n", data.toString(), sum);
        }
        else {
            int mid = data.size()/2;
            SumAction firstSubTask = new SumAction(data.subList(0, mid));
            SumAction secondSubTask = new SumAction(data.subList(mid, data.size()));

            firstSubTask.fork();
            secondSubTask.compute();
            firstSubTask.join();
        }

    }

    private Long computeSumDirectly() {
        long sum=0;
        for (Long element : data) {
            sum += element;
        }

        return sum;
    }


    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        for (long i=1; i<20; i++)
            list.add(i);

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        SumAction task = new SumAction(list);
        forkJoinPool.invoke(task);
    }
}
