public class Mahasiswa {
    public static void tampilUniversitas(String universitas) {
        System.out.println("Mahasiswa berasal dari Universitas " + universitas);
    }

    public static void tampilDataMahasiswa(String nama, String nim) {
        if (nim.length() == 15) {
            System.out.println("Nama Mahasiswa: " + nama);
            System.out.println("NIM Mahasiswa: " + nim);
        } else {
            System.out.println("Panjang NIM harus 15 karakter.");
        }
    }
}
