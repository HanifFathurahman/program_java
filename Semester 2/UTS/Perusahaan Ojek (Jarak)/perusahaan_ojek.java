import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class perusahaan_ojek {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        int jarak, diskon = 0, tarif = 0;

        System.out.print("Nama Customer : ");
        nama = input.readLine();
        System.out.print("Jarak yg akan ditempuh (KM) : ");
        jarak = Integer.parseInt(input.readLine());
        if (jarak <= 4) {
            tarif = 9500;
        } else if (jarak > 4) {
            tarif = 9500 + (2500 * (jarak - 4));
            if (jarak > 10 && jarak <=15) {
                diskon = 2000;
                tarif = tarif - diskon;
            } else if (jarak > 15) {
                diskon = 5000;
                tarif = tarif - diskon;
            }
        }
        System.out.println("Selamat, anda mendapatkan potongan Rp " + diskon);
        System.out.println("Tarif yang harus dibayarkan " + nama + " adalah sebesar : " + tarif);
    }
}