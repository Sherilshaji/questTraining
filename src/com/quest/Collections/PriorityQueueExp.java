package com.quest.Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExp {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>() {};
        pq.add(11);
        pq.add(20);
        pq.add(13);
        pq.add(4);
        pq.add(25);
        pq.add(61);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
