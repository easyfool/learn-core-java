package com.github.wangfeng.core.serialize.v2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setName("student " + i + " ,");
            students.add(student);
        }

        Teacher t1 = new Teacher();
        t1.setName("teacher 1");

        Teacher t2 = new Teacher();
        t2.setName("teacher 2");
        t2.setTeacher(t1);
        t2.setStudents(students);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("teacher.ser"));
        out.writeObject(t2);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("teacher.ser"));
        Teacher teacher = (Teacher) in.readObject();
        in.close();
        System.out.println(teacher.getName());
        System.out.println(teacher.getTeacher().getName());
        teacher.getStudents().stream().forEach(System.out::print);
    }
}
