package com.quest.practice_vars.test;

public class CommodityStockAnalyzer extends StockAnalyzer {
    String commodityType;
    public CommodityStockAnalyzer(String stockName, String stockSymbol, String commodityType,int[] prices) {
        super(stockName, stockSymbol, prices);
        this.commodityType = commodityType;
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
        int start = 0;
        int maxStart = 0;
        int maxLength = 1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= prices[i-1]) {
                start = i;
            }
            int currentLength = i - start + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxStart = start;
            }
        }
        int maxEnd = maxStart + maxLength - 1;
        return new int[]{maxStart, maxEnd, maxLength};
    }


    @Override
    public void displayAnalysis() {
        System.out.println("Analysis for Commodity Stock:");
        System.out.println("Stock Name: "+stockName);
        System.out.println("Stock Symbol: "+stockSymbol);
        System.out.println("Commodity Type: "+commodityType);
        System.out.println("Highest Price: "+findMaxPrice());
        System.out.println("Lowest Price: "+findMinPrice());
        System.out.println("Average: "+calculateAveragePrice());

    }
}
