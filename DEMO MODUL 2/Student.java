import java.util.Scanner;

class Student {
    public void menuStudent() {
        System.out.println("=== Student Dashboard ===");
        System.out.println("1. Display Books");
        System.out.println("2. Logout");
        System.out.print("Choose an option: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayBooks();
                    break;
                case 2:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public void displayBooks() {
        Book[] books = Main.getBookList();
        System.out.println("=== Available Books ===");
        for (Book book : books) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Stock: " + book.getStock());
        }
    }
}