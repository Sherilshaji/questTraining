package com.quest.oops.test2;

public class A extends B {
    B b=new B();
    public static void main(String[] args) {
        A a = new A();
        a.add(5,10);

    }
    A(){
        System.out.println("A class constructor");
    }
    void add(){
        this.add();
        System.out.println("A class add method with no argument");
    }
    @Override
    void add(int a,int b){
        super.add(a,b);
        System.out.println("A class add method with arguments: "+(a+b));
    }
    static void add(int a){
        System.out.println("A class add method"+a);
        add(4);
    }

    public class C extends A{
        A a=new A();

        static void add(int a){
            System.out.println("A class add method"+a);
        }
    }
}

