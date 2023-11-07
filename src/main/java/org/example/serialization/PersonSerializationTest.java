package org.example.serialization;

import java.io.*;

public class PersonSerializationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person();
        person.setAge(20);
        person.setName("hamid");


        FileOutputStream fileOutputStream = new FileOutputStream("myfile.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("myfile.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person newPerson = (Person) objectInputStream.readObject();
        objectInputStream.close();


        System.out.println(newPerson.getAge());
        System.out.println(newPerson.getName());

    }

}
