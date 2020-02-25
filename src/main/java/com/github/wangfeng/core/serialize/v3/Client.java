package com.github.wangfeng.core.serialize.v3;

import java.io.*;

/**
 * 同一个对象的引用
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Course course = new Course();
        course.setName("数学");
        Student s1 = new Student();
        s1.setName("student A ");
        s1.setCourse(course);

        Student s2 = new Student();
        s2.setName("Student B ");
        s2.setCourse(course);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("course.ser"));
        out.writeObject(s1);
        out.writeObject(s2);
        out.close();


        ObjectInputStream in = new ObjectInputStream(new FileInputStream("course.ser"));
        Student ss1 = (Student) in.readObject();
        Student ss2 = (Student) in.readObject();
//        Student ss3 = (Student) in.readObject();//java.io.EOFException
        in.close();
        System.out.println(ss1.getCourse() == ss2.getCourse());//同一个对象
//        System.out.println(ss3);
    }
}
