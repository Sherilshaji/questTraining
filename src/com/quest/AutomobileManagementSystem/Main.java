package com.quest.AutomobileManagementSystem;



import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("--Automobile Management System--");

        VehicleImplentation vehicle = new VehicleImplentation();
        vehicle.addData();
        Customer customer1=new Customer("B001","Bob","bob123@gmail.com");

        Map<Customer,Set<Vehicle>> map=new HashMap<>();
        map.put(customer1,new HashSet<>());

        System.out.println("Filtered by brand (Honda): ");
        vehicle.filterByBrand("Honda");

        try{
            System.out.println("Customer that purchased the vehicle (C002): ");
            map.get(customer1).addAll(customer1.getPurchasedVehicles());

            System.out.println(customer1);

            System.out.println("Inventory: ");
            vehicle.getInventory();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }



}
