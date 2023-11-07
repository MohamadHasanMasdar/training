package org.example.multithread.condition;

public class AvalNumberDemoTest {

    public static void main(String[] args) {
        ProcessAvalNumbers avalNumbers = new ProcessAvalNumbers();
        ProcessAvalNumbers nonAvalNumbers = new ProcessAvalNumbers();

        avalNumbers.start();
        nonAvalNumbers.start();

        try {
            avalNumbers.join();
            nonAvalNumbers.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("aval numbers:");
        for (Integer number : avalNumbers.getAvalNumbers()) {
            System.out.println(number);
        }

        System.out.println("non aval numbers:");
        for (Integer number : avalNumbers.getNonAvalNumbers()) {
            System.out.println(number);
        }
    }
}
