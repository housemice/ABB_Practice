package com.classwork.lesson5;

public class Dog extends Mammal{
    @Override
    public void makeSound() {
        System.out.println("Bark bark");
    }

    @Override
    public void describe() {
        System.out.print("Four legs says : ") ;
        makeSound();
    }
}
