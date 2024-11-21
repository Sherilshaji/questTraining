package com.quest.libraryManagementSystemNew;

public interface LibraryOperations {
    boolean borrowBook(Book book);
    boolean returnBook(Book book);
}
