package com.quest.bookstoreInventoryManagement;

public class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
