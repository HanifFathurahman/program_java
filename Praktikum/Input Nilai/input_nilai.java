import java.util.Scanner;
public class input_nilai {
    public static void main(String[] args) {
        int nilai;
        Scanner input = new Scanner(System.in);
        try {
        System.out.print("Masukan Nilai : ");
        nilai = input.nextInt();
        if (nilai > 80) {
                System.out.println("Anda Mendapat Nilai A");
                if (nilai == 100) {
                    System.out.println("Luar Biasa Nilai Sempuna 100");
                }
            } else if (nilai > 70) {
                System.out.println("Anda Mendapat Nilai B");
                if (nilai >= 79) {
                    System.out.println("Sedikit Lagi Dapat Nilai A");
                }
            } else if (nilai > 60) {
                System.out.println("Anda Mendapat Nilai C");
            } else if (nilai > 50) {
                System.out.println("Anda Mendapat Nilai D");
            } else if (nilai > 40) {
                System.out.println("Anda Mendapat Nilai E");
            }
     }
        catch(NumberFormatException e) {
            System.out.println("Input tidak sesuai");
        }
    }    
}
