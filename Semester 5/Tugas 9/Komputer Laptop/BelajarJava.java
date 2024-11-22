public class BelajarJava {
    public static void main(String[] args) {
        Laptop laptopAndi = new Laptop("Intel Core i7", "HP", "16 GB");
        Laptop laptopRudi = new Laptop("Intel Core i3", "Asus", "4 GB");

        System.out.println(laptopAndi.lihatSpec());
        System.out.println(laptopRudi.lihatSpec());
    }
}