package com.github.wangfeng.core.java8.java8inaction.Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Dish {
    private String name;
    private int calories;
    private boolean vegetarian;
    private Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.calories = calories;
        this.vegetarian = vegetarian;
        this.type = type;
    }

    public enum Type {
        MEAT, FISH, OTHER
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", vegetarian=" + vegetarian +
                ", type=" + type +
                '}';
    }
}

public class DishClient {
    public static void main(String[] args) {
        List<Dish> dishes = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("smallon", false, 450, Dish.Type.FISH)
        );
        // 卡路里超过100的蔬菜名称，且按照卡路里倒序排列
        List<String> filteredDishes = dishes.stream().filter(dish -> dish.getCalories() > 100)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(filteredDishes);

        //选择头三个
        List<String> threeHighCaloriesDishes = dishes.stream().filter(d -> d.getCalories() > 300)
//                .sorted(Comparator.comparing(Dish::getCalories))
                .limit(3)
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(threeHighCaloriesDishes);

        dishes.stream().forEach(System.out::print);
        System.out.println();

        List<String> vegetarianDishes = dishes.stream().filter(Dish::isVegetarian).map(Dish::getName).collect(Collectors.toList());
        System.out.println(vegetarianDishes);

        System.out.println(dishes.stream().anyMatch(Dish::isVegetarian));

    }
}
