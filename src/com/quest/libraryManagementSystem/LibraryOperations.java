package com.quest.libraryManagementSystem;

public abstract class LibraryOperations {
    abstract void addBook(String isbn,String title, String author, int publishedYear);
    abstract void addMember(String memberId,String memberName,String contact);
    abstract void borrowBook(String isbn,String memberId);
    abstract void returnBook(String isbn,String memberId);
    abstract void displayBooks();
    abstract void displayMembers();
    abstract void searchBook(String query);
}
