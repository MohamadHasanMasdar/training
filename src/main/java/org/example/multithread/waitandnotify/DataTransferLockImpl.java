package org.example.multithread.waitandnotify;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DataTransferLockImpl implements DataTransfer {

    private static Lock lock = new ReentrantLock();
    private boolean transfer = true;
    private String transferMessage;

//    public DataTransferLockImpl(Lock lock) {
//        this.lock = lock;
//    }

    @Override
    public void send(String message) {
        lock.lock();
        while (!transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        transfer = false;
        this.transferMessage = message;
        notifyAll();
        lock.unlock();
    }

    @Override
    public String receive() {

        lock.lock();
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        transfer = true;
        notifyAll();
        lock.unlock();
        return transferMessage;
    }
}
