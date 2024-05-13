public class User {
    private String name;
    private String nim;
    private String faculty;
    private String programStudi;

    public User(String name, String nim, String faculty, String programStudi) {
        this.name = name;
        this.nim = nim;
        this.faculty = faculty;
        this.programStudi = programStudi;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("Faculty: " + faculty);
        System.out.println("Program Studi: " + programStudi);
    }

    public void displayBooks() {
        System.out.println("Displaying list of books...");
        // Implementasi menampilkan daftar buku
    }
}