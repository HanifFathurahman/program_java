/* Nama  : Hanif Fathurahman
 * NPM   : 202243501199
 * Kelas : R2E
 */

import java.util.Scanner;

public class Data_Nilai_Mahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] dataMahasiswa = new String[5][6];

        //input data mahasiswa
        for (int i = 0; i < 5; i++) {
            System.out.println("Data Mahasiswa ke - " + (i + 1));
            System.out.print("NPM : ");
            dataMahasiswa[i][0] = input.nextLine();
            System.out.print("Nama : ");
            dataMahasiswa[i][1] = input.nextLine();
            System.out.print("Nilai UTS : ");
            dataMahasiswa[i][2] = input.nextLine();
            System.out.print("Nilai UAS : ");
            dataMahasiswa[i][3] = input.nextLine();
            System.out.print("Nilai Praktikum : ");
            dataMahasiswa[i][4] = input.nextLine();

            //menghitung nilai akhir
            double nilaiUTS = Double.parseDouble(dataMahasiswa[i][2]);
            double nilaiUAS = Double.parseDouble(dataMahasiswa[i][3]);
            double nilaiPraktikum = Double.parseDouble(dataMahasiswa[i][4]);
            double nilaiAkhir = (0.3 * nilaiUTS) + (0.4 * nilaiUAS) + (0.3 * nilaiPraktikum);
            dataMahasiswa[i][5] = String.valueOf(nilaiAkhir);
            System.out.println();
        }

        //mencetak dalam bentuk tabel
        System.out.println("+---------------+-------+-------+---------------+---------------+");
        System.out.println("|  Nama\t       |  UTS\t|  UAS\t|  Praktikum\t|  NILAI AKHIR  |");
        System.out.println("+---------------+-------+-------+---------------+---------------+");
        for (int baris = 0; baris < 5; baris++) {
           System.out.printf("| %6s\t| %5s\t| %5s\t| %10s\t| %13s |\n",
                    dataMahasiswa[baris][1],
                    dataMahasiswa[baris][2],
                    dataMahasiswa[baris][3],
                    dataMahasiswa[baris][4],
                    dataMahasiswa[baris][5]);
        }
        System.out.println("+---------------+-------+-------+---------------+---------------+");
    }
}
