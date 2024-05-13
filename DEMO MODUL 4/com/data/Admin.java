package com.data;

import java.util.List;
import java.util.Scanner;

import com.books.Book;
import com.util.iMenu;

public class Admin implements iMenu {
    public static final String ADMIN_USERNAME = "123456789012345";
    public static final String ADMIN_PASSWORD = "abcdefgh";
    private List<Student> students;
    private List<Book> books;

    public Admin(List<Student> students, List<Book> books) {
        this.students = students;
        this.books = books;
    }

    @Override
    public void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nAdmin Menu:");
                System.out.println("1. List Students");
                System.out.println("2. List Books");
                System.out.println("3. List Returned Books");
                System.out.println("4. Add Student");
                System.out.println("5. Remove Student");
                System.out.println("6. Logout");

                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        displayStudents();
                        break;
                    case 2:
                        displayBooks();
                        break;
                    case 3:
                        displayReturnedBooks();
                        break;
                    case 4:
                        addStudent();
                        break;
                    case 5:
                        removeStudent();
                        break;
                    case 6:
                        System.out.println("Logged out as admin.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

    private void displayStudents() {
        System.out.println("\nList of Students:");
        for (Student student : students) {
            System.out.println("Username: " + student.getUsername());
        }
    }

    private void displayBooks() {
        System.out.println("\nList of Books:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }

    private void displayReturnedBooks() {
        // Implementasi
    }

    private void addStudent() {
        // Implementasi
    }

    private void removeStudent() {
        // Implementasi
    }
}