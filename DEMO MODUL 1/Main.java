import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang!");

        // Meminta user memilih peran (admin atau mahasiswa)
        System.out.println("Silakan pilih peran Anda (admin/mahasiswa): ");
        String role = scanner.nextLine();

        // Memeriksa peran yang dipilih
        if (role.equalsIgnoreCase("admin")) {
            // Login untuk admin
            Admin admin = new Admin();
            admin.login();
        } else if (role.equalsIgnoreCase("mahasiswa")) {
            // Login untuk mahasiswa
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.login();
        } else {
            System.out.println("Peran tidak valid.");
        }

        scanner.close();
    }
}