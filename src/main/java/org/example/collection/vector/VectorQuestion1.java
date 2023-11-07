package org.example.collection.vector;

import java.util.Vector;

public class VectorQuestion1 {

    public static void main(String[] args) {
        Vector obj = new Vector();
        obj.addElement(new Integer(3));
        obj.addElement(new Integer(4));
        obj.addElement(new Integer(5));
        obj.removeAll(obj);

        System.out.println(obj);
    }
}
