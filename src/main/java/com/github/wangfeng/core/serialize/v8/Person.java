package com.github.wangfeng.core.serialize.v8;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -7308013448420512988L;
    private String userName;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
