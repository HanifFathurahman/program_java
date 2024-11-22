public class Mobil extends Kendaraan {
    private String namaModel = "Inova";
    public static void main(String[] args) {
        Mobil mobilSaya = new Mobil();
        mobilSaya.klakson();
        System.out.println(mobilSaya.merk + " " + mobilSaya.namaModel);
    }
}