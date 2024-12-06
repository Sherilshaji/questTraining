package com.quest.AutomobileManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleImplentation {
    private List<Vehicle> inventory;
    public void addData(){
        inventory = new ArrayList<>(List.of(
                new Car("C001", "Toyota", "Corolla", 20000, LocalDate.of(2022, 5, 1), 5),
                new Car("C002", "Honda", "Civic", 22000, LocalDate.of(2023, 1, 15), 5),
                new Car("C003", "Tesla", "Model 3", 35000, LocalDate.of(2022, 8, 20), 5),
                new Bike("B001", "Yamaha", "R15", 1500, LocalDate.of(2021, 12, 10), 155),
                new Bike("B002", "Kawasaki", "Ninja", 18000, LocalDate.of(2023, 6, 18), 650)
        ));
    }
    public void filterByBrand(String brand){
        List<Vehicle> filteredList = inventory.stream().filter(v -> v.getBrand().equalsIgnoreCase(brand)).toList();
        filteredList.forEach(System.out::println);
    }
    public void purchaseVehicle(Customer customer, String vehicleId){
        Vehicle vh= inventory.stream().filter(v->v.getVehicleID().equalsIgnoreCase(vehicleId)).findFirst()
                .orElseThrow(()->new VehicleNotAvailableException("Vehicle Not Available"));
        inventory.remove(vh);
        customer.addPurchasedVehicle(vh);
    }
    public void getInventory() {
        inventory.forEach(System.out::println);
    }
}
