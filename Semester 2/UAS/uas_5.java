import java.util.Scanner;

public class uas_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Input bilangan ke-" + (i + 1) + " : ");
            data[i] = input.nextInt();
        }
        System.out.println("====================================");
        System.out.print("Data yang diinput adalah : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
