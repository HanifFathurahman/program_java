import java.util.Scanner;
public class tebak_tebakan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hello Selamat Datang Di Program Sederhana");
		System.out.println("=========================================");
		System.out.println();

		System.out.println("Berapa hasil 4 x 4?");
		System.out.println("A. 8 ");
		System.out.println("B. 16");
		System.out.print("Jawaban : ");
		String hasil = input.nextLine();
		if (hasil.equals("a") || hasil.equals("A")) {
			System.out.println("Jawaban Salah");
		} else if (hasil.equals("b") || hasil.equals("B")) {
			System.out.println("Jawaban Benar");
		}

		System.out.println();
		
		System.out.print("Masukan Nilai Anda : ");
		int nilai = input.nextInt();
		if (nilai >= 80) {
			System.out.println("Anda Lulus!");	
		} else if (nilai <= 79) {
			System.out.println("Anda Tidak Lulus");
		}
	}
}