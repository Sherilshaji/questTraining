package com.quest.libraryManagementSystemNew;

public class Member implements LibraryOperations{
    private String memberName;
    private String memberId;
    int bookCount;
    private int borrowedBooks;

    public Member(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.bookCount = 2;
        this.borrowedBooks = 0;
    }
    public String getMemberName() {
        return memberName;
    }
    public String getMemberId() {
        return memberId;
    }


    @Override
    public boolean borrowBook(Book book) {
        if (borrowedBooks < bookCount && book.isStatus()) {
            book.setStatus(false);
            borrowedBooks++;
            return true;
        }
        return false;
    }

    @Override
    public boolean returnBook(Book book) {
        if (!book.isStatus()) {
            book.setStatus(true);
            borrowedBooks--;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Member [memberName=" + memberName + ", memberId=" + memberId + ", bookCount=" + bookCount+", borrowedBooks=" + borrowedBooks + "]";
    }
}
