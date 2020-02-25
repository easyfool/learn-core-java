package com.github.wangfeng.core.serialize.v9;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * writeObject 和 readObject 中一定要使用private void来修饰,否则不起作用.
 * writeObject 和 readObject成对提供，否则反序列化结果顺序有误，且结果不对
 */
public class Person implements Serializable {
    private String userName;
    private String password;


    private void writeObject(ObjectOutputStream out) throws IOException {
        System.out.println("object serialize...");
        out.writeObject(userName);
        out.writeObject(password.toUpperCase());

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("object deserialize");
        userName = (String) in.readObject();
        password = (String)in.readObject();
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
