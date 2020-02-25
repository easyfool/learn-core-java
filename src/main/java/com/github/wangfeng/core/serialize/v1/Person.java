package com.github.wangfeng.core.serialize.v1;

import java.io.Serializable;

/**
 * 对象中仅包含基本类型或者String
 */

public class Person implements Serializable {

    private static final long serialVersionUID = 6300319998232205608L;
    private String userName;
    private int age;

    public Person() {
    }

    public Person(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
