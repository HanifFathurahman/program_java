import java.util.Scanner;
public class hitung_jumlah_bil_genap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil_awal, bil_akhir;
        int jumlah = 0;

        System.out.print("Dimulai Dari Bilangan Berapa : ");
        bil_awal = input.nextInt();
        System.out.print("Sampai Bilangan Berapa : ");
        bil_akhir = input.nextInt();
        do {
            if (bil_awal % 2 == 0)
                jumlah = jumlah + bil_awal;
            bil_awal++;
        } while (bil_awal <= bil_akhir);
        System.out.println("Hasil Penjumlahan Bilangan Genap dari " + bil_awal + " sampai " + bil_akhir + " Adalah : "  + jumlah);
    }
}