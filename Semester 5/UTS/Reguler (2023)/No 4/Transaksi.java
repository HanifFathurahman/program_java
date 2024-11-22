import java.util.Scanner;

class Transaksi {
    // Atribut untuk menyimpan data transaksi
    private String namaBarang;
    private double hargaBarang;
    private int jumlahBarang;

    // Konstruktor untuk menginisialisasi atribut
    public Transaksi(String namaBarang, double hargaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    // Metode untuk menampilkan detail transaksi
    public void tampilkanDetailTransaksi() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: Rp. " + hargaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
    }

    // Metode untuk menghitung total pembayaran (non-void)
    public double hitungTotalPembayaran() {
        return hargaBarang * jumlahBarang;
    }
}