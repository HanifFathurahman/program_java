import java.util.Scanner;

public class pilihan_hitungbentukbangundatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double v = 3.14;
        double hasil = 0;

        System.out.println("===== DAFTAR PILIHAN =====");
        System.out.println("1. Hitung Luas");
        System.out.println("2. Hitung Keliling");
        System.out.print("Silahkan Pilih : ");
        int pilih_1 = input.nextInt();

        if (pilih_1 == 1) {
            System.out.println("==========================");
            System.out.println("1. Luas Segitiga");
            System.out.println("2. Luas Persegi");
            System.out.println("3. Luas Persegi Panjang");
            System.out.println("4. Luas Lingkaran");
            System.out.println("5. Luas Jajar Genjang");
            System.out.println("6. Luas Trapesium");
            System.out.println("7. Luas Belah Ketupat");
            System.out.print("Silahkan Pilih : ");
            int pilih_luas = input.nextInt();
            System.out.println("==========================");
            switch (pilih_luas) {
                case 1:
                System.out.print("Masukkan alas : ");
                int alas_segitiga = input.nextInt();
                System.out.print("Masukkan tinggi : ");
                int tinggi_segitiga = input.nextInt();
                hasil = 0.5 * alas_segitiga * tinggi_segitiga;
                break;
    
                case 2:
                System.out.print("Masukkan sisi : ");
                int sisi_p = input.nextInt();
                hasil = sisi_p * sisi_p;
                break;
                
                case 3 : 
                System.out.print("Masukkan panjang : ");
                int p = input.nextInt();
                System.out.print("Masukkan lebar : ");
                int l = input.nextInt();
                hasil = p * l;
                break;

                case 4: 
                System.out.print("Masukkan jari-jari : ");
                int jari = input.nextInt();
                hasil = v * jari * jari;
                break;

                case 5: 
                System.out.print("Masukkan alas : ");
                int alas_jajargenjang= input.nextInt();
                System.out.print("Masukkan tinggi : ");
                int tinggi_jajargenjang = input.nextInt();
                hasil = alas_jajargenjang * tinggi_jajargenjang;
                break;

                case 6:
                System.out.print("Masukkan sisi sejajar : ");
                int sisi_trapesium = input.nextInt();
                System.out.print("Masukkan sisi sejajar : ");
                int sisi_trapesium_2 = input.nextInt();
                System.out.print("Masukkan tinggi : ");
                int tinggi_trapesium = input.nextInt();
                hasil = 0.5 * (sisi_trapesium + sisi_trapesium_2) * tinggi_trapesium;
                break;

                case 7:
                System.out.print("Masukkan diagonal : ");
                int diagonal_belahketupat = input.nextInt();
                System.out.print("Masukkan diagonal : ");
                int diagonal_belahketupat_2 = input.nextInt();
                hasil = 0.5 * (diagonal_belahketupat * diagonal_belahketupat_2);
                break;
                
                default:
                System.out.println("Input tidak tersedia!");
                break;
            } 

        } else if (pilih_1 == 2) {
            System.out.println("==========================");
            System.out.println("1. Keliling Segitiga");
            System.out.println("2. Keliling Persegi");
            System.out.println("3. Keliling Persegi Panjang");
            System.out.println("4. Keliling Lingkaran");
            System.out.println("5. Keliling Jajar Genjang");
            System.out.println("6. Keliling Trapesium");
            System.out.println("7. Keliling Belah Ketupat");
            System.out.print("Silahkan Pilih : ");
            int pilih_keliling = input.nextInt();
            System.out.println("==========================");
            switch (pilih_keliling) {
                case 1:
                System.out.print("Masukkan sisi : ");
                int sisi = input.nextInt();
                hasil = sisi* sisi * sisi;
                break;

                case 2: 
                System.out.print("Masukkan sisi : ");
                int sisi_p = input.nextInt();
                hasil = sisi_p* sisi_p * sisi_p * sisi_p;
                break;

                case 3:
                System.out.print("Masukkan panjang : ");
                int p = input.nextInt();
                System.out.print("Masukkan lebar : ");
                int l = input.nextInt();
                hasil =  2 * (p + l);
                break;

                case 4:
                System.out.print("Masukkan jari-jari : ");
                int jari = input.nextInt();
                hasil = 2 * v * jari;
                break;

                case 5:
                System.out.print("Masukkan alas : ");
                int alas_jajargenjang = input.nextInt();
                System.out.print("Masukkan sisi miring : ");
                int sisimiring_jajargenjang = input.nextInt();
                hasil = 2 * (alas_jajargenjang + sisimiring_jajargenjang);
                break;

                case 6:
                System.out.print("Masukkan panjang sisi : ");
                int sisi_trapesium = input.nextInt();
                System.out.print("Masukkan panjang sisi : ");
                int sisi_trapesium_2 = input.nextInt();
                System.out.print("Masukkan panjang sisi : ");
                int sisi_trapesium_3 = input.nextInt();
                System.out.print("Masukkan panjang sisi : ");
                int sisi_trapesium_4 = input.nextInt();
                hasil = sisi_trapesium + sisi_trapesium_2 + sisi_trapesium_3 + sisi_trapesium_4;
                break;  

                case 7:
                System.out.print("Masukkan sisi : ");
                int sisi_belahketupat_1 = input.nextInt();
                System.out.print("Masukkan sisi : ");
                int sisi_belahketupat_2 = input.nextInt();
                System.out.print("Masukkan sisi : ");
                int sisi_belahketupat_3 = input.nextInt();
                System.out.print("Masukkan sisi : ");
                int sisi_belahketupat_4 = input.nextInt();
                hasil = sisi_belahketupat_1 + sisi_belahketupat_2 + sisi_belahketupat_3 + sisi_belahketupat_4;

                default:
                System.out.println("Input tidak tersedia!");
                break;
            }
        } else {
            System.out.println("Input tidak tersedia!");
        }

        if (hasil != 0) {
            System.out.println("==========================");
            System.out.println("Hasilnya adalah : " + hasil);
            System.out.println("by : Hanif Fathurahman");
        }
            input.close();
    }
}