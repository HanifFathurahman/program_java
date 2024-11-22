class Transaksi {
    // Atribut untuk harga barang dan jumlah barang
    double hargaBarang;
    int jumlahBarang;

    // Nilai potongan tetap dengan modifier final
    final double POTONGAN_A = 0.05; // 5% potongan untuk Kategori A
    final double POTONGAN_B = 0.10; // 10% potongan untuk Kategori B
    final double POTONGAN_C = 0.20; // 20% potongan untuk Kategori C

    // Method untuk mendeklarasikan data transaksi
    public void dataTransaksi(double harga, int jumlah) {
        this.hargaBarang = harga;
        this.jumlahBarang = jumlah;
    }

    // Method untuk menghitung potongan berdasarkan kategori
    public double hitungPotongan() {
        if (jumlahBarang >= 1 && jumlahBarang <= 100) {
            return hargaBarang * jumlahBarang * POTONGAN_A;
        } else if (jumlahBarang >= 101 && jumlahBarang <= 150) {
            return hargaBarang * jumlahBarang * POTONGAN_B;
        } else if (jumlahBarang > 150) {
            return hargaBarang * jumlahBarang * POTONGAN_C;
        } else {
            return 0; // Optional: This branch can be omitted if quantities are guaranteed to be >= 1
        }
    }

    // Method untuk menampilkan kategori berdasarkan jumlah barang
    public String kategoriBarang() {
        if (jumlahBarang >= 1 && jumlahBarang <= 100) {
            return "A. (1-100) > Potongan 5%";
        } else if (jumlahBarang >= 101 && jumlahBarang <= 150) {
            return "B. (101-150) > Potongan 10%"; // Corrected here
        } else {
            return "C. (>150) > Potongan 20%";
        }
    }

    // Method untuk menghitung total yang harus dibayar
    public double totalPembayaran() {
        return (hargaBarang * jumlahBarang) - hitungPotongan();
    }

    // Method untuk menghitung total harga sebelum potongan
    public double totalHarga() {
        return hargaBarang * jumlahBarang;
    }
}
