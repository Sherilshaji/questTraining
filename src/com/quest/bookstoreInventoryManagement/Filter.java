package com.quest.bookstoreInventoryManagement;
@FunctionalInterface
public interface Filter {
    boolean filter(Book book, double price);
}
