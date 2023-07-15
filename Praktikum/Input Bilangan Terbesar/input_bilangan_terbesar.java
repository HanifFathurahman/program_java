import java.util.Scanner;
public class input_bilangan_terbesar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a1, a2, a3;

		System.out.print("Masukan angka pertama : ");
		a1 = input.nextInt();
		System.out.print("Masukan angka kedua : ");
		a2 = input.nextInt();
		System.out.print("Masuan angka ketiga : ");
		a3 = input.nextInt();

		System.out.println("-------------------------------");
		if (a1 >= a2 && a1 >= a3) {
			System.out.println(a1 + " adalah nomor terbesar");
		} else if (a2 >= a1 && a2 >= a3) {
			System.out.println(a2 +  "a dalah nomor terbesar");
		} else if (a3 >= a1 && a3 >= a2) {
			System.out.println(a3 + " adalah nomor terbesar");
		}
	}
}