package com.quest.Collections.Set;

import java.util.PriorityQueue;

public class PriorityQueueExp2 {
    public static void main(String[] args) {
        System.out.println("Integer:");
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
        System.out.println("Double:");
        PriorityQueue<Double> pq1 = new PriorityQueue<>() {};
        pq1.add(11.01);
        pq1.add(20.21);
        pq1.add(13.54);
        pq1.add(4.00);
        pq1.add(25.12);
        pq1.add(61.35);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println("Character:");
        PriorityQueue<Character> pq2 = new PriorityQueue<>() {};
        pq2.add('A');
        pq2.add('B');
        pq2.add('C');
        pq2.add('D');
        pq2.add('E');
        pq2.add('F');
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println("Float:");
        PriorityQueue<Float> pq3 = new PriorityQueue<>() {};
        pq3.add(1.2F);
        pq3.add(20.2F);
        pq3.add(13.45F);
        pq3.add(4.5F);
        pq3.add(25.4F);
        pq3.add(61.1F);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
