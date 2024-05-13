import java.util.Scanner;

class Admin {
    public void menuAdmin() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Admin Dashboard ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Add Book");
            System.out.println("4. Display Books");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    addBook();
                    break;
                case 4:
                    displayBooks();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public void addStudent() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Add Student ===");
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter NIM: ");
            String nim = scanner.nextLine();
            if (nim.length() != 15) {
                System.out.println("NIM is not valid!");
                return;
            }
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();
            System.out.print("Enter Faculty: ");
            String faculty = scanner.nextLine();
            System.out.print("Enter Study Program: ");
            String studyProgram = scanner.nextLine();
            @SuppressWarnings("unused")
            User newStudent = new User(nim, name, password, faculty, studyProgram);
        }
        // tambahkan newStudent ke dalam userStudent
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        User[] students = Main.getUserStudent();
        System.out.println("=== Registered Students ===");
        for (User student : students) {
            System.out.println("NIM: " + student.getId() + ", Name: " + student.getName() + ", Faculty: " + student.getFaculty() + ", Study Program: " + student.getStudyProgram());
        }
    }

    public void addBook() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Add Book ===");
            System.out.print("Enter Book Title: ");
            String title = scanner.nextLine();
            System.out.print("Enter Author: ");
            String author = scanner.nextLine();
            System.out.print("Enter ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Stock: ");
            int stock = scanner.nextInt();
            @SuppressWarnings("unused")
            Book newBook = new Book(id, title, author, stock);
        }
        // tambahkan newBook ke dalam bookList
        System.out.println("Book added successfully.");
    }

    public void displayBooks() {
        Book[] books = Main.getBookList();
        System.out.println("=== Available Books ===");
        for (Book book : books) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Stock: " + book.getStock());
        }
    }
}
