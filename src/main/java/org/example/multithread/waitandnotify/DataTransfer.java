package org.example.multithread.waitandnotify;

public interface DataTransfer {

    void send(String message);
    String receive();
}
