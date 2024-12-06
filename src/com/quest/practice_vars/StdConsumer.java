package com.quest.practice_vars;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StdConsumer {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bob");
        list.add("Alice");
        list.add("Mary");

        Consumer<String> consumer = name->
                System.out.println("Name: "+name.toUpperCase());
        Consumer<String> consumer2 = name->
                System.out.println("Length: "+name.length());
        Predicate<String> predicate = name->{
                if(name.length()>5) {
                    System.out.println("Name with length above 5: "+name);
                    return true;
                }else{
                    System.out.println("Name with length below 5: "+name);
                    return false;
                }
        };
        Supplier<String> supplier = ()-> {
            for (String s : list) {
                if(s.equals("Alic")) {
                    return s;
                }
            }
            return null;
        };

        for (String s : list) {
            consumer.accept(s);
            consumer2.accept(s);
            predicate.test(s);
        }
        System.out.println("Supplier: "+supplier.get());
    }
}
