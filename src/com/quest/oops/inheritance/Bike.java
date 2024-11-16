package com.quest.oops.inheritance;

public class Bike extends Vehicle {
    int gears;
    public Bike(String brand, String color, int gears) {
        super(brand,color);
        this.gears = gears;

    }
    public void color(){
        System.out.println("Bike color"+color);
    }
    @Override
    public void display() {
        super.display();
        System.out.println("No of gears: "+gears);
    }

}
