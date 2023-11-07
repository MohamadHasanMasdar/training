package org.example.multithread.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CalculateSumNumbersDemoTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.start();

        synchronized (calculator) {
            try {
                System.out.println("wait for calculate sum of numbers");
                calculator.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("finally sum number is: " +calculator.getSum());
        }
    }
}

class Calculator extends Thread{

    private int sum = 0;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        synchronized (this) {
            setSum(sumNumbersMethod());
            System.out.println("calculate sum numbers is done!");
            notify();
        }
    }

    private int sumNumbersMethod() {
        int sumTemp = 0;
        for (int i=1; i<11; i++)
            sumTemp += i;

        return sumTemp;
    }
}
