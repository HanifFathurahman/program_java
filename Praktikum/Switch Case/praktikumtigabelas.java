import java.util.Scanner;

import javax.swing.text.Style;

public class praktikumtigabelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai indeks huruf (A, B, C, D) = ");
        String indeskhuruf = input.nextLine();
        char indeks = indeskhuruf.charAt(0);
        switch (indeks) {
                case 'A': 
                System.out.println("Nilai anda sangat baik");
                break;
                case 'B':
                System.out.println("Nilai anda baik");
                break;
                case 'C':
                System.out.println("Niai anda cukup");
                break;
                case 'D':
                System.out.println("Nilai anda kurang");
                break;
                case 'E':
                System.out.println("Nilai anda sangat kurang");
                break;
                default:
                System.out.println("Salah memasukkan indeks huruf");
        }
    }    
}
