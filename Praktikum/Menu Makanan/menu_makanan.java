import java.util.Scanner;
public class menu_makanan {
    public static void menu_minuman() {
        System.out.println("========= Menu Minuman =========");
        System.out.println("1. Es Teh              Rp 10.000");
        System.out.println("2. Es Jeruk            Rp 15.000");
        System.out.println("3. Es Coffe GoodDay    Rp 18.000");
        System.out.println("================================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, pesan, jumlah_makanan, pilih_minuman, jumlah_minuman, biaya_minuman, total_biaya;
        System.out.println("========= Menu Makanan =========");
        System.out.println("1. Bakso               Rp 10.000");
        System.out.println("2. Mie Ayam            Rp 15.000");
        System.out.println("3. Mie Ayam + Bakso    Rp 18.000");
        System.out.println("================================");
        System.out.print("Silahkan Pilih : ");
        int pilih = input.nextInt();   
        switch (pilih) {
            case 1:
                System.out.print("Masukan Jumlah : ");
                jumlah_makanan = input.nextInt();
                harga = 10000 * jumlah_makanan;
                System.out.println("Biaya Makanan : " + harga);
                System.out.println("Pesan Minum? : ");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Silahkan Pilih : ");
                pesan = input.nextInt();
                if (pesan == 1) {
                    menu_minuman(); 
                    System.out.print("Silahkan Pilih : ");
                    pilih_minuman = input.nextInt();
                    switch (pilih_minuman) {
                        case 1:
                            System.out.print("Masukan Jumlah : ");
                            jumlah_minuman = input.nextInt();
                            biaya_minuman = 10000 * jumlah_minuman;
                            total_biaya = biaya_minuman + harga;
                            System.out.println();
                            System.out.println("          Rincian Biaya         ");
                            System.out.println("--------------------------------");
                            System.out.println("Makanan       :     Rp " + harga);
                            System.out.println("Minuman       :     Rp " + biaya_minuman);
                            System.out.println("--------------------------------");
                            System.out.println("Total Biaya   :     Rp " + total_biaya);
                        break;
                        case 2:  
                            System.out.print("Masukan Jumlah : ");
                            jumlah_minuman = input.nextInt();
                            biaya_minuman = 15000 * jumlah_minuman;
                            total_biaya = biaya_minuman + harga;
                            System.out.println();
                            System.out.println("          Rincian Biaya         ");
                            System.out.println("--------------------------------");
                            System.out.println("Makanan       :     Rp " + harga);
                            System.out.println("Minuman       :     Rp " + biaya_minuman);
                            System.out.println("--------------------------------");
                            System.out.println("Total Biaya   :     Rp " + total_biaya);
                        break;
                        case 3:
                            System.out.print("Masukan Jumlah : ");
                            jumlah_minuman = input.nextInt();
                            biaya_minuman = 18000 * jumlah_minuman;
                            total_biaya = biaya_minuman + harga;
                            System.out.println();
                            System.out.println("          Rincian Biaya         ");
                            System.out.println("--------------------------------");
                            System.out.println("Makanan       :     Rp " + harga);
                            System.out.println("Minuman       :     Rp " + biaya_minuman);
                            System.out.println("--------------------------------");
                            System.out.println("Total Biaya   :     Rp " + total_biaya);
                        break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia");
                    }
                } else if (pesan == 2) {
                    System.out.println("Total Biaya : Rp " + harga);
                } else {
                    System.out.println("Pilihan Tidak Tersedia");
                }
            break;
            case 2:
                System.out.print("Masukan Jumlah : ");
                jumlah_makanan = input.nextInt();
                harga = 15000 * jumlah_makanan;
                System.out.println("Biaya Makanan : " + harga);
                System.out.println("Pesan Minum? : ");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Silahkan Pilih : ");
                pesan = input.nextInt();
                if (pesan == 1) {
                    menu_minuman(); 
                    System.out.print("Silahkan Pilih : ");
                    pilih_minuman = input.nextInt();
                    switch (pilih_minuman) {
                        case 1:
                            System.out.print("Masukan Jumlah : ");
                            jumlah_minuman = input.nextInt();
                            biaya_minuman = 10000 * jumlah_minuman;
                            total_biaya = biaya_minuman + harga;
                            System.out.println();
                            System.out.println("          Rincian Biaya         ");
                            System.out.println("--------------------------------");
                            System.out.println("Makanan       :     Rp " + harga);
                            System.out.println("Minuman       :     Rp " + biaya_minuman);
                            System.out.println("--------------------------------");
                            System.out.println("Total Biaya   :     Rp " + total_biaya);
                        break;
                        case 2:  
                            System.out.print("Masukan Jumlah : ");
                            jumlah_minuman = input.nextInt();
                            biaya_minuman = 15000 * jumlah_minuman;
                            total_biaya = biaya_minuman + harga;
                            System.out.println();
                            System.out.println("          Rincian Biaya         ");
                            System.out.println("--------------------------------");
                            System.out.println("Makanan       :     Rp " + harga);
                            System.out.println("Minuman       :     Rp " + biaya_minuman);
                            System.out.println("--------------------------------");
                            System.out.println("Total Biaya   :     Rp " + total_biaya);
                        break;
                        case 3:
                            System.out.print("Masukan Jumlah : ");
                            jumlah_minuman = input.nextInt();
                            biaya_minuman = 18000 * jumlah_minuman;
                            total_biaya = biaya_minuman + harga;
                            System.out.println();
                            System.out.println("          Rincian Biaya         ");
                            System.out.println("--------------------------------");
                            System.out.println("Makanan       :     Rp " + harga);
                            System.out.println("Minuman       :     Rp " + biaya_minuman);
                            System.out.println("--------------------------------");
                            System.out.println("Total Biaya   :     Rp " + total_biaya);
                        break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia");
                    }
                } else if (pesan == 2) {
                    System.out.println("Total Biaya : Rp " + harga);
                } else {
                    System.out.println("Pilihan Tidak Tersedia");
                }
            break;
            case 3:
                System.out.print("Masukan Jumlah : ");
                jumlah_makanan = input.nextInt();
                harga = 18000 * jumlah_makanan;
                System.out.println("Biaya Makanan : " + harga);
                System.out.println("Pesan Minum? : ");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Silahkan Pilih : ");
                pesan = input.nextInt();
                if (pesan == 1) {
                    menu_minuman(); 
                    System.out.print("Silahkan Pilih : ");
                    pilih_minuman = input.nextInt();
                    switch (pilih_minuman) {
                        case 1:
                            System.out.print("Masukan Jumlah : ");
                            jumlah_minuman = input.nextInt();
                            biaya_minuman = 10000 * jumlah_minuman;
                            total_biaya = biaya_minuman + harga;
                            System.out.println();
                            System.out.println("          Rincian Biaya         ");
                            System.out.println("--------------------------------");
                            System.out.println("Makanan       :     Rp " + harga);
                            System.out.println("Minuman       :     Rp " + biaya_minuman);
                            System.out.println("--------------------------------");
                            System.out.println("Total Biaya   :     Rp " + total_biaya);
                        break;
                        case 2:  
                            System.out.print("Masukan Jumlah : ");
                            jumlah_minuman = input.nextInt();
                            biaya_minuman = 15000 * jumlah_minuman;
                            total_biaya = biaya_minuman + harga;
                            System.out.println();
                            System.out.println("          Rincian Biaya         ");
                            System.out.println("--------------------------------");
                            System.out.println("Makanan       :     Rp " + harga);
                            System.out.println("Minuman       :     Rp " + biaya_minuman);
                            System.out.println("--------------------------------");
                            System.out.println("Total Biaya   :     Rp " + total_biaya);
                        break;
                        case 3:
                            System.out.print("Masukan Jumlah : ");
                            jumlah_minuman = input.nextInt();
                            biaya_minuman = 18000 * jumlah_minuman;
                            total_biaya = biaya_minuman + harga;
                            System.out.println();
                            System.out.println("          Rincian Biaya         ");
                            System.out.println("--------------------------------");
                            System.out.println("Makanan       :     Rp " + harga);
                            System.out.println("Minuman       :     Rp " + biaya_minuman);
                            System.out.println("--------------------------------");
                            System.out.println("Total Biaya   :     Rp " + total_biaya);
                        break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia");
                    }
                } else if (pesan == 2) {
                    System.out.println("Total Biaya : Rp " + harga);
                } else {
                    System.out.println("Pilihan Tidak Tersedia");
                }
            break;
            default:
                System.out.println("Pilihan Tidak Tersedia");
        }
    }
}