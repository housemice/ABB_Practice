package com.classwork.lesson5;

public class Cat extends Mammal{
    @Override
    public void makeSound() {
        System.out.println("Meow-meow");
    }

    @Override
    public void describe() {
        System.out.print("Four legs says :");
        makeSound();
    }
}
