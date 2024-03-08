package com.homework.lesson5.task1;

public class PartTimeEmployee implements Employee{
    String name;
    int id;
    int hourlyRate;
    int hoursWorked;
    int monthlySalary;
    @Override
    public int calculateSalary() {
        return hoursWorked*hourlyRate;
    }

    @Override
    public String displayDetails() {
        return ("Name : "+this.name+'\n'+"Id : "+this.id+'\n'+"Salary : "+this.calculateSalary());
    }
    public  PartTimeEmployee(String name, int id, int hourlyRate, int hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

}
