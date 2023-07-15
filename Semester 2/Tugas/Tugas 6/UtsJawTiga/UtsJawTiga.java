import java.util.*;

public class UtsJawTiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int hrgSewa = 350000;
        final double fktrDenda = 0.3;
        
        System.out.println("Masukkan jumlah mobil yang dipinjam = ");
        int jmlMobil = input.nextInt();

        System.out.println("Masukan lama pinjam = ");
        int lmPinjam = input.nextInt();

        if (jmlMobil > 5){
            System.out.println("Mobil yang anda pinjam terlalu banyak...!");
        }

        if (jmlMobil <= 5 && lmPinjam <= 7) {
            int total = jmlMobil * lmPinjam * hrgSewa;
            System.out.println("Harga total yang harus anda bayar = " + total);       
        }

        if (jmlMobil <= 5 && lmPinjam > 7) {
            int total = jmlMobil * lmPinjam * hrgSewa;
            Double denda = fktrDenda * total;
            Double jumTotal = total + denda;
            System.out.println("Denda anda dalah = " + denda);
            System.out.printf("Harga plus denda anda adalah = %.2f", jumTotal);
        }
    }
}