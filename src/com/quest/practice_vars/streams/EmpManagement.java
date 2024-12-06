package com.quest.practice_vars.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpManagement {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Bob",20,"Sales",20000.00,2));
        emp.add(new Employee(2,"Mary",26,"Marketing",40000.00,5));
        emp.add(new Employee(3,"John",25,"Engineering",30000.00,2));
        emp.add(new Employee(4,"Alice",22,"HR",25000.00,2));


        List<Employee> sortEmp = emp.stream()
                .sorted((e1,e2)->(Double.compare(e1.getSalary(),e2.getSalary())))
                .toList();
        sortEmp.forEach(System.out::println);
        System.out.println("-----");
        List<Employee> filterSal = emp.stream()
                .filter(emp1->emp1.getSalary()>25000.00).toList();
        filterSal.forEach(System.out::println);
        System.out.println("-----");
        Optional<Employee> maxSal = emp.stream()
                .sorted((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary()))
                .findFirst();
        System.out.println(maxSal.get());
        System.out.println("-----");
        List<Employee> skipEmp=emp.stream()
                .sorted((e1,e2)->(Double.compare(e1.getSalary(), e2.getSalary())))
                .skip(1)
                .toList();
        skipEmp.forEach(System.out::println);
        System.out.println("-----");
        List<Employee> dept=emp.stream()
                .filter(e->e.getDepartment().equals("Marketing")).toList();
        dept.forEach(System.out::println);
        System.out.println("-----");
        Map<String,List<Employee>> map=emp.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(map);
        System.out.println("-----");
        List<Employee> totalSal=emp.stream()
                        .sorted((e1,e2)-> (int) Double.sum(e1.getSalary(), e2.getSalary()))
                                .toList();
        System.out.println(totalSal);
    }
}
