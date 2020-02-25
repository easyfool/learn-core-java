package com.github.wangfeng.core.enumeration.v2;

public enum WeekDay {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
    private int day;

    WeekDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }
}
