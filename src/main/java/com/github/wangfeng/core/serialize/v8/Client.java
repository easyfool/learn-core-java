package com.github.wangfeng.core.serialize.v8;

import java.io.*;

/**
 * 在序列化之后，由于 Person 的结构发生变化，增加了password属性 和方法，导致了Person的serialVersionUID发生变化。
 * 此时反序列化失败。
 * 定义需要序列化的类的serialVersionUID 可解决
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Person p = new Person();
//        p.setUserName("wangfeng");
//
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("v8Person.ser"));
//        out.writeObject(p);
//        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("v8Person.ser"));
        Person person = (Person) in.readObject();
        in.close();

        System.out.println(person.getUserName());


    }
}
