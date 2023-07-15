import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader {
    public static void main(String[] args) {
        BufferedReader datainput = new BufferedReader (new InputStreamReader(System.in));
        
        String nama = " ";
        System.out.print("Masukkan Nama Anda : ");

        try {
            nama = datainput.readLine();
        } catch (Exception e) {
        System.out.println("Terjadi kesalahan pada inputan!");
        }
        System.out.println("Nama Anda Adalah : " + nama);
    }
}