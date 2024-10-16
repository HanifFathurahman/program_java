    import java.text.DecimalFormat;
    import java.util.Scanner;

    public class pertemuan_2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // input nama calon karyawan
            System.out.print("Nama Calon Karyawan: ");
            String nama_karyawan = input.nextLine();

            // input jumlah mata ujian
            System.out.print("Jumlah Mata Ujian: ");
            int jml_ujian = input.nextInt();

            // array untuk menyimpan nilai ujian 
            int nilai_ujian[] = new int[jml_ujian];
                
            // input nilai ujian
            int i = 1;  
            while (i <= jml_ujian) {
                System.out.print("Nilai mata ujian ke - " +i+ ": ");
                nilai_ujian[i - 1] = input.nextInt();
                i++;
            }

            // menghitung nilai akhir 
            double totalNilai = 0;
            for (int j = 0; j < jml_ujian; j++) {
                totalNilai += nilai_ujian[j];
            }
            double nilaiAkhir = totalNilai / jml_ujian;

            // menentukan status kelulusan
            double batas_kelulusan = 70; 
            String status_kelulusan = (nilaiAkhir >= batas_kelulusan) ? "Lulus" : "Tidak Lulus";

            // format tampilan angka untuk nilai akhir dan nilai rata-rata
            DecimalFormat df = new DecimalFormat("#.##"); // menampilkan hingga dua desimal
            String format_nilai_akhir = df.format(nilaiAkhir);
            String format_nilai_rata = df.format(totalNilai / jml_ujian);

            // menampilkan hasil
            System.out.println();
            System.out.println("Nama Calon Karyawan: " + nama_karyawan);
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Rata-rata: " + (totalNilai / jml_ujian));
            System.out.println("Status Kelulusan: " + status_kelulusan);
        }
    }