import java.util.Scanner;
public class pembagian_angka_4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("Input sebuah angka : ");
        angka = input.nextInt();
        if (angka % 4 == 0 && angka % 5 == 0) {
            System.out.println(+angka+ " dapat dibagi angka 4 dan 5");
        } else if (angka % 4 == 0) {
            System.out.println(+angka+ " dapat dibagi oleh salah satu dari angka 4 dan 5, tetapi tidak oleh keduanya");
        } else if (angka % 5 == 0) {
            System.out.println(+angka+ " dapat dibagi oleh salah satu dari angka 4 dan 5, tetapi tidak oleh keduanya");
        } else {
            System.out.println(+angka+ " tidak dapat dibagi oleh angka 4 atau 5");
        }
    }
}