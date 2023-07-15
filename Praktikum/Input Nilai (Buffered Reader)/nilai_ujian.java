import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nilai_ujian {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        int nilai;
        try {
            System.out.print("Masukan nama : ");
            nama = input.readLine();
            System.out.print("Masukan nilai : ");
            nilai = Integer.parseInt(input.readLine());
            if (nilai >= 80) {
                System.out.println("Nama anda : " +nama+ ", Nilai anda : " +nilai+ ", predikat A");
            } else if (nilai >=70) {
                System.out.println("Nama anda : " +nama+ ", Nilai anda : " +nilai+ ", predikat B");
            } else if (nilai >= 60) {
                System.out.println("Nama anda : " +nama+ ", Nilai anda : " +nilai+ ", predikat C");
            } else if (nilai >= 50) {
                System.out.println("Nama anda : " +nama+ ", Nilai anda : " +nilai+ ", predikat D");
            } else {
                System.out.println("Nama anda : " +nama+ ", Nilai anda : " +nilai+ ", predikat E");
            }
        }
        catch(NumberFormatException e) {
            System.out.println("Error...!!!");
        }
    }
}