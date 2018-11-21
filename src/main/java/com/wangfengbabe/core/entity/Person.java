package com.wangfengbabe.core.entity;

import java.io.IOException;
import java.io.Serializable;
import lombok.Data;

@Data
public class Person implements Serializable {

    private static final long serialVersionUID = 6300319998232205608L;
    private String firstName;
    private String lastName;
    private int age;
    private Person spouse;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws IOException {
        age = age << 2;
        stream.defaultWriteObject();

    }

    private void readObject(java.io.ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        age = age >> 2;

    }

}
