public class latihan_3 {
    public static void main(String[] args) {
        String[] nama = {"Hanif", "Lutfi", "Ucup"};
        double[] [] nil = {{60, 70, 90}, {80, 70, 90}, {70, 60, 90}};
        double nilai = 0;
        
        System.out.println("+-------+-------+-------+-------+--------------+");
        System.out.println(" I Nama\tI UTS\tI UAS\tI TUGAS\tI NILAI AKHIR\tI");
        System.out.println("+-------+-------+-------+-------+--------------+");
        for (int baris = 0; baris < 3; baris ++) {
            System.out.print("I " + nama[baris] + "\tI ");
            for (int kolom = 0; kolom < 3; kolom ++) {
                System.out.print(nil[baris] [kolom] + "\tI ");
            }
            nilai = (0.35 * nil[baris] [0])+(0.45 * nil[baris] [1])+(0.2 * nil[baris] [2]);
            System.out.println(nilai + "\t\tI ");
        }
        System.out.println("+-------+-------+-------+-------+--------------+");
    }
}