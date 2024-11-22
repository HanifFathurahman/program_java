// Kelas Person yang menerapkan Encapsulation
class Person {
    // Variabel private yang tidak dapat diakses langsung dari luar kelas
    private String name;
    private int age;

    // Konstruktor untuk menginisialisasi objek
    public Person(String name, ;/int age) {
        this.name = name;
        this.age = age;
    }

    // Metode getter untuk mengambil nilai name
    public String getName() {
        return name;
    }

    // Metode setter untuk mengubah nilai name
    public void setName(String name) {
        this.name = name;
    }

    // Metode getter untuk mengambil nilai age
    public int getAge() {
        return age;
    }

    // Metode setter untuk mengubah nilai age
    public void setAge(int age) {
        if (age >= 0) {  // Menambahkan validasi agar umur tidak negatif
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Metode untuk menampilkan informasi orang
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class contoh_encapsulasi {
    public static void main(String[] args) {
        // Membuat objek Person
        Person person1 = new Person("Yusuf", 25);

        // Mengakses data melalui getter
        System.out.println("\f");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Mengubah data menggunakan setter
        person1.setName("Abdulloh");
        person1.setAge(30);

        // Menampilkan informasi yang sudah diperbarui
        person1.displayInfo();
    }
}