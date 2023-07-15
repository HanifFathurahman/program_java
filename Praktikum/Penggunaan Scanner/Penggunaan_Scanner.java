import java.util.Scanner;
public class Penggunaan_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.println("Nama anda adalah = " + nama);
        
    }
}