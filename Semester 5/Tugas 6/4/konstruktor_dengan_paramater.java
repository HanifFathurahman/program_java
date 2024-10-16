public class konstruktor_dengan_paramater {
    String warna, merk;
    public konstruktor_dengan_paramater(String paramWarna, String ParamMerk) {
        warna = paramWarna;
        merk = ParamMerk;
    }

    void maju() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak maju");
    }
    void mundur() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak mundur");
    }

    public static void main(String[] args) {
        konstruktor_dengan_paramater mobilSaya = new konstruktor_dengan_paramater("Biru", "Toyota");
        System.out.println("\f");
        mobilSaya.maju();
        mobilSaya.mundur();
    }
    

}