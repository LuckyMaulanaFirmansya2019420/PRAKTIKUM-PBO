import java.util.Scanner;

public class Mahasiswa {
    public void login() {
        Scanner scanner = new Scanner(System.in);

        // Meminta input NIM dari mahasiswa
        System.out.println("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        // Memeriksa panjang NIM
        if (nim.length() == 15) {
            System.out.println("Login mahasiswa berhasil.");
        } else {
            System.out.println("Panjang NIM harus 15 karakter.");
        }

        scanner.close();
    }
}