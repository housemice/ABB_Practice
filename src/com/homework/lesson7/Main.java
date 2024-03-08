package com.homework.lesson7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("John", 3, 50000));
        employees.add(new PartTimeEmployee("Alice", 4, 20, 25));
        employees.add(new FullTimeEmployee("Bob", 2, 60000));
        employees.add(new PartTimeEmployee("Eve", 5, 15, 20));

        // Filter employees with experience greater than 2
        List<Employee> experiencedEmployees = employees.stream()
                .filter(emp -> emp.getExperience() > 2)
                .sorted((emp1, emp2) -> Integer.compare(emp2.getExperience(), emp1.getExperience()))
                .collect(Collectors.toList());

        System.out.println("experience more than 2:");
        experiencedEmployees.forEach(System.out::println);

        // Calculate max and min salary
        double maxSalary = Double.MIN_VALUE;
        double minSalary = Double.MAX_VALUE;
        Employee maxSalaryEmployee = null;
        Employee minSalaryEmployee = null;

        for (Employee emp : experiencedEmployees) {
            if (emp instanceof FullTimeEmployee) {
                double salary = ((FullTimeEmployee) emp).getSalary();
                if (salary > maxSalary) {
                    maxSalary = salary;
                    maxSalaryEmployee = emp;
                }
                if (salary < minSalary) {
                    minSalary = salary;
                    minSalaryEmployee = emp;
                }
            }
        }

        Map<String, Employee> salaryMap = new HashMap<>();
        salaryMap.put("Max ; ", maxSalaryEmployee);
        salaryMap.put("Min ; ", minSalaryEmployee);

        System.out.println("Max and min");
        salaryMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
