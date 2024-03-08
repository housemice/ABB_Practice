package com.homework.lesson4.task3;

public class Car {
    public Car(String brand, String model, int yearOfProduction, String fuelType, double speed) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.fuelType = fuelType;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", FuelType='" + fuelType + '\'' +
                ", speed=" + speed +
                '}';
    }

    String brand;
    String model;
    int yearOfProduction;
    String fuelType;
    double speed=0;

    public void speed(int speed){
        this.speed=speed;
    }
    public void slow(int speed){
        this.speed=speed;
    }
    public void stop(){
        this.speed=0;
    }
    public int CheckSpeed(){
        return (int) this.speed;
    }

}
