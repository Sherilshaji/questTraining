package com.quest.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExp {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(7);
        pq.add(12);
        pq.add(5);
//        pq.forEach(System.out::println);
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("A");
        pq2.add("B");
        pq2.add("C");
        pq2.add("D");
        pq2.add("null");
        pq2.forEach(System.out::println);
        System.out.println("---"+pq2.size());
        System.out.println(pq2.peek());
        System.out.println(pq2.remove());
        System.out.println("---"+pq2.poll());
        pq2.forEach(System.out::println);
    }
}
