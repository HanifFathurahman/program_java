/* Nama  : Hanif Fathurahman
 * NPM   : 202243501199
 * Kelas : R2E
 */

import java.util.Scanner;

public class soal_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Bilangan Prima pertama = ");
        int jumlah = input.nextInt();

        int angka = 2;
        int counter = 0;

        while (counter < jumlah) {
            boolean prima = true;

            for (int i = 2; i <= Math.sqrt(angka); i++) {
                if (angka % i == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(angka + " ");
                counter++;
            }

            angka++;
        }

        input.close();
    }
}