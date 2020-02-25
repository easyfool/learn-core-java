package com.github.wangfeng.core.serialize.v4;

import java.io.*;

/**
 * 序列化同一对象用的序号引用，对象序列化后再改变property，序列化的属性维持第一次序列化的值而不会发生、、改变
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person();
        p1.setPassword("abcd");
        p1.setUserName("wangfeng");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
        out.writeObject(p1);

        p1.setUserName("zhaochi");
        out.writeObject(p1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
        Person p2 = (Person) in.readObject();
        Person p3 = (Person) in.readObject();
        System.out.println(p2.getUserName());
        System.out.println(p3.getUserName());
        in.close();

    }
}
