package com.quest.Map;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        HashMap<Employee,Double> employees = new HashMap<>();
        employees.put(new Employee(5,"Bob"),40000.00);
        employees.put(new Employee(2,"Alice"),30000.00);
        employees.put(new Employee(3,"Jack"),10000.00);
        employees.put(new Employee(1,"Charlie"),500000.00);
        employees.put(new Employee(4,"David"),20000.00);

        List<Map.Entry<Employee, Double>> list = new ArrayList<>(employees.entrySet());
        Collections.sort(list,new MapEntryComparator());

        LinkedHashMap<Employee,Double> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Employee, Double> entry : list) {
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        for(Map.Entry<Employee, Double> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
