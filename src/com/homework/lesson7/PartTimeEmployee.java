package com.homework.lesson7;

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlySalary;

    public PartTimeEmployee(String name, int experience, int hoursWorked, double hourlySalary) {
        super(name, experience);
        this.hoursWorked = hoursWorked;
        this.hourlySalary = hourlySalary;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
