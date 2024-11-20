package com.quest.libraryManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryOperations lib = new Library();
        Library lib2 = new Library();
        lib2.addSampleDate();
        while(true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Display Available Books");
            System.out.println("7. Display All Members");
            System.out.println("8. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter ISBN");
                    String isbn= sc.next();
                    System.out.println("Enter Title");
                    String title = sc.next();
                    System.out.println("Enter Author");
                    String author = sc.next();
                    System.out.println("Enter Year");
                    int year = sc.nextInt();
                    lib.addBook(isbn, title, author, year);
                    break;
                case 2:
                    System.out.println("Enter Member ID");
                    String memberId = sc.next();
                    System.out.println("Enter Name");
                    String memberName = sc.next();
                    System.out.println("Enter Contact");
                    String contact = sc.next();
                    lib.addMember(memberId, memberName, contact);
                    break;
                case 3:
                    System.out.println("Enter the author-name/title/ISBN to search:");
                    String query = sc.next();
                    lib.searchBook(query);
                    break;
                case 4:
                    System.out.println("Enter ISBN: ");
                    isbn = sc.next();
                    System.out.println("Enter Member-ID");
                    sc.nextLine();
                    memberId = sc.nextLine();
                    lib.borrowBook(isbn, memberId);
                    break;
                case 5:
                    System.out.println("Enter ISBN: ");
                    isbn = sc.next();
                    System.out.println("Enter Member-ID: ");
                    sc.nextLine();
                    memberId=sc.nextLine();
                    lib.returnBook(isbn, memberId);
                    break;
                case 6:
                    lib.displayBooks();
                    break;
                case 7:
                    lib.displayMembers();
                    break;
                case 8:
                    System.out.println("Exiting the program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
