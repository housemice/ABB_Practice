package com.homework.lesson4.task5;

public class Main {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println("Day: " + day);
            System.out.println("Is it a weekend? " + day.isWeekend());
            System.out.println();
        }
    }
}
