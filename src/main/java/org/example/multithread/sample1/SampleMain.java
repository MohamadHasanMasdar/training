package org.example.multithread.sample1;

public class SampleMain {
    public static void main(String[] args) {

        FirstThread firstRunnable = new FirstThread();
        SecondThread secondRunnable = new SecondThread();

        Thread thread1 = new Thread(firstRunnable);
        Thread thread2 = new Thread(secondRunnable);

        System.out.println("first thread value: " + firstRunnable.getFirstString());
        System.out.println("second thread value: " + secondRunnable.getSecondString());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

            System.out.println("first thread value: " + firstRunnable.getFirstString());
            System.out.println("second thread value: " + secondRunnable.getSecondString());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class FirstThread implements Runnable {

    private String firstString;

    public String getFirstString() {
        return firstString;
    }

    public void setFirstString(String firstString) {
        this.firstString = firstString;
    }

    @Override
    public void run() {
        setFirstString("string1");
    }
}

class SecondThread implements Runnable{

    private String secondString;

    public String getSecondString() {
        return secondString;
    }

    public void setSecondString(String secondString) {
        this.secondString = secondString;
    }

    @Override
    public void run() {
        setSecondString("string2");
    }
}
