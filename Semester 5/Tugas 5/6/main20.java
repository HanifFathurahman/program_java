public class main20 {
    static void cekUmur(int umur) {
        System.out.println("\f");
        if (umur < 17) {
            System.out.println("Engkau masih anak sekolah");
        }
        else {
            System.out.println("Waktunya buat KTP");
        }
    }

    public static void main(String[] args) {
        cekUmur(20);
    }
}