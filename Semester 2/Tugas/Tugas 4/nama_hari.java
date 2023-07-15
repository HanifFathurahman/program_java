/*Nama  : Hanif Fathurahman
 * NPM   : 202243501199
 * Kelas : R2E
 */

import java.util.Scanner;
public class nama_hari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hari ;
        String namahari;

        System.out.print("Masukan angka : ");
        hari = input.nextInt();
        if (hari == 1) {
            namahari = "Senin";
        } else if (hari == 2) {
            namahari = "Selasa";
        } else if (hari == 3) {
            namahari = "Rabu";
        } else if (hari == 4) {
            namahari = "Kamis";
        } else if (hari == 5) {
            namahari = "Jum'at";
        } else if (hari == 6) {
            namahari = "Sabtu";
        } else if (hari == 7) {
            namahari = "Minggu" ;
        } else {
            namahari = "Erorr!, silahkan input range angka 1-7";
        }

        System.out.println("Nama Hari = " + namahari);  
    }
}
