package com.quest.Collections;

import java.util.ArrayList;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        for(int i=1;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }
        list.forEach(System.out::println);
    }
}
