import java.util.Scanner;

public class Admin {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin123";

    public void login() {
        Scanner scanner = new Scanner(System.in);

        // Meminta input username dan password dari admin
        System.out.println("Masukkan username admin: ");
        String inputUsername = scanner.nextLine();
        System.out.println("Masukkan password admin: ");
        String inputPassword = scanner.nextLine();

        // Memeriksa username dan password
        if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
            System.out.println("Login admin berhasil.");
        } else {
            System.out.println("Username atau password salah.");
        }

        scanner.close();
    }
}