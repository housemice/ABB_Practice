package com.homework.lesson7;

class Employee {
    private String name;
    private int experience;

    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
