import java.util.Scanner;
public class jumlah_menit {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int menit, tahun, hari;

        System.out.print("Input jumlah menit : ");
        menit = input.nextInt();
        tahun = menit / 525600;
        hari = menit / 1440;
        System.out.println(+tahun+ " tahun " +hari+ " hari");
    }
}
