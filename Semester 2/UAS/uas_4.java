import java.util.Scanner;;

public class uas_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris = 0, kolom = 0;

        System.out.print("Input jumlah baris: ");
        baris = input.nextInt();
        System.out.print("Input jumlah kolom: ");
        kolom = input.nextInt();
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}