// Kelas induk Person untuk menyimpan data pribadi
class Person {
    private String name;
    private int age;

    // Konstruktor untuk menginisialisasi objek Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter dan Setter untuk nama
    public String getName() {
        return name;
    }rt 

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan Setter untuk umur
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {  // Validasi agar umur tidak negatif
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Metode untuk menampilkan informasi pribadi
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Kelas turunan Mahasiswa yang mewarisi kelas Person
class Mahasiswa extends Person {
    private double nilaiUts;
    private double nilaiUas;
    private double nilaiAkhir;

    // Konstruktor untuk Mahasiswa yang memanggil konstruktor Person
    public Mahasiswa(String name, int age, double nilaiUts, double nilaiUas) {
        super(name, age);  // Memanggil konstruktor kelas induk (Person)
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        // Menghitung nilai akhir otomatis saat objek dibuat
        this.nilaiAkhir = hitungNilaiAkhir();
    }

    // Getter dan Setter untuk nilai UTS
    public double getNilaiUts() {
        return nilaiUts;
    }

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
        this.nilaiAkhir = hitungNilaiAkhir();  // Recalculate nilai akhir
    }

    // Getter dan Setter untuk nilai UAS
    public double getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
        this.nilaiAkhir = hitungNilaiAkhir();  // Recalculate nilai akhir
    }

    // Getter untuk nilai akhir
    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    // Metode untuk menghitung nilai akhir mahasiswa
    private double hitungNilaiAkhir() {
        return (nilaiUts + nilaiUas) / 2;
    }

    // Override metode displayInfo untuk menampilkan data lengkap
    @Override
    public void displayInfo() {
        super.displayInfo();  // Menampilkan informasi pribadi dari kelas Person
        System.out.println("Nilai UTS: " + nilaiUts);
        System.out.println("Nilai UAS: " + nilaiUas);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}

public class contoh_inheritance_dan_encapsulasi2 {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi Santoso", 20, 85.0, 90.0);

        // Menampilkan informasi mahasiswa
        System.out.println("\f");
        System.out.println("Informasi Mahasiswa 1:");
        mahasiswa1.displayInfo();

        // Mengubah nilai UTS dan UAS mahasiswa1
        mahasiswa1.setNilaiUts(88.0);
        mahasiswa1.setNilaiUas(92.0);

        // Menampilkan informasi mahasiswa setelah perubahan nilai
        System.out.println("\nInformasi Mahasiswa 1 setelah perubahan nilai:");
        mahasiswa1.displayInfo();

        // Membuat objek Mahasiswa lain
        Mahasiswa mahasiswa2 = new Mahasiswa("Siti Aminah", 22, 78.0, 80.0);

        // Menampilkan informasi mahasiswa kedua
        System.out.println("\nInformasi Mahasiswa 2:");
        mahasiswa2.displayInfo();
    }
}