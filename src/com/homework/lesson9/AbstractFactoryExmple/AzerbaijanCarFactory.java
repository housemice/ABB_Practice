package com.homework.lesson9.AbstractFactoryExmple;

public class AzerbaijanCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecs carSpecs() {
        return new AzerbaijanSpecs();
    }
}
