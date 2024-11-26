package com.quest.bookstoreInventoryManagement;

public class BookManagement {
    public static void main(String[] args) {
        Book[] books = {
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 499.99, 10),
                new SpecialEditionBook("Harry Potter", "J.K. Rowling", 999.99, 5, "Collector's Edition"),
                new Book("1984", "George Orwell", 299.99, 15),
                new Book("To Kill a Mockingbird", "Harper Lee", 349.99, 8),
                new Book("The Catcher in the Rye", "J.D. Salinger", 399.99, 12)
        };
        System.out.println("Books available:");
        for (Book book : books) {
            System.out.println(book);
        }
        Filter filter=(book,value)->book.getPrice()>value;
        double price=400;
        System.out.println("Books prices above "+price+":");
        for (Book book : books) {
            if(filter.filter(book,price)){
                System.out.println(book.getTitle());
            }
        }
    }
}
