import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SistemInformasiBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateFormat format_tanggal = new SimpleDateFormat("HH:mm:ss dd-MMMM-yyyy");
        Date tanggal = new Date();
        int pilih_studio, jumlah_tiket, no_tempat_duduk;
        String nama, judul_film, durasi, genre, sutradara, rate_usia, hari_menonton, jam_menonton, nama_studio;
        int harga = 0;

        //DAFTAR FILM
        System.out.println("===== Selamat Datang di MovieGans21 =====");
        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.println();

        System.out.println("Daftar Tayangan : ");
        System.out.println("1. Judul : Fast X (2023)");
        System.out.println("   Negara : United States");
        System.out.println("   Bintang Film : Jason Statham, Michelle Rodriguez, Vin Diesel");
        System.out.println("   Durasi : 2 jam 22 menit");
        System.out.println("   Sutradara : Louis Leterrier");
        System.out.println("   Diterbitkan : May 17, 2023");
        System.out.println("   Genre : Action");
        System.out.println("   Rate Usia :18+");
        System.out.println("   Harga : Rp 50.000");
        System.out.println();

        System.out.println("2. Judul : The Flash (2023)");
        System.out.println("   Negara : Australia, Canada, New Zealand, United States");
        System.out.println("   Bintang Film : Ben Affleck, Ezra Miller, Sasha Calle");
        System.out.println("   Durasi : 2 jam 24 menit");
        System.out.println("   Sutradara : Andy Muschietti");
        System.out.println("   Diterbitkan : June 13, 2023");
        System.out.println("   Genre : Action, Adventure, Fantasy");
        System.out.println("   Rate Usia :18+");
        System.out.println("   Harga : Rp 45.000");
        System.out.println();

        System.out.println("3. Judul : Evil Dead Rise (2023)");
        System.out.println("   Negara : Ireland, New Zealand, United States");
        System.out.println("   Bintang Film : Anna-Maree Thomas, Mirabai Pease, Richard Crouchley");
        System.out.println("   Durasi : 1 jam 36 menit");
        System.out.println("   Sutradara : Lee Cronin");
        System.out.println("   Diterbitkan : April 12, 2023");
        System.out.println("   Genre : Horror");
        System.out.println("   Rate Usia :15+");
        System.out.println("   Harga : Rp 40.000");
        System.out.println();

        //INPUT FILM YANG DI PILIH
        System.out.print("Silahkan Pilih No. Film : ");
        int no_film = input.nextInt();
        switch (no_film) {
            case 1:
                judul_film = "Fast X (2023)";
                durasi = "2 jam 22 menit";
                genre = "Action";
                sutradara = "Louis Leterrier";
                rate_usia = "18+";
                harga = 50000;
                break;
            case 2:
                judul_film = "The Flash (2023)";
                durasi = "2 jam 24 menit";
                genre = "Action, Adventure, Fantasy";
                sutradara = "Andy Muschietti";
                rate_usia = "18+";
                harga = 45000;
                break;
             case 3:
                judul_film = "Evil Dead Rise (2023)";
                durasi = "1 jam 36 menit";
                genre = "Horror";
                sutradara = "Lee Cronin";
                rate_usia = "18+";
                harga = 40000;
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                return;
        }

        //INPUT JADWAL MENONTON (TANGGAL)
        System.out.println("Jadwal Menonton");
        System.out.println("1. Senin, 18 November 2024      2. Rabu, 20 November 2024       3. Jum'at, 22 November 2024");
        System.out.print("Silahkan Pilih Hari : ");
        int pilih_hari = input.nextInt();
        switch (pilih_hari) {
            case 1:
                hari_menonton = "Senin, 26 Juni 2023 ";
                break;
            case 2:
                hari_menonton = "Rabu, 28 Juni 2023";
                break;
            case 3:
                hari_menonton = "Jum'at, 30 Juni 2023";
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                return;
        }

        //INPUT JADWAL MENONTON (JAM)
        System.out.println("1. 09.00    2. 01.00    3. 14.00    4. 19.00");
        System.out.print("Silahkan Pilih Jam : ");
        int pilih_jamMenonton = input.nextInt();
        switch (pilih_jamMenonton) {
            case 1:
                jam_menonton = "09.00";
                break;
            case 2:
                jam_menonton = "01.00";
                break;
            case 3:
                jam_menonton = "14.00";
                break;
            case 4:
                jam_menonton = "19.00";
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                return;
        }

        //INPUT STUDION YANG DI PILIH
        System.out.println("1. Studio 1    2. Studio 2    3. Studio 3");
        System.out.print("Silahkan Pilih Studio: ");
        pilih_studio = input.nextInt();
        switch (pilih_studio) {
            case 1:
                nama_studio = "Studio 1";
                break;
            case 2:
                nama_studio = "Studio 2";
                break;
            case 3:
                nama_studio = "Studio 3";
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                return;
        }

        //INPUT JUMLAH TIKET
        System.out.print("Masukkan Jumlah tiket : ");
        jumlah_tiket = input.nextInt();

        //INPUT TEMPAT DUDUK
        String tempat_duduk[] = new String[jumlah_tiket];
        for (int i = 0; i < jumlah_tiket; i++) {    
            System.out.println("Silahkan Pilih tempat duduk ke - " + (i + 1));
            System.out.println("1. A    2. B    3. C");
            System.out.print("Silahkan Pilih No. Tempat Duduk : ");
            no_tempat_duduk = input.nextInt();
            switch (no_tempat_duduk) {
                case 1:
                    tempat_duduk[i] = "A";
                    break;
                case 2:
                    tempat_duduk[i] = "B";
                    break;
                case 3:
                    tempat_duduk[i] = "C";
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    return;
            }
        }

        //INPUT NO. BANGKU
        int bangku[]  = new int[jumlah_tiket];
        for (int b = 0; b < jumlah_tiket; b ++) {
            System.out.print("Silahkan pilih No. Bangku (1 - 50) : ");
            bangku[b]= input.nextInt();
        }

        //HITUNG TOTAL HARGA
        int total_harga = harga * jumlah_tiket;
        System.out.println("Total Harga : " + total_harga);

        //INPUT PEMBAYARAN
        System.out.print("Bayar : ");
        int bayar = input.nextInt();
        if (bayar >= total_harga) {
            int kembalian = bayar - total_harga;
            System.out.println("Kembalian : " + kembalian);
            System.out.println();

            //CETAK TIKET (SELESAI)
            System.out.println(format_tanggal.format(tanggal));
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Nama                : " + nama);
            System.out.println("Nama Studio         : " + nama_studio);
            System.out.println("Jumlah Tiket        : " + jumlah_tiket);
            System.out.print("Tempat Duduk        : ");  
            for (int b = 0; b < jumlah_tiket; b ++) {
                for (int i = 0; i < jumlah_tiket; i++) {
                    System.out.print(tempat_duduk[i] + "" + bangku[b]);
                }
            }
            System.out.println();
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Judul Film          : " + judul_film);
            System.out.println("Durasi              : " + durasi);
            System.out.println("Genre               : " + genre);
            System.out.println("Sutradara           : " + sutradara);
            System.out.println("Rate Usia           : " + rate_usia);
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Studio              : " + nama_studio);
            System.out.println("Jadwal Menonton     : " + jam_menonton + " " + hari_menonton);
            System.out.println("Total Harga         : Rp. " + total_harga);
            System.out.println("Bayar               : Rp. " + bayar);
            System.out.println("Kembalian           : Rp. " + kembalian);
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Terima kasih telah melakukan pemesanan tiket di MovieGans21");
        } else {
            System.out.println("Maaf, Saldo Anda Tidak Sesuai Dengan Harga");
        }
        System.out.println();
    }
}