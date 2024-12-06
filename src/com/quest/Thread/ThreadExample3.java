package com.quest.Thread;

public class ThreadExample3  {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Thread1());
        Thread t2=new Thread(new Thread2());
        Thread t3=new Thread(new Thread3());
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
class Thread1 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello");
    }
}
class Thread2 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("World");
    }
}
class Thread3 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("!");
    }
}