package org.example.multithread.waitandnotify;

public class Calculator extends Thread{

    private int totalNumber;

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    @Override
    public void run() {
        synchronized (this) {
            int sum=0;
            for (int i=1; i<11; i++)
                sum += i;

            setTotalNumber(sum);
            notify();
        }
    }

    private synchronized void calculateSumOfNumbers() {
        int sum=0;
        for (int i=1; i<11; i++)
            sum += i;

        setTotalNumber(sum);
//        TestCalculator.isComplete = true;
        notify();
    }
}
