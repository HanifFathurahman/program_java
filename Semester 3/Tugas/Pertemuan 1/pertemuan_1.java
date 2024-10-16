public class pertemuan_1 {
    public static void main(String[] args) {
        
        //operator matematika (penjumlahan)
        int angka_pertama = 5;
        int angka_kedua = 8;
        int hasil = angka_pertama + angka_kedua;
        System.out.println(hasil);

        //operator majemuk (perkalian)
        angka_pertama *= angka_kedua;
        System.out.println(angka_pertama);

        //operator increament dan decreament
        int x = 20;
        x++;
        System.out.println(x++);

        int y = 20;
        y--;
        System.out.println(y--);

        //struktur kondisi
        if (angka_pertama > angka_kedua) {
            System.out.println("Huruf pertama lebih besar dari huruf kedua");
        } else {
            System.out.println("Huruf kedua lebih besar dari huruf pertama");
        }
    }
}