import java.util.Scanner;
class ATK {
    private String kodeBarang;
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;
    private int total;
    private String bonus;

    // Method void untuk menampilkan daftar barang
    public void tampilDaftarBarang() {
        System.out.println("DAFTAR BARANG ATK");
        System.out.println("=====================================");
        System.out.println("Kode  Nama                     Harga");
        System.out.println("101   Buku Gambar (1 Pack)   Rp.24.000");
        System.out.println("201   Buku Tulis (1 Pack)    Rp.42.000");
        System.out.println("301   Pensil (1 Pack)        Rp.18.000");
        System.out.println("401   Bulpoint (1 Pack)      Rp.36.000");
        System.out.println("=====================================");
    }
    
    // Method void untuk input barang
    public void inputBarang() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Kode Barang    :");
        kodeBarang = input.nextLine();
        
        // Kondisi majemuk untuk menentukan nama dan harga barang
        if (kodeBarang.equals("101")) {
            namaBarang = "Buku Gambar (1 Pack)";
            hargaBarang = 24000;
        } else if (kodeBarang.equals("201")) {
            namaBarang = "Buku Tulis (1 Pack)";
            hargaBarang = 42000;
        } else if (kodeBarang.equals("301")) {
            namaBarang = "Pensil (1 Pack)";
            hargaBarang = 18000;
        } else if (kodeBarang.equals("401")) {
            namaBarang = "Bulpoint (1 Pack)";
            hargaBarang = 36000;
        } else {
            System.out.println("Kode barang tidak valid!");
            return;
        }
        
        System.out.print("Masukkan Jumlah Barang  :");
        jumlahBarang = input.nextInt();
    }
    
    // Method non void untuk menghitung total
    public int hitungTotal() {
        total = hargaBarang * jumlahBarang;
        return total;
    }
    
    // Method untuk menentukan bonus
    public void tentukanBonus() {
        if (total < 100000) {
            bonus = "Selamat!! Anda mendapatkan Bonus 1 Penghapus!";
        } else if (total >= 100000 && total < 250000) {
            bonus = "Selamat!! Anda mendapatkan Bonus 1 Pack Sampul Coklat!!";
        } else if (total >= 250000) {
            bonus = "Selamat!! Anda mendapatkan Bonus 1 Pack Buku Tulis!!";
        }
    }
    
    // Method untuk menampilkan daftar pembelian
    public void tampilkanDaftarPembelian() {
        System.out.println("\nDaftar Pembelian");
        System.out.println("===============================");
        System.out.println("Kode Barang  :" + kodeBarang);
        System.out.println("Nama Barang  :" + namaBarang);
        System.out.println("Harga Satuan :" + hargaBarang);
        System.out.println("\nQTY    : " + jumlahBarang);
        System.out.println("Total  : Rp" + total);
        System.out.println("\nBonus  :" + bonus);
    }
}

// Class main
public class main_ATK {
    public static void main(String[] args) {
        // Membuat objek ATK
        ATK transaksi = new ATK();
        
        // Menampilkan daftar barang
        transaksi.tampilDaftarBarang();
        
        // Input dan proses
        transaksi.inputBarang();
        transaksi.hitungTotal();
        transaksi.tentukanBonus();
        
        // Tampilkan hasil
        transaksi.tampilkanDaftarPembelian();
    }
}