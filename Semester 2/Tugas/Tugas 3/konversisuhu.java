import java.util.Scanner;
public class konversisuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float c, f;

        System.out.println("Nama  : Hanif Fathurahman");
        System.out.println("NPM   : 202243501199");
        System.out.println("Kelas : R2E");
        System.out.println("=========================");
        
        System.out.print("Suhu dalam derajat celcius = ");
        c = input.nextInt();
        f = (c * 9)/5 + 32;
        System.out.println("Maka,suhu dalam derajat fahreinheit = " + f);
    }
}