package com.homework.lesson9.AbstractFactoryExmple;

public class Main {
    public static void main(String[] args) {

        CarFactory carFactory = new AzerbaijanCarFactory();
        Car prius = carFactory.createCar();
        CarSpecs priusForQaqas = carFactory.carSpecs();

        priusForQaqas.specsCreation();
        prius.assemble();
    }
}
