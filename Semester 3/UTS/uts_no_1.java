import java.util.Scanner;

public class uts_no_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalNasabah;
        System.out.print("Jumlah Nasabah: ");
        totalNasabah = input.nextInt();
        input.nextLine(); // Membaca karakter newline setelah angka
        System.out.println("===========================================================================");

        int[][] data = new int[totalNasabah][2];
        String[] names = new String[totalNasabah];

        for (int i = 0; i < totalNasabah; i++) {
            System.out.print("No Rekening: ");
            data[i][0] = input.nextInt();
            input.nextLine(); // Membaca karakter newline setelah angka
            System.out.print("Nama Nasabah: ");
            names[i] = input.nextLine(); 
            System.out.print("Saldo Awal: ");
            data[i][1] = input.nextInt();
            System.out.println();
        }

        input.close();

        System.out.println("===========================================================================");

        for (int i = 0; i < totalNasabah; i++) {
            int noRekening = data[i][0];
            int saldoAwal = data[i][1];
            String namaNasabah = names[i];

            double bunga = 0;
            if (saldoAwal >= 5000000) {
                bunga = 0.05 * saldoAwal;
            } else if (saldoAwal >= 3000000) {
                bunga = 0.03 * saldoAwal;
            } else if (saldoAwal >= 1000000) {
                bunga = 0.015 * saldoAwal;
            }

            int saldoAkhir = (int)(saldoAwal + bunga);

            System.out.println("No Rekening : " + noRekening);
            System.out.println("Nama Nasabah : " + namaNasabah);
            System.out.println("Saldo Awal : " + saldoAwal);
            System.out.println("===========================================================================");
        }

        System.out.println("                                BANK XYZ");
        System.out.println("===========================================================================");
        System.out.println("No Rekening\tNama Nasabah\tSaldo Awal\tBunga\t\tSaldo Akhir");

        for (int i = 0; i < totalNasabah; i++) {
            int noRekening = data[i][0];
            int saldoAwal = data[i][1];
            String namaNasabah = names[i];

            double bunga = 0;
            if (saldoAwal >= 5000000) {
                bunga = 0.05 * saldoAwal;
            } else if (saldoAwal >= 3000000) {
                bunga = 0.03 * saldoAwal;
            } else if (saldoAwal >= 1000000) {
                bunga = 0.015 * saldoAwal;
            }

            int saldoAkhir = (int)(saldoAwal + bunga);
            System.out.println(noRekening + "\t\t" + namaNasabah + "\t\t" + saldoAwal + "\t\t" + (int)bunga + "\t\t" + saldoAkhir);
        }
    }
}