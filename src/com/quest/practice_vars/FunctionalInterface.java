package com.quest.practice_vars;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(5,10,26,45,13,2,7));


        Predicate<Integer> predicate=x->x%2==0;
        Consumer<List<Integer>> consumer=x->x.removeIf(predicate);
        consumer.accept(list);
        Supplier<String> supplier=()->"Modified list: "+list;
        System.out.println(supplier.get());
    }
}
