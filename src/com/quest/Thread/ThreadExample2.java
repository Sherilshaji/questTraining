package com.quest.Thread;

public class ThreadExample2{
    public static void main(String[] args) {

        EvenThread th1=new EvenThread();
        OddThread th2=new OddThread();
        th1.setPriority(1);
        th2.setPriority(6);
        th1.start();
        th2.start();
    }
}
class OddThread extends Thread{
    @Override
    public void run() {
        System.out.println("Odd numbers");
        for (int i = 1; i <= 10; i++) {
            if(i%2!=0){
                System.out.println(i+" : "+Thread.currentThread());
            }
        }
    }
}
class EvenThread extends Thread{
    @Override
    public void run() {
        System.out.println("Even numbers");
        for (int i = 1; i <= 10; i++) {
            if(i%2==0){
                System.out.println(i+" : "+Thread.currentThread());
            }
        }
    }
}
