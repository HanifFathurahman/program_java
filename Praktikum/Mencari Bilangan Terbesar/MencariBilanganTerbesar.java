import java.util.Scanner;

public class MencariBilanganTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        int terbesar = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Bilangan ke - " + i +" = ");
            bilangan = input.nextInt();

            if (bilangan > terbesar) {
                bilangan = terbesar;
            }
        }
        System.out.println("Bilangan terbesar adalah = " + terbesar);

    }
}