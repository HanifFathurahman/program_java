/** Nama  : Hanif Fathurahman
 *  Npm   : 202243501199
 *  Kelas : R2E
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class luas_keliling_persegi_panjang {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukan panjang : ");
        int p = Integer.parseInt(input.readLine());
        System.out.print("Masukan Lebar : ");
        int l = Integer.parseInt(input.readLine());
        int luas = p * l;
        int keliling = 2 * (p + l);
        System.out.println("Luas Persegi Panjang : " + luas);
        System.out.println("Keliling Persegi Panjang : " + keliling);
    }
}