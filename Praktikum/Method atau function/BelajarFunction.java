import java.util.Scanner;

public class BelajarFunction {
    static int perkalian(int a, int b, int c) {   
        return a * b + c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, hasil;
        
        System.out.print("Masukan angka pertama : ");
        a = input.nextInt();
        System.out.print("Masukan angka kedua : ");
        b = input.nextInt();
        System.out.print("Masukan angka ketiga : ");
        c = input.nextInt();
        
        hasil = perkalian(a, b, c);
        
        System.out.println("Hasil : " + hasil);
    }
}