package org.example.multithread;

public class RunnableDemo implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is starting");

        try {
            Thread.sleep(50);
            System.out.println(Thread.currentThread().getName() + " is sleeping");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " done");
    }
}
