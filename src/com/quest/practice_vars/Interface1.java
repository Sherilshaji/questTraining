package com.quest.practice_vars;

public interface Interface1 {
    void method1();

    static void method2() {
        System.out.println("method2");
    }

    default void method3() {
        System.out.println("method3");
//        method2();
    }
}
