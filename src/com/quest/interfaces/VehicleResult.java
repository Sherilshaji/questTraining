package com.quest.interfaces;

public class VehicleResult extends Vehicle2 implements Vehicle {
    @Override
    public void engine() {
        System.out.println("I'm a engine");
    }

    @Override
    public void wheels() {
        System.out.println("I'm wheels");
    }

    public static void main(String[] args) {
        VehicleResult vehicle = new VehicleResult();
        System.out.println("Result: ");
        vehicle.engine();
        vehicle.wheels();
        vehicle.horn();
        vehicle.lights();
    }

    @Override
    public void horn() {
        System.out.println("Horn");
    }

    @Override
    public void lights() {
        System.out.println("Lights");
    }
}