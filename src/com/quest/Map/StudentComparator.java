package com.quest.Map;

import java.util.Comparator;
import java.util.Map;

public class StudentComparator implements Comparator<Map.Entry<Student,String>> {

    @Override
    public int compare(Map.Entry<Student, String> o1, Map.Entry<Student, String> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}
