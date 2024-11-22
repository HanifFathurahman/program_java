public class Utama {
    public static void main(String[] args) {
        BangunDatar balok = new BangunDatar();
        balok.setLebar(5);
        balok.setPanjang(10);
        System.out.println("\f");
        System.out.println("Luas balok: " + balok.getLuas());
        
        SegiTiga st = new SegiTiga();
        st.setAlas(5);
        st.setTinggi(7);
        System.out.println("Luas segitiga: " + st.getLuas());
        
        Lingkaran l = new Lingkaran();
        l.setDiameter(10);
        System.out.println("Luas lingkaran: " + l.getLuas());
        
        Trapesium t = new Trapesium();
        t.setPanjang(15);
        t.setPanjangAtas(10);
        t.setLebar(4);
        System.out.println("Luas trapesium: " + t.getLuas());
    }
}