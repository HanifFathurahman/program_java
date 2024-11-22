import java.util.Scanner;
class Pegawai {
    String nama;
    String jabatan;
    double gajiPokok;
    double tunjangan;
    
    public Pegawai(String nama, String jabatan, double gajiPokok, double tunjangan) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }
    
    public double hitungTotalGaji() {
        return gajiPokok + tunjangan;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Tunjangan: Rp" + tunjangan);
        System.out.println("Total Gaji: Rp" + hitungTotalGaji());
    }
}

public class Penggajian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama pegawai: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan jabatan pegawai: ");
        String jabatan = scanner.nextLine();
        
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = scanner.nextDouble();
        
        System.out.print("Masukkan tunjangan: ");
        double tunjangan = scanner.nextDouble();
        
        Pegawai pegawai = new Pegawai(nama, jabatan, gajiPokok, tunjangan);
        
        System.out.println("\n--- Informasi Penggajian Pegawai ---");
        pegawai.tampilkanInfo();
        scanner.close();
    }
}