package com.quest.Map;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"John");
        map.put(2,"Jane");
        map.put(3,"Bob");
        map.put(4,"Mary");
        map.put(5,"Jack");
        System.out.println("Enter the id to search: ");
        int id = sc.nextInt();
        for(int i=0;i<map.size();i++){
            if(map.get(id).equals(map.get(i))){
                System.out.println(map.get(i));
            }
        }
    }
}
