import java.util.Scanner;
public class hitungsegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, t, luas;
        
        System.out.println("Nama  : Hanif Fathurahman");
        System.out.println("NPM   : 202243501199");
        System.out.println("Kelas : R2E");
        System.out.println("=========================");
        
        System.out.print("Masukan Tinggi Segitiga = ");
        t = input.nextInt();
        System.out.print("Masukan Panjang Alas Segitiga = ");
        a = input.nextInt();
        luas = 0.5 * a * t;
        
        System.out.println("Luas Segitiga = " + luas);
    }
}