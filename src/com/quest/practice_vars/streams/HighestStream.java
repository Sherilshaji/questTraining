package com.quest.practice_vars.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer sechighest=list.stream().filter(n->n<list.stream().max(Integer::compare).get())
                .max(Comparator.naturalOrder())
                .orElse(null);
        System.out.println(sechighest);
//        Consumer<Integer> consumer=i->{
//            if(i%2==0){
//                System.out.println(i);
//            }else{
//                System.out.println();
//            }
//        };
//        integerStream.peek(consumer).forEach(System.out::println);
    }
}
