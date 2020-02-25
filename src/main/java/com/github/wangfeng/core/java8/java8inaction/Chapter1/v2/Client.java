package com.github.wangfeng.core.java8.java8inaction.Chapter1.v2;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Apple> inventory = AppleFactory.createInventory();
        List<Apple> greenApples = Apple.filterApple(inventory, Apple::isGreenApple);
        System.out.println(greenApples);
        List<Apple> heavyApples = Apple.filterApple(inventory, Apple::isHeavyApple);
        System.out.println(heavyApples);

    }

}
