import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Membuat objek dari class Pendataan dan Transaksi
        Pendataan pemasok = new Pendataan();
        Transaksi transaksi = new Transaksi();

        boolean running = true; // Untuk menjaga agar program berjalan sampai user memilih keluar

        // Declare namaPemasok and namaBarang here
        String namaPemasok = ""; // Initialize as empty to avoid errors
        String namaBarang = "";   // Initialize as empty to avoid errors

        while (running) {
            // Menampilkan menu pilihan
            System.out.println("\n=== Menu ===");
            System.out.println("1. Pendataan");
            System.out.println("2. Transaksi");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    // Input data pemasok
                    input.nextLine();  // Membersihkan buffer input
                    System.out.println("\n=== Input Data Pemasok ===");
                    System.out.print("Nama Pemasok: ");
                    namaPemasok = input.nextLine(); // Update variable
                    System.out.print("Alamat Pemasok: ");
                    String alamatPemasok = input.nextLine();
                    System.out.print("No Telp Pemasok: ");
                    String noTelpPemasok = input.nextLine();
        
                    pemasok.dataPemasok(namaPemasok, alamatPemasok, noTelpPemasok);

                    // Input data barang
                    System.out.println("\n=== Input Data Barang ===");
                    System.out.print("Kode Barang: ");
                    String kodeBarang = input.nextLine();
                    System.out.print("Nama Barang: ");
                    namaBarang = input.nextLine(); // Update variable
                    System.out.print("Merk Barang: ");
                    String merk = input.nextLine();
        
                    pemasok.dataBarang(kodeBarang, namaBarang, merk);

                    // Menampilkan data pemasok dan barang
                    System.out.println("\n=== Data Pemasok ===");
                    pemasok.tampilkanPemasok();
                    System.out.println("\n=== Data Barang ===");
                    pemasok.tampilkanBarang();
                    break;

                case 2:
                    // Input transaksi
                    System.out.println("\n=== Input Transaksi ===");
                    System.out.println("=========================");
                    System.out.println("Pilih Kategori Jumlah");
                    System.out.println("=========================");
                    System.out.println("A. (1-100)");
                    System.out.println("B. (101-150)");
                    System.out.println("C. (>150)");
                    System.out.println();
                    System.out.print("Jumlah Barang yang dikirim: ");
                    int jumlahBarang = input.nextInt();
                    System.out.print("Harga Barang: ");
                    double hargaBarang = input.nextDouble();
        
                    transaksi.dataTransaksi(hargaBarang, jumlahBarang);

                    // Menampilkan hasil transaksi
                    System.out.println("\n*----- Total Pembayaran Pemilik -----*");
                    System.out.printf("Total Harga: Rp.%,.2f%n", transaksi.totalHarga());
                    System.out.println("Kategori Jumlah Barang " + transaksi.kategoriBarang());
                    System.out.printf("Total Bayar: Rp.%,.2f%n", transaksi.totalPembayaran());

                    // Menampilkan informasi pemasok dan barang
                    System.out.println("\nNama Pemasok: " + namaPemasok);
                    System.out.println("Nama Barang: " + namaBarang);
                    System.out.println("\nTerima kasih sudah memasok keperluan material di Tb. ABADI JAYA");
                    break;

                case 3:
                    // Keluar dari program
                    running = false;
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        input.close(); // Menutup scanner setelah program selesai
    }