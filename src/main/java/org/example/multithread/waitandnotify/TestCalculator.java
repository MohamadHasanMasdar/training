package org.example.multithread.waitandnotify;

public class TestCalculator {

    public static boolean isComplete = false;
    private static final Calculator calculator = new Calculator();

    public static void main(String[] args) {

        PrintCalculatedNumber printNumber = new PrintCalculatedNumber(calculator);
        calculator.start();
        printNumber.start();


//        synchronized (calculator) {
//            try {
//                System.out.println("waiting");
//                calculator.wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//            System.out.println("total number is: " + calculator.getTotalNumber());
//        }
    }
}
