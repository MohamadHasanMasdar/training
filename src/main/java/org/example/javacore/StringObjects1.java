package org.example.javacore;

public class StringObjects1 {



    public static void main(String[] args) {
        // Input strings
        String s1 = new String("Hello World");
        String s2 = new String("Hello World");

        String s3 = "Hello World";
        String s4 = "Hello World";

        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println(s3 == s2);
    }
}
