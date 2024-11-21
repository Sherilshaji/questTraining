package com.quest.libraryManagementSystem;


public class Book {
    private String isbn;
    private String title;
    private String author;
    private int publishedYear;
    private boolean status;

    public Book(String isbn, String title, String author, int publishedYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.status = true;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String toString() {
        return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author+ ", publishedYear=" + publishedYear + ", available=" + status + " ]";
    }
}
