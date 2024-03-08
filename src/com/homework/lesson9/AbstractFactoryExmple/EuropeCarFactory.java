package com.homework.lesson9.AbstractFactoryExmple;

public class EuropeCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecs carSpecs() {
        return new EuropeSpecs();
    }
}
