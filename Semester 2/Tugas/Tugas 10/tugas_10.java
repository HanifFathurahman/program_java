/* Nama  : Hanif Fathurahman
 * NPM   : 202243501199
 * Kelas : R2E
 */

import java.util.Scanner;

public class tugas_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] bilangan = new int[10];
        int jumlah = 0;
        double rata = 0;

        for (int i = 0; i <= bilangan.length; i++) {
            System.out.print("Masukkan angka : ");
            bilangan[i] = input.nextInt();
            jumlah += bilangan[i];
        }

        rata = jumlah / bilangan.length;

        System.out.println("Jumlah seluruh bilangan : " + jumlah);
        System.out.println("Nilai rata-ratanya adalah : " + rata);
    }
}