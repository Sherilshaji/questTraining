package com.quest.oops.abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        Student online=new OnlineStudent();
        Student offline=new OfflineStudent();
        Student regular=new RegularStudent();
        online.attendClass();
        online.submitAssigment();
        offline.attendClass();
        offline.submitAssigment();
        regular.attendClass();
        regular.submitAssigment();

    }
}
