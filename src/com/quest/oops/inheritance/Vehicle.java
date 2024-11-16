package com.quest.oops.inheritance;

public class Vehicle {
    public String brand;
    public String color;
    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}
