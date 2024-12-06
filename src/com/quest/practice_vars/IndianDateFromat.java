package com.quest.practice_vars;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IndianDateFromat {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(today.format(formatter));
    }
}
