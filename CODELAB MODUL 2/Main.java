import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Input Data Mahasiswa ===");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan universitas: ");
        String universitas = scanner.nextLine();

        Mahasiswa.tampilUniversitas(universitas);
        Mahasiswa.tampilDataMahasiswa(nama, nim);

        scanner.close();
    }
}
