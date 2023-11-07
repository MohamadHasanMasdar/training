package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        HashSet<Integer> h = new HashSet<>();
//        HashSet<Integer> l = new LinkedHashSet<>();
//        l.add(10);
//        l.add(20);
//        l.add(30);
//        l.add(10);
//
//        System.out.println(l);

        String s1 = "hello";
        String s2 = new String("Hello");
        String s3 = new String("Hello");
        System.out.println(s1.compareTo(s2));
        if (s2 == s3)
            System.out.println("s2 is equal to s3");
        else
            System.out.println("s2 is not equal to s3");

//        test2 tst2 = new test2();
//        tst2.printInfo();

//        PersonClass personCls = new PersonClass();
//        personCls.name = "ll";
//        System.out.println(personCls.name);
//
//        personCls.name = "ggg";
//        System.out.println(personCls.name);
//
//        PersonRecord personRcd = new PersonRecord("ali");

        int number=5;
        increase(number);
        System.out.println(number);
    }

    public static void increase(int num){
        num = num+1;
    }
}

sealed class test1{

    String name;
    public test1() {
        this.name = "test1";
    }

    public String getName(){
        return this.name;
    }
}

non-sealed class test2 extends test1{
    public void printInfo(){
        test1 tst1 = new test2();
        System.out.println(tst1.getName());
    }
}
