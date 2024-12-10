package com.quest.BMWServiceCenterOperations;

public class Vehicle {
    private String vin;
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private String ownerName;

    public Vehicle(String vin,String brand,String model,int year,double mileage,String ownerName){
        this.vin=vin;
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.mileage=mileage;
        this.ownerName=ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Vehicle: " +
                "Id='" + vin + '\'' +
                ", Brand='" + brand + '\'' +
                ", Model='" + model + '\'' +
                ", Year=" + year +
                ", Mileage=" + mileage +
                ", Ownername='" + ownerName + '\'';
    }
}
