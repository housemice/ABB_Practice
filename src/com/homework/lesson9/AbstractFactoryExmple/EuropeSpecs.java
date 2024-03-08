package com.homework.lesson9.AbstractFactoryExmple;

public class EuropeSpecs implements CarSpecs{
    @Override
    public void specsCreation() {
        System.out.println("Specs for europe cars : ");
    }
}
