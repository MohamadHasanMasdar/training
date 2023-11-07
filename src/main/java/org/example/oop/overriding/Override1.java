package org.example.oop.overriding;

public class Override1 {

    private String msg = "Hello World";
    private void fun() {
        System.out.println("Outer function");
    }

    class Inner extends Override1 {
        private void fun() {
            System.out.println("Accessing Private Member of Outer: "+ msg);
        }
    }


    public static void main(String[] args) {

        Override1 o = new Override1();
        Inner i = o.new Inner();

        i.fun();
        o = i;
        o.fun();
    }
}
