package com.quest.libraryManagementSystem;

public class LibraryMember {
    private String memberId;
    private String memberName;
    private String contact;
    private String[] borrowedBooks;
    private int bookCount;
    private static final int MAX_BOOK_COUNT = 5;

    public LibraryMember(String memberId, String memberName, String contact) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.contact = contact;
        this.borrowedBooks = new String[MAX_BOOK_COUNT];
        this.bookCount = 0;
    }
    public String getMemberId() {
        return memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public boolean borrowBook(String isbn) {
        if(bookCount < MAX_BOOK_COUNT) {
            borrowedBooks[bookCount] = isbn;
            bookCount++;
            return true;
        }
        return false;
    }
    public boolean returnBook(String isbn) {
        for(int i = 0; i < bookCount; i++) {
            if(borrowedBooks[i].equals(isbn)) {
                borrowedBooks[i] = borrowedBooks[--bookCount];
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return "Member ID: "+memberId + " Name: " + memberName + " Contact: " + contact;
    }

}
