package com.quest.oops.abstraction;

public class OnlineStudent extends Student{
    @Override
    public void attendClass() {
        System.out.println("online Attend Class");
    }

    @Override
    public void submitAssigment() {
        System.out.println("online Submit Assigment");
    }
}
