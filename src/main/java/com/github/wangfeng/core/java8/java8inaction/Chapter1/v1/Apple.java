package com.github.wangfeng.core.java8.java8inaction.Chapter1.v1;

import java.util.ArrayList;
import java.util.List;

public class Apple {
    private String color;
    private double weight;

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static List<Apple> filterGreenApple(List<Apple> inventory) {
        List<Apple> list = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                list.add(apple);
            }
        }
        return list;
    }

    public static List<Apple> filterHeavyApple(List<Apple> inventory) {
        List<Apple> list = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 150) {
                list.add(apple);
            }
        }
        return list;
    }


}