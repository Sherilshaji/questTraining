package com.quest.practice_vars;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {

        String str=null;
        String str1="Hello";
        Optional<String> optional=Optional.of(str1);
        Optional<String> optional1=Optional.ofNullable(str);

        if(optional1.isPresent()){
            System.out.println(optional1.get());
        }else{
            System.out.println("Empty");
        }
        String defaultValue=optional1.orElse("Default");
        System.out.println("Default value: "+defaultValue);

        Optional<String> optional2=optional.map(String::toUpperCase);
        System.out.println(optional2.get());

        Optional<String> optional3=optional.filter(x->x.startsWith("H"));
        System.out.println("Word starts with \"H\" "+optional3.orElse("Default"));
    }
}
