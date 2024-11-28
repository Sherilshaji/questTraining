package com.quest.Collections;

import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        System.out.println(v.get(1));
        System.out.println(v.add(4));
        System.out.println(v.size());
        System.out.println(v.contains(2));
        System.out.println(v.lastElement());
        System.out.println(v.firstElement());
        System.out.println(v.remove(1));
        v.clear();
        System.out.println(v.isEmpty());
    }
}
