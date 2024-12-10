package com.quest.BMWServiceCenterOperations;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ServiceCenter<ElectricVehicle> ev=new ServiceCenter<>();
        ServiceCenter<CombustionEngineVehicle> ice=new ServiceCenter<>();

        ElectricVehicle ev1 = new ElectricVehicle("EV001", "BMW", "i4", 2023, 15000.0,
                "John Doe", 80.0, 300.0);
        ElectricVehicle ev2 = new ElectricVehicle("EV002", "BMW", "iX", 2023, 12000.0,
                "Jane Smith", 100.0, 380.0);
        CombustionEngineVehicle ice1 = new CombustionEngineVehicle("ICE001", "BMW", "330i",
                2014, 51000.0, "Bob Wilson", "Petrol", 2.0);
        CombustionEngineVehicle ice2 = new CombustionEngineVehicle("ICE002", "BMW", "X5",
                2023, 18000.0, "Alice Brown", "Diesel", 3.0);

        ev.addServicedVehicle(ev1);
        ev.addServicedVehicle(ev2);
        ice.addServicedVehicle(ice1);
        ice.addServicedVehicle(ice2);

        System.out.println("Electric Vehicle: ");
        for(ElectricVehicle e:ev.getAllServicedVehicles()){
            System.out.println(e);
        }
        System.out.println("Combustion Vehicle: ");
        for(CombustionEngineVehicle c:ice.getAllServicedVehicles()){
            System.out.println(c);
        }

        Predicate<Vehicle> filter1=vehicle->{
            return vehicle.getMileage()>50000;
        };
        System.out.println("Vehicle with mileage greater than 50,000");
        Stream.of(ev1,ev2,ice1,ice2).filter(filter1).forEach(System.out::println);

        Predicate<Vehicle> filter2=vehicle->{
            return vehicle.getYear()<2015;
        };
        System.out.println("Vehicle manufactured before 2015");
        Stream.of(ev1,ev2,ice1,ice2).filter(filter2).forEach(System.out::println);

        Consumer<Vehicle> consumer=x->{
            System.out.println("Id: "+x.getVin()+", Mileage: "+x.getMileage());
        };
        System.out.println("Printing vehicle with details like VIN and mileage");
        Stream.of(ev1,ev2,ice1,ice2).forEach(consumer);

        Supplier<Vehicle> supplier=()->new ElectricVehicle("EV00"+new Random().nextInt(9)+2,"BMW","x",
                2000+new Random().nextInt(23),new Random().nextInt(10000),"Random",
                new Random().nextInt(100),new Random().nextInt(500));
        System.out.println(supplier.get());

        Function<Vehicle,Double> resaleValues=rp->{
            double originalPrice=20000000;
            double depreciationPrice=50000;
            int yearsUsed=2024-rp.getYear();
            return originalPrice-(depreciationPrice*yearsUsed);
        };
        Stream.of(ev1,ev2,ice1,ice2).forEach(x->System.out.println("Vehicle Id: "+x.getVin()+", Resale value: "+resaleValues.apply(x)));

        System.out.println("\nOldest Vehicle:");
        Vehicle oldestVehicle = Stream.of(ev1, ev2, ice1, ice2)
                .min((v1, v2) -> Integer.compare(v1.getYear(), v2.getYear()))
                .orElse(null);
        System.out.println(oldestVehicle);

        System.out.println("\nVehicle Count by Type:");
        long electricCount = Stream.of(ev1, ev2, ice1, ice2)
                .filter(v -> v instanceof ElectricVehicle)
                .count();
        long combustionCount = Stream.of(ev1, ev2, ice1, ice2)
                .filter(v -> v instanceof CombustionEngineVehicle)
                .count();

        System.out.println("Electric Vehicles: " + electricCount);
        System.out.println("Combustion Engine Vehicles: " + combustionCount);
    }
}
