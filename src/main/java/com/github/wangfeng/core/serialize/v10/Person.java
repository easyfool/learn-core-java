package com.github.wangfeng.core.serialize.v10;

import java.io.Serializable;

public class Person implements Serializable {
    private String userName;

    private Object writeReplace() {
        InnerPerson inner = new InnerPerson();
        inner.setA(userName + " hello world");
        return inner;
    }

    private Object readResolve() {
        Person p = new Person();
        p.setUserName("你好");
        return p;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private static class InnerPerson implements Serializable {
        private String a;

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        private Object readResolve() {
            return new Person();
        }


    }
}
