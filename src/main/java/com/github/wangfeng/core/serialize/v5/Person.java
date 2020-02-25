package com.github.wangfeng.core.serialize.v5;

import java.io.Serializable;

/**
 * 敏感信息字段可以用transient 修饰
 */
public class Person implements Serializable {
    private String userName;
    private transient String password;

    private transient int age;

    private transient boolean old;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOld() {
        return old;
    }

    public void setOld(boolean old) {
        this.old = old;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
