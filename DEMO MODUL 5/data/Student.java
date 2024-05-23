package data;

import books.Book;
import java.util.ArrayList;
import java.util.Scanner;
import util.iMenu;

public class Student implements iMenu {
    private ArrayList<Book> books;
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.books = new ArrayList<>();
        // Example: Adding some books to the list
        this.books.add(new Book("Book1", "Author1"));
        this.books.add(new Book("Book2", "Author2"));
    }

    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. View Books");
            System.out.println("2. Choose Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewBooks();
                    break;
                case 2:
                    choiceBook();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private void viewBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void choiceBook() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the name of the book you want to choose:");
            String bookName = scanner.nextLine();
            for (Book book : books) {
                if (book.getName().equalsIgnoreCase(bookName)) {
                    System.out.println("You have chosen: " + book);
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    public void borrowBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getName() + "' borrowed successfully.");
    }

    public void returnBook(Book book) {
        books.remove(book);
        System.out.println("Book '" + book.getName() + "' returned successfully.");
    }

    public String getName() {
        return name;
    }

    // Implementation of getUsername() method specific to Student class
    public String getUsername() {
        return name + "_" + id; // Example: JohnDoe_123456
    }
}
