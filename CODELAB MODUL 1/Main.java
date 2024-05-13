import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek untuk input data diri
        DataDiri dataDiri = new DataDiri();

        // Input data diri
        System.out.println("=== Input Data Diri ===");
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        dataDiri.setNama(nama);

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        dataDiri.setJenisKelamin(jenisKelamin);

        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirStr = scanner.next();
        dataDiri.setTanggalLahir(tanggalLahirStr);

        // Output data diri
        System.out.println("\n=== Data Diri ===");
        dataDiri.displayDataDiri();

        scanner.close();
    }
}