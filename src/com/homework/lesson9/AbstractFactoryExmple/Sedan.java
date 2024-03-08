package com.homework.lesson9.AbstractFactoryExmple;

public class Sedan implements Car{
    @Override
    public void assemble() {
        System.out.println("You created an Sedan type car : ");
    }
}
