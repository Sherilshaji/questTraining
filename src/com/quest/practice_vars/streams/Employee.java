package com.quest.practice_vars.streams;

public class Employee {
    private int empId;
    private String empName;
    private int age;
    private String department;
    private double salary;
    private int experience;
    public Employee(int empId, String empName, int age, String department, double salary, int experience) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
