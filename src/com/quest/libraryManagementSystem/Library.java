package com.quest.libraryManagementSystem;

import java.time.LocalDate;

public class Library extends LibraryOperations{
    private Book[] books;
    private LibraryMember[] members;
    private int memberCount;
    private int numBooks;
    public Library() {
        books = new Book[100];
        members = new LibraryMember[50];
        numBooks = 0;
        memberCount=0;
    }

    @Override
    void addBook( String isbn,String title, String author, int publishedYear) {
        if(numBooks<100){
            books[numBooks++]=new Book(isbn,title,author,publishedYear);
            System.out.println("Book added");
        }
    }

    @Override
    void addMember(String memberId, String memberName, String contact) {
        if(memberCount<50){
            members[memberCount++]=new LibraryMember(memberId,memberName,contact);
            System.out.println("Member added");
        }
    }

    @Override
    void borrowBook(String isbn, String memberId) {
        Book book=findBook(isbn);
        LibraryMember member=findMember(memberId);
        if(book==null){
            System.out.println("Book not found");
            return;
        }
        if(member==null){
            System.out.println("Member not found");
            return;
        }
        if(book.getStatus()){
            book.setStatus(false);
            member.borrowBook(isbn);
            System.out.println("Book Borrowed");
        }else{
            System.out.println("Book is not available");
        }
    }

    @Override
    void returnBook(String isbn, String memberId) {
        Book book=findBook(isbn);
        LibraryMember member=findMember(memberId);
        if(book==null){
            System.out.println("Book not found");
            return;
        }
        if(member==null){
            System.out.println("Member not found");
            return;
        }
        if(book.getStatus()){
            book.setStatus(true);
            member.returnBook(isbn);
            System.out.println("Book Returned");
        }else{
            System.out.println("Book is already in library");
        }
    }

    @Override
    void displayBooks() {
        for(int i=0;i<numBooks;i++){
            if(books[i]!=null){
                System.out.println(books[i]);
            }
        }
    }

    @Override
    void displayMembers() {
        if(memberCount<0){
            System.out.println("No members available");
            return;
        }
        for(int i=0;i<memberCount;i++){
            System.out.println(members[i]);
        }
    }

    @Override
    void searchBook(String query) {
        for(int i=0;i<numBooks;i++){
            if(books[i].getTitle().toLowerCase().contains(query.toLowerCase())
            ||books[i].getAuthor().toLowerCase().contains(query.toLowerCase())
            ||books[i].getIsbn().toLowerCase().equals(query)){
                System.out.println(books[i]);
            }else{
                System.out.println("Book is not available");
            }
        }
    }
    public Book findBook(String isbn) {
        for(int i=0;i<numBooks;i++){
            if(books[i].getIsbn().equalsIgnoreCase(isbn)){
                return books[i];
            }
        }
        return null;
    }
    public LibraryMember findMember(String memberId) {
        for(int i=0;i<numBooks;i++){
            if(members[i].getMemberId().equalsIgnoreCase(memberId)){
                return members[i];
            }
        }
        return null;
    }
    public void addSampleDate(){
        addBook("B001", "Harry Potter", "J.K. Rowling", 1997);
        addBook("B002", "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        addBook("B003", "To Kill a Mockingbird", "Harper Lee", 1960);
        addBook("B004", "1984", "George Orwell", 1949);
        addBook("B005", "Pride and Prejudice", "Jane Austen", 1813);
        addMember("M001", "John Smith", "123-456-7890");
        addMember("M002", "Emma Wilson", "234-567-8901");
        addMember("M003", "Michael Brown", "345-678-9012");
        addMember("M004", "Sarah Davis", "456-789-0123");
        addMember("M005", "James Johnson", "567-890-1234");
    }

}
