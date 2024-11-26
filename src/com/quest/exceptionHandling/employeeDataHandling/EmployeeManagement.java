package com.quest.exceptionHandling.employeeDataHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp=null;
        Manager mngr=null;
        System.out.println("Enter Employee details: ");
        while(emp==null) {
            try {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                emp=new Employee(name,age,salary);
            }catch (InputMismatchException | InvalidInputException | IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
                sc.nextLine();
            }
        }
        System.out.println("Enter Manager details: ");
        while(mngr==null) {
            try {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                System.out.print("Team Size: ");
                int teamSize = sc.nextInt();
                mngr=new Manager(name,age,salary,teamSize);
            }catch (InputMismatchException | InvalidInputException | IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
                sc.nextLine();
            }
        }
        System.out.println("Final Output:");
        System.out.println("Employee Details: ");
        emp.displayDetails();
        System.out.println("Manager Details: ");
        System.out.println(mngr.toString());
    }
}
