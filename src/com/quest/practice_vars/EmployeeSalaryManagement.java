package com.quest.practice_vars;

import java.util.InputMismatchException;
import java.util.Scanner;

class Employee{  //Created custom class to store values of different data types
    String name;
    double baseSalary;
    double[] salaries;
    double bonus;
    public Employee(String name,double baseSalary,double[] salaries){
        this.name=name;
        this.baseSalary=baseSalary;
        this.salaries=salaries;
        this.bonus=baseSalary*0.1;//calculates 10% of base salary
    }
}

public class EmployeeSalaryManagement {
    final static int MIN_EMPLOYEE = 1;
    final static int MIN_EMPLOYEE_SALARY = 0;
    final static int MAX_EMPLOYEE_SALARY = 100000;
    final static int MAX_EMPLOYEE = 100;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=employeeValidation(sc);
        Employee[] employees=new Employee[n];
        for(int i=0;i<n;i++){
            employees[i]=employeeFetch(sc,i); //Stores the value in Employee
        }
        System.out.println("---Employee Salary Report---");
        double totalSalary=0;
        for(int j=0;j<n;j++){  //Printing Employee Details
            System.out.println("Employee Name: "+employees[j].name);
            System.out.println("Base Salary: "+employees[j].baseSalary);
            System.out.println("Monthly Salary Breakdown:");
            for(int k=0;k<12;k++){
                System.out.println("Month "+(k+1)+": "+employees[j].salaries[k]);//Prints salary for each month
                totalSalary+=employees[j].salaries[k];
            }
            System.out.println("Total Salary: "+totalSalary);
            System.out.println("Average Monthly Salary: "+totalSalary/12);
            System.out.println("Bonus: "+employees[j].bonus);
        }
    }

    public static int employeeValidation(Scanner sc){
        while(true) {      //Checking for errors in the number of employees
            try {
                System.out.println("Enter the number of employees: ");
                int n = sc.nextInt();
                if(n>=MIN_EMPLOYEE && n<=MAX_EMPLOYEE) {
                    return n;
                }else{
                    System.out.println("Number must be between "+MIN_EMPLOYEE+" and "+MAX_EMPLOYEE);
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter valid number");
                sc.next();
            }
        }
    }
    public static Employee employeeFetch(Scanner sc,int i){
        System.out.println("Enter the name of employee "+(i+1)+": ");
        String name = sc.next();
        System.out.println("Enter the base salary for "+name+": ");
        double baseSalary=0;
        while(true){
            try{
                baseSalary = sc.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("Enter valid number");
                sc.next();
            }
        }
        double[] salaries=new double[12];
        for(int j=0;j<12;j++) {
            while (true) {
                try {
                    System.out.printf("Enter the salary for month %d (0-100000): ", j+1);  //Fetching salary from employee
                    double Salary = sc.nextDouble();
                    if(Salary>MIN_EMPLOYEE_SALARY && Salary<=MAX_EMPLOYEE_SALARY) {
                        salaries[j]=Salary;
                        break;
                    }else{
                        System.out.println("Salary should be greater than 0.");
                    }
                }catch(InputMismatchException e){
                    System.out.println("Enter valid number");
                    sc.next();
                }
            }
        }
        return new Employee(name,baseSalary,salaries);
    }
}
