package com.quest.Map;

import java.util.HashMap;

public class ProductDetails {
    public static void main(String[] args) {
        HashMap<String,Double> map = new HashMap<>();
        map.put("Laptop", 1000.00);
        map.put("Smartphone", 700.00);
        map.put("Headphones", 150.00);
        map.put("Monitor", 300.00);

        map.put("Laptop",1500.00);
        System.out.println(map);
    }
}
