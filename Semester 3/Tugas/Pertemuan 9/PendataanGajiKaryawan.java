import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class PendataanGajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("Input Data Karyawan");
        System.out.println("-------------------");
        System.out.print("NIK: ");
        String nik = input.nextLine();
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Jabatan (Direktur/Manajer/Supervisor/Staff): ");
        String jabatan = input.nextLine();

        double gajiPokok = 0;
        double tunjangan = 0;
        double pajak = 0;

        if (jabatan.equalsIgnoreCase("Direktur")) {
            gajiPokok = 20000000;
            tunjangan = 1000000;
            pajak = 0.05;
        } else if (jabatan.equalsIgnoreCase("Manajer")) {
            gajiPokok = 15000000;
            tunjangan = 750000;
            pajak = 0.05;
        } else if (jabatan.equalsIgnoreCase("Supervisor")) {
            gajiPokok = 8000000;
            tunjangan = 500000;
            pajak = 0.02;
        } else if (jabatan.equalsIgnoreCase("Staff")) {
            gajiPokok = 5000000;
            tunjangan = 500000;
            pajak = 0;
        } else {
            System.out.println("Jabatan yang dimasukkan tidak valid.");
            return;
        }

        double potongan = gajiPokok * pajak;
        double totalGaji = gajiPokok + tunjangan - potongan;

        System.out.println("-----------------------------------------------");
        System.out.println("NIK                  : " + nik);
        System.out.println("Nama                : " + nama);
        System.out.println("Jabatan             : " + jabatan);
        System.out.println("Gaji Pokok          : " + currencyFormat.format(gajiPokok));
        System.out.println("Tunjangan           : " + currencyFormat.format(tunjangan));
        System.out.println("Potongan            : " + currencyFormat.format(potongan));
        System.out.println("-----------------------------------------------");
        System.out.println("Total Gaji          : " + currencyFormat.format(totalGaji));
        System.out.println("-----------------------------------------------");
    }
}