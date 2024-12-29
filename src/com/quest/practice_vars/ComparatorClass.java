package com.quest.practice_vars;

import java.util.Comparator;

public class ComparatorClass implements Comparator<ComparableClass> {

    @Override
    public int compare(ComparableClass o1, ComparableClass o2) {
        if(o1.age>o2.age){
            return 1;
        } else if (o1.age< o2.age) {
            return -1;
        }else
            return 0;
    }
}
