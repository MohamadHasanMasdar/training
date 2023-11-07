package org.example.oop.inheritence;

public class Inheritence2 extends Base03 {

    private Inheritence2() {
        s += " Grand Child Class Message!\n";
    }
    public static void main(String[] args) {
        new Inheritence2();
        System.out.println(s);
    }
}

class Base03 {
    static String s = "";
    protected Base03() {
        s += " Base Class Message!\n";
    }
}

class Child02 extends Base03 {
    private Child02() {
        s += " Child Class Message!\n";
    }
}
