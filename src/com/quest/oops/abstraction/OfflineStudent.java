package com.quest.oops.abstraction;

public class OfflineStudent extends Student{
    @Override
    public void attendClass() {
        System.out.println("Offline attend Class");
    }

    @Override
    public void submitAssigment() {
        System.out.println("Offline submit assigment");
    }
}
