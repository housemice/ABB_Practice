package com.homework.lesson4.task3;

public class Main {
    public static void main(String[] args) {
        Car car= new Car("mers","w200",2003,"Benz",2900.3);
        System.out.println(car);
        car.speed(2333);
        System.out.println(car);
    }
}
