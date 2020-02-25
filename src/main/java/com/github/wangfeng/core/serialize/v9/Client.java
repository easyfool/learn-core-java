package com.github.wangfeng.core.serialize.v9;

import java.io.*;

/**
 * 若类不仅实现了Serializable接口，并且还定义了readObject(ObjectInputStream in)和writeObject(ObjectOutputSteam out)，则采用以下方式进行序列化与反序列化：
 * * ObjectOutputStream调用User对象的writeObject(ObjectOutputStream out)的方法进行序列化。
 * * ObjectInputStream会调用User对象的readObject(ObjectInputStream in)的方法进行反序列化
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person();
        person.setUserName("wangfeng");
        person.setPassword("abcd");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("v9.ser"));
        out.writeObject(person);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("v9.ser"));
        Person p = (Person) in.readObject();
        in.close();
        System.out.println(p);
    }
}
