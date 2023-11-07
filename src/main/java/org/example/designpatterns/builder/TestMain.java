package org.example.designpatterns.builder;

public class TestMain {

    public static void main(String[] args) {
        Person builtPerson = new Person.Builder()
                .age(10)
                .motherName("test")
                .build();

        System.out.println(builtPerson);
    }
}
