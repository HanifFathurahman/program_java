import java.util.Scanner;
public class tiket_bus  {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in); 
        int bus, rute, harga, tiket, tot_harga;

        System.out.println("Silahkan Pilih Bus");
        System.out.println("1. Po. Haryanto");
        System.out.println("2. Murni Jaya");
        System.out.print("Input : ");
        bus = input.nextInt();
        if (bus == 1) {
            System.out.println("Silahkan Pilih Rute");
            System.out.println("1. Cileungsi - Kudus");
            System.out.println("2. Cileungsi - Madura");
            System.out.println("3. Cileungsi - Wonogiri");
            System.out.print("Input : ");
            rute = input.nextInt();
            if (rute == 1) {
                harga = 450000;
                System.out.println("Harga tiket : " + harga);
                System.out.print("Jumlah Tiket : ");
                tiket = input.nextInt();
                tot_harga = harga * tiket;
                System.out.println("Total Biaya : " + tot_harga);
            } else if (rute == 2) {
                harga = 400000;
                System.out.println("Harga tiket : " + harga);
                System.out.print("Jumlah Tiket : ");
                tiket = input.nextInt();
                tot_harga = harga * tiket;
                System.out.println("Total Biaya : " + tot_harga);
            } else if (rute == 3) {
                harga = 380000;
                System.out.println("Harga tiket : " + harga);
                System.out.print("Jumlah Tiket : ");
                tiket = input.nextInt();
                tot_harga = harga * tiket;
                System.out.println("Total Biaya : " + tot_harga);
            }
        } else if (bus == 2) {
            System.out.println("Silahkan Pilih Rute");
            System.out.println("1. Cileungsi - Jogja");
            System.out.println("2. Cileungsi - Purworejo");
            System.out.println("3. Cileungsi - Kebumen");
            System.out.print("Input : ");
            rute = input.nextInt();
            if (rute == 1) {
                harga = 420000;
                System.out.println("Harga tiket : " + harga);
                System.out.print("Jumlah Tiket : ");
                tiket = input.nextInt();
                tot_harga = harga * tiket;
                System.out.println("Total Biaya : " + tot_harga);
            } else if (rute == 2) {
                harga = 390000;
                System.out.println("Harga tiket : " + harga);
                System.out.print("Jumlah Tiket : ");
                tiket = input.nextInt();
                tot_harga = harga * tiket;
                System.out.println("Total Biaya : " + tot_harga);
            } else if (rute == 3) {
                harga = 370000;
                System.out.println("Harga tiket : " + harga);
                System.out.print("Jumlah Tiket : ");
                tiket = input.nextInt();
                tot_harga = harga * tiket;
                System.out.println("Total Biaya : " + tot_harga);
            } 
        }



    }
}