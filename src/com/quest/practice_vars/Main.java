package com.quest.practice_vars;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main{
    public enum level {
        low,
        medium,
        high;
    }

    public static void main(String[] args) {

        List<ComparableClass> list1=new ArrayList<>();
        list1.add(new ComparableClass("John",20));
        list1.add(new ComparableClass("Jack",25));
        list1.add(new ComparableClass("Mary",30));
        list1.add(new ComparableClass("Bob",21));

        list1.sort(new ComparatorClass());
        list1.forEach(System.out::println);
    }
}
