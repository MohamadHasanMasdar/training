package org.example.multithread.waitandnotify;

public class Sender implements Runnable{

    private DataTransfer dataTransfer;

    public Sender(DataTransfer dataTransfer) {
        this.dataTransfer = dataTransfer;
    }

    @Override
    public void run() {
        String packets[] = {"First", "Second", "Third", "End"};
        for (String packet : packets) {
            System.out.println("sender is sending " + packet);
            dataTransfer.send(packet);
        }
    }
}
