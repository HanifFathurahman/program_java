import java.util.Scanner;
public class if_tunggal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Suatu Angka : ");
        int angka = input.nextInt();
        if (angka % 2 == 0)
            System.out.println("Kelipatan Dua");
        
        if (angka % 5 == 0) {
            System.out.println("Kelipatan Lima");
            System.out.println("Statement Lain");
        }
        System.out.println("Terima Kasih");
    }
}