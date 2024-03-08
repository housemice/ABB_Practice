package com.classwork.lesson8;

public class Main {
    public static void main(String[] args) {
        Calculator<Integer,String> calculator=(o1, o2)->o1+Integer.parseInt(o2);

        System.out.println(calculator.calculate(1,"2"));
    }
}
