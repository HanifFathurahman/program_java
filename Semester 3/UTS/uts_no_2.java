import java.util.Scanner;

public class uts_no_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input NPM Anda : ");
        long npm = input.nextLong();
        input.nextLine(); // Membersihkan newline

        System.out.print("Input Nama Anda : ");
        String nama = input.nextLine();

        System.out.print("Tinggi Badan (cm) : ");
        double tinggiCm = input.nextDouble();

        System.out.print("Berat Badan : ");
        double beratKg = input.nextDouble();

        // Mengkonversi tinggi dari cm ke meter
        double tinggiM = tinggiCm / 100.0;

        // Menghitung BMI
        double bmi = beratKg / (tinggiM * tinggiM);

        // Menentukan kategori BMI
        String status;
        if (bmi < 18.5) {
            status = "Kekurangan BB";
        } else if (bmi >= 18.5 && bmi <= 24.99) {
            status = "Ideal";
        } else if (bmi >= 25.0 && bmi <= 29.99) {
            status = "Kelebihan BB";
        } else {
            status = "Obesitas";
        }

        // Menampilkan hasil
        System.out.println("-------------------------------------");
        System.out.println("BMI : " + String.format("%.1f", bmi));
        System.out.println("Status : " + status);

        input.close();
    }
}
