import java.util.Scanner;

public class gajelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        char ulang = 'y';

        System.out.println("====================");
        System.out.println("1. Bakso");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Mie Ayam + Bakso");
        System.out.println("====================");

        do {
            System.out.print("Silahkan input 1 - 3 : ");
            int pertanyaan = input.nextInt();
            switch (pertanyaan) {
                case 1:
                    System.out.println("Bakso : Rp 10.000");
                    ulang = 't';
                    break;

                case 2:
                    System.out.println("Mie Ayam : Rp 12.000");
                    ulang = 't';
                    break;

                case 3:
                    System.out.println("Mie Ayam + Bakso : Rp 15.000");
                    ulang = 't';
                    break;

                default:
                    System.out.println("Silahkan input 1 - 3 : ");
            }
        } while (ulang != 't');
        System.out.println("Terima kasih");
    }
}