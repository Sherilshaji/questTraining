package com.quest.Thread;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerPrblm {
    public static void main(String[] args) {
        SharedBuffer buffer=new SharedBuffer(3);
        int itemCount=5;

        Thread t1=new Thread(new Producer(buffer,itemCount));
        Thread t2=new Thread(new Consumer(buffer,itemCount));
        t1.start();
        t2.start();
    }
}
class SharedBuffer{
    private Queue<String> buffer;
    private int capacity;

    public SharedBuffer(int capacity){
        this.capacity=capacity;
        this.buffer=new LinkedList<>();
    }
    public synchronized void produce(String item) throws InterruptedException {
        while(buffer.size()==capacity){
            System.out.println("Buffer is full");
            wait();
        }
        buffer.add(item);
        System.out.println("Producer produced: "+item);
        notify();
    }
    public synchronized String consume() throws InterruptedException {
        while (buffer.isEmpty()){
            System.out.println("Buffer is empty");
            wait();
        }
        String item=buffer.poll();
        System.out.println("Consumer consumed: "+item);
        notify();
        return item;
    }
}
class Producer implements Runnable{
private SharedBuffer buffer;
private int itemCount;

public Producer(SharedBuffer buffer, int itemCount){
    this.buffer=buffer;
    this.itemCount=itemCount;
}

    @Override
    public void run() {
        for(int i=1;i<=itemCount;i++){
            try {
                buffer.produce("Item"+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer implements Runnable{
private SharedBuffer buffer;
private int itemCount;

public Consumer(SharedBuffer buffer,int itemCount){
    this.buffer=buffer;
    this.itemCount=itemCount;
}

    @Override
    public void run() {
        for(int i=1;i<=itemCount;i++){
            try {
                buffer.consume();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
