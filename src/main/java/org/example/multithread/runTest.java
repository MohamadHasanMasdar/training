package org.example.multithread;

public class runTest {

    public static void main(String[] args) {
//        ThreadDemo demo1 = new ThreadDemo();
//        ThreadDemo demo2 = new ThreadDemo();
//        ThreadDemo demo3 = new ThreadDemo();
//        ThreadDemo demo4 = new ThreadDemo();
//
//        demo1.start();
//        demo2.start();
//        demo3.start();
//        demo4.start();

        Thread demo1 = new Thread(new RunnableDemo());
        Thread demo2 = new Thread(new RunnableDemo());
        Thread demo3 = new Thread(new RunnableDemo());
        Thread demo4 = new Thread(new RunnableDemo());

        demo1.start();
        demo2.start();
        demo3.start();
        demo4.start();
    }
}
