package com.quest.Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();
        map.put(new Student(5,"Bob"),"c");
        map.put(new Student(2,"Alice"),"a");
        map.put(new Student(3,"Jack"),"d");
        map.put(new Student(1,"Charlie"),"e");
        map.put(new Student(4,"David"),"b");
        List<Map.Entry<Student,String>> entries=new ArrayList<>(map.entrySet());
        Collections.sort(entries,new StudentComparator());
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey().getId()+" "+entry.getKey().getName() + " " + entry.getValue());
        }
    }
}
