package com.homework.lesson9.AbstractFactoryExmple;

public class Hatchback implements Car{
    @Override
    public void assemble() {
        System.out.println("You created hatchback type car : ");
    }
}
