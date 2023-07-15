import java.util.Scanner;
public class hitungperegipanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, keliling, luas;
        
        System.out.println("Nama  : Hanif Fathurahman");
        System.out.println("NPM   : 202243501199");
        System.out.println("Kelas : R2E");
        System.out.println("=========================");
        
        System.out.print("Masukkan Panjang Persegi = ");
        p = input.nextInt();
        System.out.print("Masukkan Lebar Persegi   = ");
        l = input.nextInt();
        keliling = 2 * (p + l);
        luas = p * l;
        
        System.out.println("Luas Persgei Panjang = " + luas);
        System.out.println("Keliling Persgei Panjang = " + keliling);
    }
}