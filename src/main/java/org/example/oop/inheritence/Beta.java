package org.example.oop.inheritence;

public class Beta extends Alpha {
    String type;

    public Beta()  {
        System.out.println("beta construct");
    }

    void go() {
        type = "beta";
        System.out.println(this.type + " " + super.type);
    }
}
