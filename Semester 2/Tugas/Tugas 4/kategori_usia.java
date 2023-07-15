/*Nama  : Hanif Fathurahman
 * NPM   : 202243501199
 * Kelas : R2E
 */

import java.util.Scanner;
public class kategori_usia {
	public static void main(String[] args) {
		int usia;
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Usia Anda : ");
		usia = input.nextInt();
		if (usia >= 1 && usia <= 16) {
			System.out.println("Kategori Usia Anda adalah Anak-anak");
		} else if (usia >= 17 && usia < 25) {
			System.out.println("Kategori Usia Anda adalah Remaja");
		} else if (usia >= 25) {
			System.out.println("Kategori Usia Anda adalah Dewasa");
		}
	}
}