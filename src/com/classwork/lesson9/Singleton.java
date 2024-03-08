package com.classwork.lesson9;

public class Singleton {
    private static Singleton INSTANCE;

    public Singleton() {
    }

    public static Singleton getINSTANCE() {
        if (INSTANCE==null){
           INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
