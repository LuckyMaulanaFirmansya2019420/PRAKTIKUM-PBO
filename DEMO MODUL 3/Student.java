public class Student extends User {
    @SuppressWarnings("unused")
    private Book[] borrowedBooks;

    public Student(String name, String nim, String faculty, String programStudi) {
        super(name, nim, faculty, programStudi);
        borrowedBooks = new Book[10]; // Maksimum 10 buku yang bisa dipinjam
    }

    public void menuStudent() {
        // Implementasi menu student
    }

    public void showBorrowedBooks() {
        // Implementasi menampilkan buku yang dipinjam oleh student
    }

    public void logout() {
        // Implementasi logout dari opsi student
    }

    @Override
    public void displayBooks() {
        // Override method displayBooks dari parent class User
        super.displayBooks();
        // Implementasi tambahan untuk student
    }

    public void returnBooks() {
        // Implementasi untuk mengembalikan buku
    }
}
