package com.quest.bookstoreInventoryManagement;

public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;
    public static final double DISCOUNT_PERCENTAGE = 5;
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public void purchase(int quantity) throws OutOfStockException {
        if(this.stock < quantity){
            throw new OutOfStockException("Stock is less than required quantity.");
        }else{
            this.stock -= quantity;
            System.out.println("Purchase successful.");
        }
    }
    @Override
    public String toString() {
        return "Title: "+getTitle()+", Author: "+getAuthor()+", Price: "+getPrice()+", Stock: "+getStock();
    }
}
