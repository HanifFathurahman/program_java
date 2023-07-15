import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class biaya_hotel {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String jenis_kamar;
        int lama_menginap, tarif = 0;

        System.out.print("Jenis kelas kamar : ");
        jenis_kamar =  input.readLine();
        System.out.print("Lama menginap (dalam hari) : ");
        lama_menginap = Integer.parseInt(input.readLine());
        if (jenis_kamar.equals("standard")) {
            if (lama_menginap <= 2) {
                tarif = 400000 * lama_menginap;
            } else if (lama_menginap > 2) {
                tarif = 350000 * lama_menginap;
            }
        } else if (jenis_kamar.equals("eksekutif")) {
            if (lama_menginap <= 2) {
                tarif = 1200000 * lama_menginap;
            } else if (lama_menginap > 2) {
                tarif = 1000000 * lama_menginap;
            }
        }
        System.out.println("Jenis Kelas Kamar : " + jenis_kamar);
	    System.out.println("Lama Menginap (dalam hari) : " + lama_menginap);
	    System.out.println("Tarif yang harus dibayarkan adalah Rp " + tarif);
    }
}
