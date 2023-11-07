package org.example.multithread.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class HungryPerson extends Thread{

    private int personId;
    private static int serving=11;
    private static Lock slowCookerLid = new ReentrantLock();
    private static Condition soupTaken = slowCookerLid.newCondition();

    public HungryPerson(int personId) {
        this.personId = personId;
    }

    @Override
    public void run() {
        while (serving > 0) {
            slowCookerLid.lock();
            try {
                while ((personId != serving % 5) && serving > 0) {
                    System.out.format("person %d checked...then put the lid back. \n", personId);
                    soupTaken.await();
                }
                serving--;
                System.out.format("person %d take soup! serving left: %d\n", personId, serving);
                soupTaken.signalAll();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                slowCookerLid.unlock();
            }
        }
    }
}

public class ConditionDemoTest {
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            new HungryPerson(i).start();
        }
    }
}
