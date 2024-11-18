package com.quest.practice_vars.test;

public class EquityStockAnalyzer extends StockAnalyzer {
    String sector;
    public EquityStockAnalyzer(String stockName,String stockSymbol,String sector,int[] prices) {
        super(stockName,stockSymbol,prices);
        this.sector = sector;
    }
    @Override
    public int findMaxPrice() {
        int max=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]>max){
                max=prices[i];
            }
        }
        return max;
    }

    @Override
    public int findMinPrice() {
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
        }
        return min;
    }

    @Override
    public double calculateAveragePrice() {
        double sum=0;
        for(int i=0;i<prices.length;i++){
            sum+=prices[i];
        }
        return sum/prices.length;
    }

    @Override
    public int[] findLongestIncreasingTrend() {
        return new int[0];
    }

    @Override
    public void displayAnalysis() {
        System.out.println("Analysis for Equity Stock:");
        System.out.println("Stock Name: "+stockName);
        System.out.println("Stock Symbol: "+stockSymbol);
        System.out.println("Sector: "+sector);
        System.out.println("Highest Price: "+findMaxPrice());
        System.out.println("Lowest Price: "+findMinPrice());
        System.out.println("Average: "+calculateAveragePrice());

    }
}
