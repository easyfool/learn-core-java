package com.github.wangfeng.core.serialize.v6;


import java.io.*;

/**
 * 序列化仅对对象属性有效，对于static 无效
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new Person();
        p.setUserName("wangfeng");
        p.setMsg("hello");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("transient.ser"));
        out.writeObject(p);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("transient.ser"));
        Person p0 = (Person) in.readObject();
        in.close();
        System.out.println(p0.getUserName());
        System.out.println(p0.getMsg());
    }
}
