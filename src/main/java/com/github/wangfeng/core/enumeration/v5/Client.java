package com.github.wangfeng.core.enumeration.v5;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(10, 5);
        for (int i = 0; i < Operation.values().length; i++) {
            store.cal(Operation.values()[i]);
        }
    }
}
