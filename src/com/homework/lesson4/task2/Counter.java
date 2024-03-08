package com.homework.lesson4.task2;

public class Counter {
    public static int instanceCount=0;

    public static int getInstanceCount(){
        return instanceCount;
    }

    {
    instanceCount++;
    }

}
