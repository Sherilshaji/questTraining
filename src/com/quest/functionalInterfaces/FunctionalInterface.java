package com.quest.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Supplier<Integer> supplier=()->new Random().nextInt(100)+1;
        list.add(supplier.get());
        System.out.println(supplier.get());
        Predicate<Integer> isEven=FunctionalInterface::isEven;
        

    }
    public static boolean isEven(int i){
        return i%2==0;
    }
}
