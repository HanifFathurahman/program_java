import java.util.Scanner;
public class volume_bola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pi = 3.14;
        float hasil, r;

        System.out.print("Input jari-jari bola : ");
        r = input.nextFloat();
        hasil = (float) (pi * r * r * r * 4/3);
        System.out.println("Volume bola adalah : " + hasil);
    }
}