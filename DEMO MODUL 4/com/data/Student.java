package com.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.books.Book;
import com.util.iMenu;

public class Student implements iMenu {
    public static final String STUDENT_USERNAME = "987654321098765";
    public static final String STUDENT_PASSWORD = "ijklmnop";
    private String username;
    @SuppressWarnings("unused")
    private List<Book> borrowedBooks;

    public Student(String username) {
        this.username = username;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean isValidCredentials(String inputUsername, String inputPassword) {
        return inputUsername.equals(STUDENT_USERNAME) && inputPassword.equals(STUDENT_PASSWORD);
    }

    @Override
    public void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nStudent Menu:");
                System.out.println("1. List Available Books");
                System.out.println("2. List Borrowed Books");
                System.out.println("3. List Returned Books");
                System.out.println("4. Borrow Book");
                System.out.println("5. Logout");

                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        displayAvailableBooks();
                        break;
                    case 2:
                        displayBorrowedBooks();
                        break;
                    case 3:
                        displayReturnedBooks();
                        break;
                    case 4:
                        borrowBook();
                        break;
                    case 5:
                        System.out.println("Logged out as student.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

    private void displayAvailableBooks() {
        // Implementasi
    }

    private void displayBorrowedBooks() {
        // Implementasi
    }

    private void displayReturnedBooks() {
        // Implementasi
    }

    private void borrowBook() {
        // Implementasi
    }
}
