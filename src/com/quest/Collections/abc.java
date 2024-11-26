package com.quest.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class abc {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("John",22));
        list.add(new Person("Mary",26));
        list.add(new Person("Jake",19));
//        String a= list.get(1).getName();
//        System.out.println(a);
//        list.remove(1);
//        for (Person p : list) {
//            System.out.println(p.getName()+" "+p.getAge());
//        }
//        for (Person p : list) {
//            if(p.getAge()>20){
//                System.out.println(p.getName()+" "+p.getAge());
//            }
//        }
        Iterator<Person> it = list.iterator();
        while(it.hasNext()){
            Person p = it.next();
            if(p.getAge()<20){
                System.out.println(p.getName());
                System.out.println(p.getAge());
            }
        }
    }
}
