import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class biodata {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        int umur;

        System.out.print("Masukan nama anda : ");
        nama = input.readLine();
        System.out.print("Masukan umur anda : ");
        try {
            umur = Integer.parseInt(input.readLine());
            if (umur >=5 && umur <= 10) {
                System.out.println("" +nama+ ", umur anda termasuk kategori Anak-anak");
            } else if (umur >=11 && umur <= 17) {
                System.out.println("" +nama+ ", umur anda termasuk kategori Remaja");
            } else if (umur >=18 && umur <= 25) {
                System.out.println("" +nama+ ", umur anda termasuk kategori Dewasa");
            } else if (umur >=25) {
                System.out.println("" +nama+ ", umur anda termasuk kategori Orang Tua"); 
            }
        } catch(Exception e) {
            System.out.println("Error...!!!");
        }
    }
}