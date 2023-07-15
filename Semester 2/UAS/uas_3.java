import java.util.Scanner;

public class uas_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input batasan angka: ");
        int angka = input.nextInt();
        int jumlahGanjil = 0;
        int jumlahGenap = 0;
        System.out.print("Angka-angka yang merupakan kelipatan 3 atau 5 yang kurang dari " + angka + " adalah: ");
        for (int i = 1; i < angka; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");

                if (i % 2 == 0) {
                    jumlahGenap++;
                } else {
                    jumlahGanjil++;
                }
            }
        }
        System.out.println();
        System.out.println("Jumlah angka ganjil: " + jumlahGanjil + " angka");
        System.out.println("Jumlah angka genap: " + jumlahGenap + " angka");
    }
}