import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan beberapa objek Buku
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        // Menambahkan beberapa buku ke dalam daftar
        daftarBuku.add(new Buku("B001", "Pemrograman Java", "Pelita Mulia", "Hanif Fathurahman", 25, "Rak 3"));
        daftarBuku.add(new Buku("B002", "Algoritma dan Struktur Data", "Cerdas Mulia", "Nur Faishal Ramdani", 10, "Rak 5"));
        daftarBuku.add(new Buku("B003", "Pemrograman Python", "Elanga", "Udin", 15, "Rak 2"));

        // Menampilkan informasi dari setiap buku yang ada di daftar
        System.out.println("Daftar Buku di Perpustakaan:");
        int totalJumlahBuku = 0;  // Variabel untuk menyimpan total jumlah buku
        
        for (Buku buku : daftarBuku) {
            buku.tampilkanInfoBuku();
            System.out.println("--------------------------------");

            // Mengambil jumlah buku dari setiap objek Buku menggunakan method hitungJumlahBuku()
            totalJumlahBuku += buku.hitungJumlahBuku();
        }

        // Menampilkan total jumlah buku di perpustakaan
        System.out.println("Total Jumlah Keseluruhan Buku di Perpustakaan: " + totalJumlahBuku);
    }
}
