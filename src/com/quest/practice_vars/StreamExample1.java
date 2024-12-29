package com.quest.practice_vars;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(5,3,4,7,6,2));

        List<Integer> square=list.stream().map(n->n*n).toList();
        System.out.println(square);

        int[] arr={4,6,7,9,3,1};
        Stream<Integer> stream1= Arrays.stream(arr).boxed();
        System.out.println(stream1.max(Comparator.naturalOrder()).get());

//        Arrays.stream(arr).forEach(System.out::println);
        Stream<Integer> stream=Stream.of(5,3,7,6,4);
        List<Integer> list3=stream.collect(Collectors.toList());
        System.out.println(list3);
        Random random=new Random();
        int randomNum=Arrays.stream(arr).skip(random.nextInt(arr.length)).findFirst().orElseThrow();
        System.out.println(randomNum);//selecting a random number from an array

    }
}
