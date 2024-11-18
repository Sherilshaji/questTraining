package com.quest.interfaces;

public class Result implements InterfaceA,InterfaceB {
    @Override
    public void add() {
        System.out.println("Interface B add method");
    }

    @Override
    public void add1() {
        System.out.println("Interface A add1 method");
    }

    @Override
    public void sub() {
        System.out.println("Interface B sub method");
    }

    public static void main(String[] args) {
        Result r = new Result();
        System.out.println("Result");
        r.add();
        r.add1();
    }
}
