package org.example.multithread.waitandnotify;

public class PrintCalculatedNumber extends Thread{

    private Calculator calculator;

    public PrintCalculatedNumber(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        synchronized (this.calculator) {
            try {
                System.out.println("waiting...");
                this.calculator.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("total number is: " + this.calculator.getTotalNumber());
        }
    }

    private synchronized void test() {
        try {
            calculator.wait();
            int sum = calculator.getTotalNumber();
            System.out.println("sum number is: " + sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
