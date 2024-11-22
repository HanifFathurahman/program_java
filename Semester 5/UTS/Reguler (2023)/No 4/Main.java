import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengambil input dari pengguna
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = input.nextLine();
        System.out.print("Masukkan Harga Barang: ");
        double hargaBarang = input.nextDouble();
        System.out.print("Masukkan Jumlah Barang: ");
        int jumlahBarang = input.nextInt();

        // Membuat objek Transaksi
        Transaksi transaksi = new Transaksi(namaBarang, hargaBarang, jumlahBarang);

        // Menampilkan detail transaksi
        transaksi.tampilkanDetailTransaksi();

        // Menghitung dan menampilkan total pembayaran
        double total = transaksi.hitungTotalPembayaran();
        System.out.printf("Total Pembayaran: Rp. %.2f%n", total);

        input.close(); // Menutup scanner
    }
}