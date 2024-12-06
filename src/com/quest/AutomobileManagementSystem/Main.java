package com.quest.AutomobileManagementSystem;


import java.time.LocalDate;
import java.util.*;

public class Main {
    private List<Vehicle> inventory;
    private Map<Customer,Set<Vehicle>> customerPurchases;
    public static void main(String[] args) {
        System.out.println("--Automobile Management System--");
        Main main = new Main();
        main.addVehicle(new Car("1", "Toyota", "Corolla", 25000.0, LocalDate.of(2020, 5, 15), 5));
        main.addVehicle(new Car("2", "Honda", "Civic", 27000.0, LocalDate.of(2021, 3, 10), 5));
        main.addVehicle(new Car("3", "Ford", "Mustang", 45000.0, LocalDate.of(2019, 8, 22), 4));
        main.addVehicle(new Bike("4", "Yamaha", "FZ", 8000.0, LocalDate.of(2022, 7, 18), 150));
        main.addVehicle(new Bike("5", "Harley-Davidson", "Street 750", 7500.0, LocalDate.of(2023, 1, 10), 750));

        Customer customer1=new Customer("B001","Bob","bob123@gmail.com");

        try{
            main.purchase(customer1,"2");
            main.purchase(customer1,"5");
            main.purchase(customer1,"2");
        }catch (VehicleNotAvailableException e){
            System.out.println(e.getMessage());
        }

        main.brandFilter("Ford");

        System.out.println("Cusomter Details: "+customer1);



    }
    public void mainSystem(){
        this.customerPurchases=new HashMap<>();
        this.inventory=new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void brandFilter( String brand) {
        inventory.stream()
                .filter(v->v.getBrand().equalsIgnoreCase(brand))
                .forEach(vehicle -> System.out.println(vehicle.toString()));
    }
    public void purchase(Customer customer, String vehicleId){
        Vehicle vehicle= (inventory.stream()
                .filter(vh -> vh.getVehicleID().equals(vehicleId))
                .findFirst()
                .orElseThrow(() -> new VehicleNotAvailableException("Vehicle not found." + vehicleId)));

        customer.addPurchasedVehicle(vehicle);
        inventory.remove(vehicle);
    }


}
