package com.homework.lesson5.task1;

public class FullTimeEmployee implements Employee {

    String name;
    int id;
    int hourlyRate;
    int hoursWorked;
    int monthlySalary;
    @Override
    public int calculateSalary() {
        return monthlySalary;
    }


    public String displayDetails() {
       return  ("Name : "+this.name+'\n'+"Id : "+this.id+'\n'+"Salary : "+this.calculateSalary());

    }

    public FullTimeEmployee(String name, int id, int monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

}
