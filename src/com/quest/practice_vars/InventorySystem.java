package com.quest.practice_vars;

import java.util.Scanner;

public class InventorySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products={"Product A","Product B","Product C","Product D","Product E"};
        int[][] inventory={{100,200},{50,150},{200,50},{75,300},{150,100}};
        int[] quantitiesSold={20,60,60,10,30};
        revenue(products,inventory,quantitiesSold);
        restockInventory(products,inventory,quantitiesSold,sc);
        salesSummary(products,inventory,quantitiesSold,sc);
        outOfStock(products,inventory,quantitiesSold);
    }
    public static void revenue(String[] products,int[][] inventory,int[] quantitiesSold){
        double[] productRevenue=new double[products.length];
        double totalRevenue=0;
        for(int i=0;i<products.length;i++){
            productRevenue[i]=quantitiesSold[i]*inventory[i][1];
            totalRevenue+=productRevenue[i];
        }
        for(int i=0;i<products.length;i++){
            System.out.println(products[i]+" sold "+quantitiesSold[i]+", Revenue: $"+productRevenue[i]);
        }
        System.out.println("Total Revenue: $"+totalRevenue);
        inventoryShortageCheck(products,inventory,quantitiesSold);
    }
    public static void inventoryShortageCheck(String[] products,int[][] inventory,int[] quantitiesSold){
        for(int i=0;i<products.length;i++){
            if(quantitiesSold[i]>inventory[i][0]){
                System.out.println("Warning: Insufficent stock for "+products[i]+". Sold "+quantitiesSold[i]+" units, but only "+inventory[i][0]+" units were available.");
            }
        }
    }
    public static void restockInventory(String[] products,int[][] inventory,int[] quantitiesSold,Scanner sc){
        System.out.println("Enter the product name to restock: ");
        String productName=sc.nextLine();
        for(int i=0;i<products.length;i++){
            if(products[i].equalsIgnoreCase(productName)){
                System.out.println("Enter the quantity to restock: ");
                int quantity=Integer.parseInt(sc.nextLine());
                quantitiesSold[i]+=quantity;
                System.out.println("Restocking "+productName+" with "+quantity+" units");
                System.out.println("Updated stock for "+productName+" : "+quantitiesSold[i]+" units.");
                break;
            }
        }
        revenue(products,inventory,quantitiesSold);
    }
    public static void salesSummary(String[] products,int[][] inventory,int[] quantitiesSold,Scanner sc){
        System.out.println("--Enter the price range--");
        System.out.println("Min price: ");
        int minPrice=sc.nextInt();
        System.out.println("Max price: ");
        int maxPrice=sc.nextInt();
        System.out.println("Products in the price range $"+minPrice+" to $"+maxPrice);
        for(int i=0;i<products.length;i++){
            if(inventory[i][1]>=minPrice&&inventory[i][1]<=maxPrice){
                double productRevenue=quantitiesSold[i]*inventory[i][1];
                System.out.println(products[i]+":Revenue= "+productRevenue);
            }
        }
    }
    public static void outOfStock(String[] products,int[][] inventory,int[] quantitiesSold){
        System.out.println("Products out of stock.");
        for(int i=0;i<products.length;i++){
            if(quantitiesSold[i]>=inventory[i][0]||inventory[i][0]<=0){
                System.out.println(products[i]);
            }
        }
    }
}
