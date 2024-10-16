import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class uts_no_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input digit terakhir NPM Anda : ");
        int digitTerakhirNPM = input.nextInt();
        input.nextLine(); // Membersihkan newline
        System.out.println("NPM genap mengisi 4 data");
        System.out.println("NPM ganjil mengisi 3 data");
        System.out.println("-----------------------------------");

        int jumlahData = (digitTerakhirNPM % 2 == 0) ? 4 : 3;

        // Daftar data pasien
        String[] idPasien = new String[jumlahData];
        String[] namaPasien = new String[jumlahData];
        int[] kodeKamar = new int[jumlahData];
        int[] lamaInap = new int[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("\nID Pasien: ");
            idPasien[i] = input.nextLine();
            System.out.print("Nama Pasien: ");
            namaPasien[i] = input.nextLine();
            System.out.print("Kode Kamar: ");
            kodeKamar[i] = input.nextInt();
            input.nextLine(); // Membersihkan newline
            System.out.print("Lama Inap: ");
            lamaInap[i] = input.nextInt();
            input.nextLine(); // Membersihkan newline
        }

        // Menulis data ke file
        try {
            FileWriter fileWriter = new FileWriter("pasien_data.txt");
            for (int i = 0; i < jumlahData; i++) {
                String dataPasien = idPasien[i] + "_" + kodeKamar[i] + "_" + String.format("%02d", lamaInap[i]) + "_" + namaPasien[i];
                fileWriter.write(dataPasien + "\n");
            }
            fileWriter.close();
            System.out.println("-----------------------------------");
            System.out.println("Selesai Menulis ke File");
        } catch (IOException e) {
            e.printStackTrace();
        }

        input.close();
    }
}