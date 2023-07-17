import java.util.Scanner;

public class BelajarFunction_2 {
    String nama, kelas, npm;

    public void biodata() {
        System.out.println("Nama : " + nama);
        System.out.println("NPM : " + npm);
        System.out.println("Kelas : " + kelas);
    }

    public static int perkalian(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, hasil;
        
        BelajarFunction_2 siswa = new BelajarFunction_2(); 
        siswa.nama = "Hanif";
        siswa.npm = "202243501199";
        siswa.kelas = "R2E";
        siswa.biodata();
        System.out.println();

        System.out.print("Masukan angka pertama : ");
        a = input.nextInt();
        System.out.print("Masukan angka kedua : ");
        b = input.nextInt();
        
        hasil = perkalian(a, b);
        System.out.println("Hasil : " + hasil);



        
    }
}
