package com.github.wangfeng.core.serialize.v6;

import java.io.Serializable;

public class Person implements Serializable {
    private String userName;
    private static String msg = "hello world";

    public String getUserName() {
        return userName;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        Person.msg = msg;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
