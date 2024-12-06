package com.quest.practice_vars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateConsumerSupplier {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Predicate<Integer> predicate = x -> x % 2 != 0;
        list.removeIf(predicate);
        Consumer<List<Integer>> consumer = x->{
            for (int i=0;i<x.size();i++){
                x.set(i,2*x.get(i));
            }
        };
        Supplier<List<Integer>> supplier = ()->{
            for(Integer i:list){
                System.out.println(i);
            }
            return list;
        };
        consumer.accept(list);
        supplier.get();
    }
}
