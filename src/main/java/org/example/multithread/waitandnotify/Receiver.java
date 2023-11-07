package org.example.multithread.waitandnotify;

public class Receiver implements Runnable{

    private DataTransfer dataTransfer;

    public Receiver(DataTransfer dataTransfer) {
        this.dataTransfer = dataTransfer;
    }

    @Override
    public void run() {
        for (String receivedMessage = dataTransfer.receive(); !"End".equals(receivedMessage); receivedMessage = dataTransfer.receive()) {
            System.out.println("received: " + receivedMessage);
        }
    }
}
