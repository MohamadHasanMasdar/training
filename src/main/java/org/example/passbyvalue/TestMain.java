package org.example.passbyvalue;

public class TestMain {



    public static void main(String[] args) {
        Car car = new Car();
        car.setNumber(10);
        int number=10;
        increaseNumber(number);

        System.out.println(number);

    }

    private static void increaseNumber(Car c) {
        c.setNumber(c.getNumber() + 1);
    }

    private static void increaseNumber(int number) {
        number = number+1;
    }
}
