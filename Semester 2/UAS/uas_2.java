import java.util.Scanner;

public class uas_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input sebuah angka: ");
        int bilangan = input.nextInt();
        System.out.println("Angka yang dapat membagi " + bilangan + " tanpa sisa adalah: ");
        int pembagi = 1;
        do {
            if (bilangan % pembagi == 0) {
                System.out.print(pembagi + ", ");
            }
            pembagi++;
        } while (pembagi <= bilangan);
        System.out.println();
    }
}