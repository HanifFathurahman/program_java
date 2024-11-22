public class PenggunaanSuperKonstruktorChild extends PenggunaanSuperKonstruktor {
    public PenggunaanSuperKonstruktorChild(int umur) {
        super(umur); // Memanggil konstruktor dari kelas induk
    }

    public static void main(String[] args) {
        PenggunaanSuperKonstruktorChild s = new PenggunaanSuperKonstruktorChild(24);
        s.getAge();
    }
}