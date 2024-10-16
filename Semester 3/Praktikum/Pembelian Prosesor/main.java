import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        int harga = 0;
        int jumlah_pesanan = 0;
        int total_harga = 0;
        // Pilihan awal
        System.out.println("1. Intel");
        System.out.println("2. AMD");
        System.out.print("Silahkan pilih merk prosesor: ");
        int pilih_prosesor = input.nextInt();
        if (pilih_prosesor == 1) { // Intel
            System.out.println("1. i5-12600H    Rp 4188000");
            System.out.println("2. i7-12800H    Rp 7325000");
            System.out.println("3. i9-12900HK   Rp 8398000");
            System.out.print("Silahkan pilih series intel: ");
            int intel = input.nextInt();
            switch (intel) { //Menentukan harga prosesor intel
                case 1:
                    harga = 4188000;
                    break;
                case 2:
                    harga = 7325000;
                    break;
                case 3:
                    harga = 8398000;
                    break;
                default:
                    System.out.println("'Gagal' Hanya input 1-3 saja");
                    break;
            }
            System.out.print("Jumlah pesanan: "); //Menambah jumlah pesanan
            jumlah_pesanan = input.nextInt();
            total_harga = harga * jumlah_pesanan; //Menghitung jumlah pesanan

        } else if (pilih_prosesor == 2) { // AMD
            System.out.println("1. AMD Ryzen 7 PRO 1700X    Rp 5150000");
            System.out.println("2. AMD Ryzen 5 PRO 1600     Rp 3364000");
            System.out.println("3. AMD Ryzen 3 PRO 1300     Rp 1045460");
            System.out.print("Silakan pilih series AMD: ");
            int amd = input.nextInt();
            switch (amd) { //Menentukan harga prosesor AMD
                case 1:
                    harga = 5150000;
                    break;
                case 2:
                    harga = 3364000;
                    break;
                case 3:
                    harga = 1045460;
                    break;
                default:
                    System.out.println("'Gagal' Hanya input 1-3 saja");
                    break;
            }
            System.out.print("Jumlah pesanan: "); //Menambah jumlah pesanan
            jumlah_pesanan = input.nextInt();
            total_harga = harga * jumlah_pesanan; //Menghitung jumlah pesanan

        } else {
            System.out.println("'Gagal' Hanya input 1 atau 2 saja");
        }
        System.out.println("Harga: Rp "+total_harga); //Total keseluruhan harga
    }
}