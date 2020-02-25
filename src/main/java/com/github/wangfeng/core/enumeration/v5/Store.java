package com.github.wangfeng.core.enumeration.v5;

public class Store {
    private double x;
    private double y;

    public Store(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void cal(Calculator calculator) {
        System.out.println(calculator.apply(x, y));

    }

}
