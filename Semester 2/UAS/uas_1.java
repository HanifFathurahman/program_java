import java.util.Scanner;

public class uas_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input sebuah angka: ");
        int bilangan = input.nextInt();
        System.out.println("Hasil bagi dan sisa bagi dengan angka 1 sampai 10:");
        for (int i = 1; i <= 10; i++) {
            int hasilBagi = bilangan / i;
            int sisaBagi = bilangan % i;
            System.out.println(bilangan + " : " + i + " = " + hasilBagi + " Sisa " + sisaBagi);
        }
    }
}
