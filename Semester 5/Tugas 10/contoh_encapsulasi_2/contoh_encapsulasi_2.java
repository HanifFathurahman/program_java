import java.util.Scanner;

class Person {
    // Variabel private
    private String name;
    private int age;

    // Konstruktor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter untuk mengambil nama
    public String getName() {
        return name;
    }

    // Setter untuk mengubah nama
    public void setName(String name) {
        this.name = name;
    }

    // Getter untuk mengambil umur
    public int getAge() {
        return age;
    }

    // Setter untuk mengubah umur
    public void setAge(int age) {
        if (age >= 0) {  // Menjaga umur agar tidak negatif
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Metode untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class contoh_encapsulasi_2 {
    public static void main(String[] args) {
        // Membuat Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Mengambil input nama dan umur dari pengguna
        System.out.println("\f");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Membaca nama

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Membaca umur

        // Membuat objek Person dengan input dari pengguna
        Person person = new Person(name, age);

        // Menampilkan informasi awal
        System.out.println("\nInitial Information:");
        person.displayInfo();

        // Meminta pengguna untuk mengubah nama dan umur
        scanner.nextLine();  // Membersihkan newline dari buffer setelah nextInt

        System.out.print("\nEnter new name: ");
        String newName = scanner.nextLine();  // Membaca nama baru

        System.out.print("Enter new age: ");
        int newAge = scanner.nextInt();  // Membaca umur baru

        // Menggunakan setter untuk mengubah data
        person.setName(newName);
        person.setAge(newAge);

        // Menampilkan informasi yang telah diperbarui
        System.out.println("\nUpdated Information:");
        person.displayInfo();

        // Menutup scanner
        scanner.close();
    }
}