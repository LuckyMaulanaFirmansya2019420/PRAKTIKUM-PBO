import java.util.Scanner;

@SuppressWarnings("hiding")
public class Admin<Student> extends User {
    @SuppressWarnings("unused")
    private Student[] studentList;

    public Admin(String name, String nim, String faculty, String programStudi) {
        super(name, nim, faculty, programStudi);
        studentList = new Student[100]; // Kapasitas maksimum daftar mahasiswa
    }

    public void addStudent() {
        // Implementasi untuk menambahkan mahasiswa baru
    }

    public void inputBook() {
        // Implementasi untuk input buku baru
    }

    @Override
    public void displayBooks() {
        // Override method displayBooks dari parent class User
        super.displayBooks();
        // Implementasi tambahan untuk admin
    }

    public void displayStudent() {
        // Implementasi untuk menampilkan daftar mahasiswa
    }

    public boolean isAdmin(String username, String password) {
        // Implementasi untuk memverifikasi apakah user merupakan admin
        return true; // Contoh sederhana, selalu return true
    }

    public String generateId() {
        // Implementasi untuk meng-generate unique ID
        return null;
    }

    public void menuAdmin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'menuAdmin'");
    }
}
