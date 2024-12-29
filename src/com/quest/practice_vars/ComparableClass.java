package com.quest.practice_vars;

public class ComparableClass {
    String name;
    int age;

    public ComparableClass(String name,int age){
        this.name=name;
        this.age=age;
    }

//    @Override
//    public int compareTo(ComparableClass o) {
//        return Integer.compare(this.age,o.age);
//    }

    @Override
    public String toString() {
        return  name +
                "(" + age+")" ;
    }
}
