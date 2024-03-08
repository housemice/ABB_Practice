package com.classwork.lesson8;

@FunctionalInterface
public interface Calculator<T ,V> {
    public int calculate(T integer, V string);

}
