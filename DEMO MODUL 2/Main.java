import java.util.Scanner;

public class Main {
    private static Book[] bookList = {
        new Book("B001", "Introduction to Java", "John Doe", 10),
        new Book("B002", "Data Structures and Algorithms", "Jane Smith", 8)
    };
    private static User[] userStudent = {
        new User("S001", "Alice", "password1", null, null),
        new User("S002", "Bob", "password2", null, null)
    };
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("=== Library Management System ===");
                System.out.println("1. Login as Admin");
                System.out.println("2. Login as Student");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter admin username: ");
                        String adminUsername = scanner.next();
                        System.out.print("Enter admin password: ");
                        String adminPassword = scanner.next();
                        if (adminUsername.equals(ADMIN_USERNAME) && adminPassword.equals(ADMIN_PASSWORD)) {
                            Admin admin = new Admin();
                            admin.menuAdmin();
                        } else {
                            System.out.println("Invalid admin username or password.");
                        }
                        break;
                    case 2:
                        System.out.print("Enter student username (NIM): ");
                        String studentUsername = scanner.next();
                        System.out.print("Enter student password: ");
                        String studentPassword = scanner.next();
                        boolean studentAuthenticated = false;
                        for (User user : userStudent) {
                            if (user.getId().equals(studentUsername) && user.getPassword().equals(studentPassword)) {
                                studentAuthenticated = true;
                                break;
                            }
                        }
                        if (studentAuthenticated) {
                            Student student = new Student();
                            student.menuStudent();
                        } else {
                            System.out.println("Invalid student username or password.");
                        }
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            }
        } finally {
            scanner.close(); // Menutup objek Scanner setelah digunakan
        }
    }

    public static Book[] getBookList() {
        return bookList;
    }

    public static User[] getUserStudent() {
        return userStudent;
    }
}
