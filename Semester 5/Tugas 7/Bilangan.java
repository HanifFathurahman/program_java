import java.util.Scanner;

public class Bilangan {
    int startNumber;

    // Constructor
    public Bilangan(int startNumber) {
        this.startNumber = startNumber;
        // Menampilkan bilangan
        tampilkanBilangan();
    }

    // Menampilkan bilangan genap dan ganjil
    public void tampilkanBilangan() {
        System.out.println("Bilangan dari " + startNumber + " hingga 1000:");
        System.out.print("Bilangan Genap: ");
        for (int i = startNumber; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println(); 
        System.out.print("Bilangan Ganjil: ");
        for (int i = startNumber; i <= 1000; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka awal (dari 1 hingga 1000): ");
        int startNumber = input.nextInt();
        
        // Validasi input
        if (startNumber < 1 || startNumber > 1000) {
            System.out.println("Angka awal harus antara 1 dan 1000.");
        } else {
            // Membuat objek dari kelas Bilangan
            new Bilangan(startNumber);
        }
        input.close(); 
    }
}
