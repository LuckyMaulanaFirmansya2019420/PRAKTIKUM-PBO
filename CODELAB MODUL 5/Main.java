import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> daftarMahasiswa = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Masukkan nama mahasiswa (ketik 'selesai' untuk mengakhiri):");

            boolean isInputSelesai = false;
            int nomorMahasiswa = 1;

            while (!isInputSelesai) {
                System.out.print("Nama mahasiswa ke-" + nomorMahasiswa + ": ");
                String namaMahasiswa = scanner.nextLine().trim();

                if (namaMahasiswa.equalsIgnoreCase("selesai")) {
                    isInputSelesai = true;
                } else {
                    try {
                        if (namaMahasiswa.isEmpty()) {
                            throw new IllegalArgumentException("Nama tidak boleh kosong");
                        }
                        daftarMahasiswa.add(namaMahasiswa);
                        nomorMahasiswa++;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
            }
        }

        System.out.println("\nDaftar mahasiswa:");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + daftarMahasiswa.get(i));
        }
    }
}
