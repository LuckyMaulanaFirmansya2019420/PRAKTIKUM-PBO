package data;

import util.iMenu;
import exception.custom.IllegalAdminAccess; // Pastikan impor ini benar
import java.util.Scanner;

import books.Book;

public class Admin implements iMenu {
    public Admin(String string, String string2) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Admin Menu:");
            System.out.println("1. View Users");
            System.out.println("2. Add User");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewUsers();
                    break;
                case 2:
                    addUser(scanner);
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

    public boolean isAdmin(String credentials) throws IllegalAdminAccess { // Baris 12: pengecualian sudah diimpor dengan benar
        if (!"admin".equals(credentials)) { // Baris 14: logika pembanding string yang benar
            throw new IllegalAdminAccess("Invalid credentials");
        }
        return true;
    }

    private void viewUsers() {
        // Implementasi untuk melihat daftar pengguna
        System.out.println("Viewing users...");
        // Kode untuk menampilkan pengguna bisa ditambahkan di sini
    }

    private void addUser(Scanner scanner) {
        // Implementasi untuk menambahkan pengguna
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Adding user: " + username);
        // Kode untuk menambahkan pengguna bisa ditambahkan di sini
    }

    public void addBookToLibrary(Book book3) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addBookToLibrary'");
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}
