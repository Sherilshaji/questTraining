package com.quest.exceptionHandling.employeeDataHandling;

public class Employee {
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary) throws InvalidInputException {
        if(age<18){
            throw new InvalidInputException("Age must be 18 or older.");
        }
        if(salary<0){
            throw new InvalidInputException("Salary is negative");
        }
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }

    public final void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
