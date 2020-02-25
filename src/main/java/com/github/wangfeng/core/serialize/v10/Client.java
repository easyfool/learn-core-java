package com.github.wangfeng.core.serialize.v10;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new Person();
        p.setUserName("wangfeng");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("v10.ser"));
        out.writeObject(p);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("v10.ser"));
        Person person = (Person) in.readObject();
        System.out.println(person.getUserName());

    }
}
