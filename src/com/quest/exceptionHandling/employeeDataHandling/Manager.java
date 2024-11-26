package com.quest.exceptionHandling.employeeDataHandling;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, double salary,int teamSize) throws InvalidInputException {
        super(name, age, salary);
        if(teamSize<1){
            throw new InvalidInputException("Team size must be greater than 0");
        }
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+", Age:"+getAge()+", Salary:"+getSalary()+", Team Size: " + teamSize;
    }
}
