package com.quest.weatherMonitoringSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations op = new WeatherOperationsImpl();
        while (true){
            System.out.println("\nWelcome to Weather Monitoring System");
        System.out.println("1. Add City Weather");
        System.out.println("2. Display All Cities");
        System.out.println("3. Display City with Highest and Lowest Temperature");
        System.out.println("4. Display Cities with Humidity > 80%");
        System.out.println("5. Group Cities by Condition");
        System.out.println("6. Calculate Average Temperature");
        System.out.println("7. Display Alerts");
        System.out.println("8. Exit");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                fetchData(sc, op);
                break;
            case 2:
                op.display();
                break;
            case 3:
                op.highTemperature();
                op.lowTemperature();
                break;
            case 4:
                op.humidity();
                break;
            case 5:
                op.displayByCondition();
                break;
            case 6:
                op.avgTemperature();
                break;
            case 7:
                op.alert();
                break;
            case 8:
                System.out.println("Exiting the program");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    }

    private static void fetchData(Scanner sc, Operations op) {
        System.out.println("Adding Weather Data...");
        System.out.print("City:");
        sc.nextLine();
        String city= sc.nextLine();
        System.out.print("Temperature:");
        double temp= sc.nextDouble();
        System.out.print("Humidity:");
        double hum= sc.nextDouble();
        System.out.print("Condition:");
        sc.nextLine();
        String condition= sc.nextLine();
        op.addData(city,temp,hum,condition);
    }
}
