package org.example.multithread.waitandnotify;

public class DataTransferSynchronizedImpl implements DataTransfer {

    private String transferMessage;
    private boolean transfer = true;

    public synchronized void send(String message) {
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
    }

    public synchronized String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        transfer = true;
        notifyAll();
        return transferMessage;
    }
}
