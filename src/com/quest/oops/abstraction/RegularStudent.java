package com.quest.oops.abstraction;

public class RegularStudent extends Student{
    @Override
    public void attendClass() {
        System.out.println("Attending online and offline classes");
    }

    @Override
    public void submitAssigment() {
        System.out.println("Regular student submit assignment");

    }
}
