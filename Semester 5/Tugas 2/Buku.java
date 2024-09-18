public class Buku {
    private String kodeBuku;
    private String judulBuku;
    private String namaPenerbit;
    private String namaPenulis;
    private int jumlahBuku;  // Tetap private dan tidak bisa diakses langsung
    protected String nomorRak;

    // Constructor
    public Buku(String kode, String judul, String penerbit, String penulis, int jumlah, String rak) {
        kodeBuku = kode;
        judulBuku = judul;
        namaPenerbit = penerbit;
        namaPenulis = penulis;
        jumlahBuku = jumlah;
        nomorRak = rak;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfoBuku() {
        System.out.println("Kode Buku: " + kodeBuku);
        System.out.println("Judul Buku: " + judulBuku);
        System.out.println("Nama Penerbit: " + namaPenerbit);
        System.out.println("Nama Penulis: " + namaPenulis);
        System.out.println("Nomor Rak: " + nomorRak);
    }

    // Method untuk mendapatkan jumlah buku (private access tetap terjaga)
    public int hitungJumlahBuku() {
        return jumlahBuku;
    }
}
