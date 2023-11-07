package org.example.oop.inheritence;

public class Manager extends Employer {

    public Manager(int age) {
//        super();
        System.out.println("manager age: " + age);
    }

    public Manager() {
        System.out.println("manager!!");
    }

    public void test1(){
        System.out.println("test child");
    }


}
