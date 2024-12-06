package com.quest.AutomobileManagementSystem;

import java.time.LocalDate;

public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String vehicleID, String brand, String model, double price, LocalDate manufactureDate,int seatingCapacity) {
        super(vehicleID, brand, model, price, manufactureDate);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +  ", seatingCapacity=" + seatingCapacity ;
    }
}
