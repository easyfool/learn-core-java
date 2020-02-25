package com.github.wangfeng.core.serialize.v5;

import java.io.*;

/**
 * 敏感信息字段可以用transient 修饰,反序列化后值
 * 引用类型为null
 * 基本类型 数字类型为 0
 * boolean类型为 false
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new Person();
        p.setPassword("abcd");
        p.setUserName("wangfeng");
        p.setAge(32);
        p.setOld(true);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("transient.ser"));
        out.writeObject(p);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("transient.ser"));
        Person p0 = (Person) in.readObject();
        in.close();
        System.out.println(p0.getPassword());//null
        System.out.println(p0.getUserName());
        System.out.println(p0.getAge());
        System.out.println(p0.isOld());

    }
}
