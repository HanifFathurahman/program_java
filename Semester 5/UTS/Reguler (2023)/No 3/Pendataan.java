class Pendataan {
    // Atribut data pemasok dan barang
    private String namaPemasok;
    private String alamatPemasok;
    private String noTelpPemasok;

    private String kodeBarang;
    private String namaBarang;
    private String merkBarang;

    // Method untuk menyimpan data pemasok
    public void dataPemasok(String nama, String alamat, String noTelp) {
        this.namaPemasok = nama;
        this.alamatPemasok = alamat;
        this.noTelpPemasok = noTelp;
    }

    // Method untuk menyimpan data barang
    public void dataBarang(String kode, String nama, String merk) {
        this.kodeBarang = kode;
        this.namaBarang = nama;
        this.merkBarang = merk;
    }

    // Method untuk menampilkan data pemasok
    public void tampilkanPemasok() {
        System.out.println("Nama Pemasok: " + namaPemasok);
        System.out.println("Alamat Pemasok: " + alamatPemasok);
        System.out.println("No Telp Pemasok: " + noTelpPemasok);
    }

    // Method untuk menampilkan data barang
    public void tampilkanBarang() {
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Merk Barang: " + merkBarang);
    }
}