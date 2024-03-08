package com.homework.lesson4.task2;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("Instance count after creating first : " + Counter.getInstanceCount());
        Counter counter2 = new Counter();
        System.out.println("Instance count after creating second : " + Counter.getInstanceCount());
    }
}
