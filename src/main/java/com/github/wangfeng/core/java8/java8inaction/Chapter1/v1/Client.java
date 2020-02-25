package com.github.wangfeng.core.java8.java8inaction.Chapter1.v1;

import java.util.List;


public class Client {
    public static void main(String[] args) {

        List<Apple> inventory = AppleFactory.createInventory();
        List<Apple> greenApples = Apple.filterGreenApple(inventory);
        System.out.println(greenApples);
        List<Apple> heavyApples = Apple.filterHeavyApple(inventory);
        System.out.println(heavyApples);
    }


}
