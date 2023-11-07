package org.example.multithread.condition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProcessAvalNumbers extends Thread{

    private static List<Integer> allNumbers = new ArrayList<>();;
    private List<Integer> nonAvalNumbers = new ArrayList<>();
    private List<Integer> avalNumbers = new ArrayList<>();
    private static Lock lock = new ReentrantLock();
    private static Condition avalCondition = lock.newCondition();
    private static int counter=0;

    public ProcessAvalNumbers() {
        fillAllNumbersList();
    }

    private static void fillAllNumbersList() {
        if (allNumbers.isEmpty()) {
            for (int i=1; i<21; i++)
                allNumbers.add(i);
        }
    }

    public List<Integer> getNonAvalNumbers() {
        return nonAvalNumbers;
    }

    public List<Integer> getAvalNumbers() {
        return avalNumbers;
    }

    @Override
    public void run() {

        while (!allNumbers.isEmpty()) {
            lock.lock();
            Integer number = allNumbers.get(counter);
            if (isAvalNumber(number)) {
                System.out.println("thread " + Thread.currentThread().getName() +
                        "aval number is processing -> " + number);
                avalNumbers.add(number);
            } else {
                System.out.println("thread " + Thread.currentThread().getName()
                        + "non aval number is processing -> " + number);
                nonAvalNumbers.add(number);
            }

            counter++;
            allNumbers.remove(number);
            lock.unlock();
        }


    }

    private boolean isAvalNumber(Integer number) {
        if (number.equals(2) || number.equals(3) || number.equals(5) || number.equals(7))
            return true;

        return false;
    }
}
