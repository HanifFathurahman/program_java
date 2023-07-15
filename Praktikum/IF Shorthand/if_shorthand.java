import java.util.Scanner;
public class if_shorthand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai angka : ");
        int angka = input.nextInt();
        String hasil = (angka > 65) ? "Selamat, anda lulus." : "Maaf, anda gagal. Silahkan coba lagi";

        System.out.println("Hasil ujian anda adalah : " + hasil);
    }
}
