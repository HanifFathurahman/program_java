import java.util.Scanner;
public class potongan_harga {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double harga = 15000,total_jumlah, potongan, total_biaya;  
		int jumlah;

		System.out.println("Harga Satuan Rp. " + harga);
		System.out.println("-------------------------");
		System.out.print("Jumlah? : ");
		jumlah = input.nextInt();
		total_jumlah = jumlah * harga;
		System.out.println("Biaya : Rp " + total_jumlah);

		if (total_jumlah >= 50000) {
			potongan = 0.2 * total_jumlah;
			System.out.println("Besarnya potongan : Rp " + potongan);
			total_biaya = total_jumlah - potongan;
			System.out.println("Total biaya : Rp " + total_biaya);
		}
		System.out.println("Terima kasih");
	}
}