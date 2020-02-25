package com.github.wangfeng.core.serialize.v1;


import java.io.*;

public class SimpleSerializedPerson {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serialize();
        deserialize();
    }

    private static void serialize() throws IOException {
        Person p1 = new Person();
        p1.setUserName("wangfeng");
        p1.setAge(32);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("p1.ser"));
        oos.writeObject(p1);
        oos.close();

    }

    private static void deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("p1.ser"));

        Person p1 = (Person) ois.readObject();
        ois.close();
        System.out.println(p1.getAge());
        System.out.println(p1.getUserName());


    }

}
