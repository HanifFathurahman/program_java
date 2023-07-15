public class latihan_2 {
    public static void main(String[] args) {
        String[] [] data = new String[2] [3];

        data[0] [0] = "202243501199";
        data[0] [1] = "Hanif Fathurahman";
        data[0] [2] = "Jakarta";
        data[1] [0] = "202243502299";
        data[1] [1] = "Luthfi Fauzan Azzami";
        data[1] [2] = "Bogor";
        System.out.println("    NPM \t\tNama \t\t Alamat");
        for (int i = 0; i < 2; i ++) {
            for (int j = 0; j < 3; j ++) {
                System.out.print(data[i] [j] + "\t");
            }
            System.out.println();
        }
    }
}