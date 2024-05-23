package com.main;

import books.Book;
import books.HistoryBook;
import books.StoryBook;
import books.TextBook;
import data.Admin;
import data.Student;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class LibrarySystem {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new StoryBook("The Hobbit", "J.R.R. Tolkien");
        Book book2 = new TextBook("Introduction to Algorithms", "Thomas H. Cormen");
        Book book3 = new HistoryBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harari");

        // Adding books to the library
        ArrayList<Book> libraryBooks = new ArrayList<>();
        libraryBooks.add(book1);
        libraryBooks.add(book2);
        libraryBooks.add(book3);

        // Creating users
        Student student1 = new Student("John Doe", 123456);
        Student student2 = new Student("Jane Smith", 789012);
        Admin admin1 = new Admin("Admin", "admin123");

        // Simulating user actions
        System.out.println(student1.getName() + " borrows " + book1.getTitle());
        student1.borrowBook(book1);
        System.out.println(student2.getName() + " borrows " + book2.getTitle());
        student2.borrowBook(book2);
        System.out.println(student1.getName() + " returns " + book1.getTitle());
        student1.returnBook(book1);
        System.out.println(admin1.getName() + " adds a new book: " + book3.getTitle());
        admin1.addBookToLibrary(book3);
    }
}
