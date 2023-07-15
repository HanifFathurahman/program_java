import java.util.Scanner;

public class gaji_bulanan_pekerja {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int golongan, gaji = 0;

        System.out.print("Masukkan golongan anda = ");
        golongan = input.nextInt();
        switch (golongan) {
            case 1:
            gaji = 1500000;
            break;
            case 2:
            gaji = 2000000;
            break;
            case 3:
            gaji = 2500000;
            break;
            default:
            System.out.println("Input invalid!");
            break;
        }
        if (gaji != 0) {
            System.out.println("Gaji anda adalah " + gaji);
        }
        input.close();
    }
}
