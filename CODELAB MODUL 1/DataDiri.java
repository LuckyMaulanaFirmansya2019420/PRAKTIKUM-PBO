import java.time.LocalDate;
import java.time.Period;

public class DataDiri {
    private String nama;
    private char jenisKelamin;
    private LocalDate tanggalLahir;

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahirStr) {
        this.tanggalLahir = LocalDate.parse(tanggalLahirStr);
    }

    // Method untuk menghitung umur
    public int hitungUmur() {
        LocalDate sekarang = LocalDate.now();
        Period periode = Period.between(tanggalLahir, sekarang);
        return periode.getYears();
    }

    // Method untuk menampilkan data diri
    public void displayDataDiri() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + getJenisKelaminLengkap());
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + hitungUmur() + " tahun");
    }

    // Method untuk mengonversi jenis kelamin menjadi teks lengkap
    private String getJenisKelaminLengkap() {
        if (jenisKelamin == 'P') {
            return "Perempuan";
        } else if (jenisKelamin == 'L') {
            return "Laki-laki";
        } else {
            return "Tidak valid";
        }
    }
}