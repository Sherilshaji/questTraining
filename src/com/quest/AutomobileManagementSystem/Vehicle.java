package com.quest.AutomobileManagementSystem;

import java.time.LocalDate;

public class Vehicle {
    private String vehicleID;
    private String brand;
    private String model;
    private double price;
    private LocalDate manufactureDate;
    public Vehicle(String vehicleID, String brand, String model, double price, LocalDate manufactureDate) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }


    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return "Vehicle : " +
                "vehicleID=" + vehicleID +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", manufactureDate=" + manufactureDate ;
    }
}
