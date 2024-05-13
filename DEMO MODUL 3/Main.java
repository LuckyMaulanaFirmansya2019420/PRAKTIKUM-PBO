import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("=== Library Management System ===");
                System.out.println("1. Login as Admin");
                System.out.println("2. Login as Student");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        @SuppressWarnings("rawtypes") Admin admin = new Admin("Admin", "admin", "Admin Faculty", "Admin Program");
                        admin.menuAdmin();
                        break;
                    case 2:
                        Student student = new Student("Student", "S001", "Student Faculty", "Student Program");
                        student.menuStudent();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            }
        }
    }
}
