package org.example.multithread.waitandnotify;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunTest {


    public static void main(String[] args) {

        DataTransfer dataTransfer = new DataTransferSynchronizedImpl();
//        DataTransfer dataTransfer = new DataTransferLockImpl();
        Thread sender = new Thread(new Sender(dataTransfer));
        Thread receiver = new Thread(new Receiver(dataTransfer));

        sender.start();
        receiver.start();

        try {
            sender.join();
            receiver.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
