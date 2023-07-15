import java.util.Scanner;
public class data_pegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Pegawai : "); String nama_pegawai = input.nextLine();
        System.out.print("Gaji Pokok : "); int gaji_pokok = input.nextInt();
        System.out.print("Jumlah Lembur : "); int jumlah_lembur = input.nextInt();
        int lembur = 300000* jumlah_lembur;
        int total_pendapatan = gaji_pokok + lembur;

        System.out.println("Total Pendapatan = Gaji Pokok Rp. " +gaji_pokok+ " + Jumlah Lembur " +jumlah_lembur+ " hari Rp. " +lembur+ "  = Rp. " +total_pendapatan);
    }
}