package com.quest.libraryManagementSystemNew;

public class Library {
    private Book[] books;
    private Member[] members;
    private int numBooks;
    private int numMembers;
    private static final int MAX_BOOKS = 100;
    private static final int MAX_MEMBERS = 50;
    private static final double DAILY_RATE = 1.50;

    public Library() {
        this.books = new Book[MAX_BOOKS];
        this.members = new Member[MAX_MEMBERS];
        this.numBooks = 0;
        this.numMembers = 0;
    }
    public void addBooks(String isbn, String title, String author) {
        if(numBooks < MAX_BOOKS) {
            books[numBooks]=new Book(isbn,title,author);
            numBooks++;
            System.out.println(title+" added successfully");
        }
    }
    public void addMembers(String memberName, String memberId,String membershipType) {
        if(numMembers < MAX_MEMBERS) {
            if(membershipType.equalsIgnoreCase("premium")){
                members[numMembers]=new PremiumMember(memberId,memberName);
            }else{
                members[numMembers]=new Member(memberId,memberName);
            }
            numMembers++;
            System.out.println(memberName+" added successfully");
        }
    }
    public void displayBooks() {
        for(int i=0; i<numBooks; i++) {
            System.out.println(books[i].getTitle());
        }
    }
    public void displayMembers() {
        for(int i=0; i<numMembers; i++) {
            System.out.println(members[i].getMemberName());
        }
    }
    public Book findBook(String isbn) {
        for(int i=0; i<numBooks; i++) {
            if(books[i].getIsbn().equalsIgnoreCase(isbn)) {
                return books[i];
            }
        }
        return null;
    }
    public Member findMember(String memberId) {
        for(int i=0; i<numMembers; i++) {
            if(members[i].getMemberId().equalsIgnoreCase(memberId)) {
                return members[i];
            }
        }
        return null;
    }
    public void borrowBook(String isbn, String memberId) {
        Book book=findBook(isbn);
        Member member=findMember(memberId);
        if(book==null||member==null) {
            System.out.println("Book or member not found");
            return;
        }
        if(member.borrowBook(book)) {
            book.setStatus(false);
            System.out.println("Book Borrowed");
        }else{
            System.out.println("Book is not available");
        }
    }
    public void returnBook(String isbn, String memberId) {
        Book book=findBook(isbn);
        Member member=findMember(memberId);
        if(book==null||member==null) {
            System.out.println("Book or member not found");
            return;
        }
        if(member.returnBook(book)) {
            book.setStatus(true);
            System.out.println("Book Returned");
        }else{
            System.out.println("Book is already in library");
        }
    }
    public double calculateLateFee(final int days){
        return DAILY_RATE*days;
    }
    public void addSampleDate(){
        addBooks("B001", "Harry Potter", "J.K. Rowling");
        addBooks("B002", "The Great Gatsby", "F. Scott Fitzgerald");
        addBooks("B003", "To Kill a Mockingbird", "Harper Lee");
        addBooks("B004", "1984", "George Orwell");
        addBooks("B005", "Pride and Prejudice", "Jane Austen");
        addMembers("M001", "John Smith", "123-456-7890");
        addMembers("M002", "Emma Wilson", "234-567-8901");
        addMembers("M003", "Michael Brown", "345-678-9012");
        addMembers("M004", "Sarah Davis", "456-789-0123");
        addMembers("M005", "James Johnson", "567-890-1234");
    }
}
