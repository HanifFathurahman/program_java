public class konstruktor_tanpa_parameter {
    String warna = "Merah";
    String merk = "BMW";

    void maju() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak maju");
    }
    void mundur() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak mundur");
    }

    public static void main(String[] args) {
        konstruktor_tanpa_parameter mobilSaya = new konstruktor_tanpa_parameter();
        System.out.println("\f");
        mobilSaya.maju();
        mobilSaya.mundur();
    }
}
