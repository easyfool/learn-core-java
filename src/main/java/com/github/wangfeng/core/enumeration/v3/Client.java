package com.github.wangfeng.core.enumeration.v3;

public class Client {
    public static void main(String[] args) {
        SignalLight signal = SignalLight.GREEN;
        switch (signal) {
            case RED:
                System.out.println("red");
                break;
            case GREEN:
                System.out.println("green");
                break;
            case YELLOW:
                System.out.println("yellow");
                break;
        }
        System.out.println(signal.toString());
    }
}
