package com.quest.AutomobileManagementSystem;

import java.time.LocalDate;

public class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(String vehicleID, String brand, String model, double price, LocalDate manufactureDate,int engineCapacity) {
        super(vehicleID, brand, model, price, manufactureDate);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+", Bike : " +
                "engineCapacity=" + engineCapacity ;
    }
}
