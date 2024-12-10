package com.quest.practice_vars;

public class Member {
    public static void main(String[] args) {
        InnerClass outer = new InnerClass();

        InnerClass.Inner inner= new InnerClass.Inner();
        inner.display();
    }
}
