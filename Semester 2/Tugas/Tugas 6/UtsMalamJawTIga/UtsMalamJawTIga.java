import java.util.Scanner;
public class UtsMalamJawTIga {
	public static void main(String[] args) {
		final int hrgPelanggan = 100;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Apakah Pelanggan (Y/T) = ");
		String pelanggan = input.nextLine();
		
		System.out.print("Jumlah Fotocopy = ");
		int lbrcopy = input.nextInt();
		System.out.printf("%n %n");
		
		if (pelanggan.equalsIgnoreCase("t")) {
			if (lbrcopy < 100 ) {
				int total = 200 * lbrcopy;
				System.out.println("Jumlah Fotocopy = " + lbrcopy);
				System.out.println("Bayar  = " + total);
			} else if (lbrcopy <= 200) {
				int total = 170 * lbrcopy;
				System.out.println("Jumlah Fotocopy = " + lbrcopy);
				System.out.println("Bayar  = " + total);
			} else {
				int total = 150 * lbrcopy;
				System.out.println("Jumlah Fotocopy = " + lbrcopy);
				System.out.println("Bayar  = " + total);
			}
		} else if (pelanggan.equalsIgnoreCase("y")) {
			int total = hrgPelanggan * lbrcopy;
				System.out.println("Jumlah Fotocopy = " + lbrcopy);
				System.out.println("Bayar  = " + total);
		} else {
			System.out.println("Tolong Di Jawab Pertanyaannya...!");
		}
	}
}