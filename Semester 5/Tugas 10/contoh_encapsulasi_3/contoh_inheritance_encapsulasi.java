// Kelas induk Person yang menerapkan Encapsulation
class Person {
    // Variabel private
    private String name;
    private int age;

    // Konstruktor untuk menginisialisasi objek
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter untuk nama
    public String getName() {
        return name;
    }

    // Setter untuk nama
    public void setName(String name) {
        this.name = name;
    }

    // Getter untuk umur
    public int getAge() {
        return age;
    }

    // Setter untuk umur
    public void setAge(int age) {
        if (age >= 0) {  // Validasi agar umur tidak negatif
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

// Kelas turunan Employee yang mewarisi kelas Person
class Employee extends Person {
    private String jobTitle;

    // Konstruktor untuk Employee yang memanggil konstruktor Person
    public Employee(String name, int age, String jobTitle) {
        super(name, age);  // Memanggil konstruktor kelas induk (Person)
        this.jobTitle = jobTitle;
    }

    // Getter untuk jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    // Setter untuk jobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Override metode displayInfo untuk menambahkan jobTitle
    @Override
    public void displayInfo() {
        super.displayInfo();  // Menampilkan informasi dari kelas induk
        System.out.println("Job Title: " + jobTitle);  // Menambahkan informasi pekerjaan
    }
}

public class contoh_inheritance_encapsulasi {
    public static void main(String[] args) {
        // Membuat objek Person
        Person person1 = new Person("John Doe", 30);

        // Menampilkan informasi person1
        System.out.println("\f");
        System.out.println("Person Information:");
        person1.displayInfo();

        // Mengubah nama dan umur person1
        person1.setName("Jane Doe");
        person1.setAge(28);

        // Menampilkan informasi yang sudah diperbarui
        System.out.println("\nUpdated Person Information:");
        person1.displayInfo();

        // Membuat objek Employee
        Employee employee1 = new Employee("Alice Smith", 25, "Software Developer");

        // Menampilkan informasi employee1
        System.out.println("\nEmployee Information:");
        employee1.displayInfo();

        // Mengubah pekerjaan dan umur employee1
        employee1.setJobTitle("Senior Software Developer");
        employee1.setAge(26);

        // Menampilkan informasi yang sudah diperbarui
        System.out.println("\nUpdated Employee Information:");
        employee1.displayInfo();
    }
}