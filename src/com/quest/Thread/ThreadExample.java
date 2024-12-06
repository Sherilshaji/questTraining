package com.quest.Thread;

public class ThreadExample extends Thread {
    public static void main(String[] args) {
        ThreadExample t1=new ThreadExample();
        ThreadExample t2=new ThreadExample();
        ThreadExample t3=new ThreadExample();

        t1.setPriority(8);
        t2.setPriority(7);
        t3.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        int a=3;
        int b=2;
        int c=a+b;
        System.out.println("Result: "+c);
        this.run2();
        System.out.println("Run 1");
    }
    public void run2(){
        System.out.println("Run 2"+this.currentThread());
        System.out.println("Current priority "+this.getPriority());
    }

}
