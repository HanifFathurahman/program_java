import java.util.Scanner;

public class gaji_karyawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total_gaji = 0;

        System.out.print ("golongangan anda : "); 
        String golpegawai = input.nextLine();
             if (golpegawai.equals("A")) {
                System.out.print("Masukan jumlah hari kerja : ");
                int jmlhharikerja = input.nextInt();    
                total_gaji = 3000000 + (jmlhharikerja * 15000);
            } else if (golpegawai.equals("B")) {
                System.out.print("Masukan jumlah hari kerja : ");
                int jmlhharikerja = input.nextInt();    
                total_gaji = 2500000 + (jmlhharikerja * 10000);
            } else if (golpegawai.equals("C")) {
                System.out.print("Masukan jumlah hari kerja : ");
                int jmlhharikerja = input.nextInt();    
                total_gaji = 2000000 + (jmlhharikerja * 5000);
            } else {
                System.out.println("Input tidak tersedia!");
            }
        System.out.println("Total gaji per bulan: " + total_gaji);
    }
}