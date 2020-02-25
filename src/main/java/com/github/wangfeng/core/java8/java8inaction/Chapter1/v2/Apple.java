package com.github.wangfeng.core.java8.java8inaction.Chapter1.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    public static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> predicate) {
        List<Apple> list = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                list.add(apple);
            }
        }
        return list;
    }

    public static boolean isGreenApple(Apple apple) {
        return apple.getColor().equals("green");

    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }


}