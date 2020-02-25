package com.github.wangfeng.core.enumeration.v4;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < WeekDay.values().length; i++) {
            System.out.println("索引 " + WeekDay.values()[i].ordinal() + ", 值 : " + WeekDay.values()[i]);

        }
    }
}
