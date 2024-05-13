package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.books.Book;
import com.books.HistoryBook;
import com.data.Admin;
import com.data.Student;
import com.util.iMenu;

@SuppressWarnings("unused")
public class LibrarySystem {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("987654321098765")); // Dummy student

        List<Book> books = new ArrayList<>();
        books.add(new HistoryBook("The History of Java", "John Doe")); // Dummy book

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nLibrary System:");
                System.out.println("1. Admin Login");
                System.out.println("2. Student Login");
                System.out.println("3. Exit");

                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        adminLogin(students, books);
                        break;
                    case 2:
                        studentLogin();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

    private static void adminLogin(List<Student> students, List<Book> books) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(Admin.ADMIN_USERNAME) && password.equals(Admin.ADMIN_PASSWORD)) {
                Admin admin = new Admin(students, books);
                admin.menu();
            } else {
                System.out.println("Invalid username or password.");
            }
        }
    }

    private static void studentLogin() {
        // Implementasi
    }
}