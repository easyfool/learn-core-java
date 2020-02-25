package com.github.wangfeng.core.java8.java8inaction.Chapter1.v1;

import java.util.ArrayList;
import java.util.List;

public class AppleFactory {
    public static List<Apple> createInventory() {
        String[] colors = {"red", "green", "blue"};
        List<Apple> inventory = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String color = colors[i % 3];
            double weight = Math.random() * 300;
            inventory.add(new Apple(color, weight));
        }
        return inventory;
    }
}
