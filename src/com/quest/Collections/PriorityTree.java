package com.quest.Collections;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityTree {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>() {};
        TreeSet<Integer> ts=new TreeSet<>();
        pq.add(11);
        pq.add(20);
        pq.add(13);
        pq.add(4);
        pq.add(25);
        pq.add(61);
//        pq.add(null);

        ts.add(11);
        ts.add(20);
        ts.add(13);
        ts.add(4);
        ts.add(25);
        ts.add(61);
//        ts.add(null);

        System.out.println("Priority Queue: ");
        pq.forEach(System.out::println);
        System.out.println("\n TreeSet: ");
        ts.forEach(System.out::println);

    }
}
