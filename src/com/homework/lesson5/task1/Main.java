package com.homework.lesson5.task1;

public class Main {

    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee=new FullTimeEmployee("daniil",1,2090);
        PartTimeEmployee partTimeEmployee= new PartTimeEmployee("daniil",2,3,19);
        System.out.println("---------------------------------");
        System.out.println(fullTimeEmployee.calculateSalary());
        System.out.println("---------------------------------");
        System.out.println(fullTimeEmployee.displayDetails());
        System.out.println("---------------------------------");
        System.out.println(partTimeEmployee.calculateSalary());
        System.out.println("---------------------------------");
        System.out.println(partTimeEmployee.displayDetails());
        System.out.println("---------------------------------");

    }
}
