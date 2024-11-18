package com.quest.practice_vars.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Enter details for Equity Stock--");
        System.out.println("Enter Stock Name: ");
        String stockName = sc.nextLine();
        System.out.println("Enter Stock Symbol: ");
        String stockSymbol = sc.nextLine();
        System.out.println("Enter Sector: ");
        String sector = sc.nextLine();
        System.out.println("Enter number of days: ");
        int days = sc.nextInt();
        int[] prices = new int[days];
        System.out.println("Enter prices: ");
        for (int i = 0; i < days; i++) {
            prices[i] = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("--Enter details for Commodity Stock--");
        System.out.println("Enter Stock Name: ");
        String commodityName = sc.nextLine();
        System.out.println("Enter Stock Symbol: ");
        String commoditySymbol = sc.nextLine();
        System.out.println("Enter Commodity Type: ");
        String commodityType = sc.nextLine();
        System.out.println("Enter number of days: ");
        int commodityDays = sc.nextInt();
        int[] commodityPrices = new int[commodityDays];
        System.out.println("Enter commodity Prices: ");
        for (int i = 0; i < commodityDays; i++) {
            commodityPrices[i] = sc.nextInt();
        }
        StockAnalyzer eqStock=new EquityStockAnalyzer(stockName,stockSymbol,sector,prices);
        StockAnalyzer commodityStock=new CommodityStockAnalyzer(commodityName,commoditySymbol,commodityType,commodityPrices);
        eqStock.displayAnalysis();
        commodityStock.displayAnalysis();
        double eqAvg=eqStock.calculateAveragePrice();
        double commAvg=commodityStock.calculateAveragePrice();
        double highestAvg=Math.max(eqAvg,commAvg);
        System.out.println("Comparison Results: ");
        System.out.println("Stock with highest average price: ");
        if(eqAvg>commAvg){
            System.out.print(stockName);
        }else{
            System.out.print(commodityName);
        }
        System.out.print(" with Average Price "+highestAvg);
    }
}
