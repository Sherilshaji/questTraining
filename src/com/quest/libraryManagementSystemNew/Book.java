package com.quest.libraryManagementSystemNew;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean status;

    public Book(String isbn, String title, String author) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = true;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
    }

}
