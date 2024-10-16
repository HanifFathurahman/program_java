import java.sql.*;
import java.util.Scanner;

public class ProgramPenilaian {

    private static final String URL = "jdbc:sqlite:C:/Users/onepchman/Dekstop/DB/Hanif.db";

    public static void main(String[] args) {
        Connection connection = null;
        Scanner scanner = new Scanner(System.in);

        try {
            // Load driver JDBC
            Class.forName("org.sqlite.JDBC");

            // Membuat koneksi ke database
            connection = DriverManager.getConnection(URL);

            // Menu utama
            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Tampilkan Data Nilai");
                System.out.println("2. Input Penilaian");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu (1/2/3): ");

                int menu = scanner.nextInt();

                switch (menu) {
                    case 1:
                        tampilkanDataNilai(connection);
                        break;
                    case 2:
                        inputPenilaian(connection, scanner);
                        break;
                    case 3:
                        System.out.println("Keluar dari program.");
                        return;
                    default:
                        System.out.println("Menu tidak valid. Silakan pilih kembali.");
                        break;
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Menutup koneksi setelah selesai
            try {
                if (connection != null) {
                    connection.close();
                }
                scanner.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void tampilkanDataNilai(Connection connection) throws SQLException {
        String query = "SELECT * FROM penilaian";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            System.out.println("\nData Nilai:");
            System.out.println("NPM\tKode MK\tNilai Tugas\tNilai UTS\tNilai UAS\tNilai Akhir");

            while (resultSet.next()) {
                String npm = resultSet.getString("NPM");
                String kodeMK = resultSet.getString("Kode_Mata_Kuliah");
                int nilaiTugas = resultSet.getInt("Nilai_Tugas");
                int nilaiUTS = resultSet.getInt("Nilai_UTS");
                int nilaiUAS = resultSet.getInt("Nilai_UAS");
                double nilaiAkhir = hitungNilaiAkhir(nilaiTugas, nilaiUTS, nilaiUAS);

                System.out.printf("%s\t%s\t%d\t\t%d\t\t%d\t\t%.2f\n", npm, kodeMK, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir);
            }
            System.out.println();
        }
    }

    private static void inputPenilaian(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Masukkan NPM: ");
        String npm = scanner.next();
        System.out.print("Masukkan Kode Mata Kuliah: ");
        String kodeMK = scanner.next();
        System.out.print("Masukkan Nilai Tugas: ");
        int nilaiTugas = scanner.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int nilaiUTS = scanner.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int nilaiUAS = scanner.nextInt();

        double nilaiAkhir = hitungNilaiAkhir(nilaiTugas, nilaiUTS, nilaiUAS);

        String insertQuery = "INSERT INTO penilaian (NPM, Kode_Mata_Kuliah, Nilai_Tugas, Nilai_UTS, Nilai_UAS, Nilai_Akhir) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, npm);
            preparedStatement.setString(2, kodeMK);
            preparedStatement.setInt(3, nilaiTugas);
            preparedStatement.setInt(4, nilaiUTS);
            preparedStatement.setInt(5, nilaiUAS);
            preparedStatement.setDouble(6, nilaiAkhir);

            preparedStatement.executeUpdate();

            System.out.println("Data penilaian berhasil ditambahkan.\n");
        }
    }

    private static double hitungNilaiAkhir(int nilaiTugas, int nilaiUTS, int nilaiUAS) {
        // Misalnya, Anda dapat menggunakan formula tertentu untuk menghitung nilai akhir
        // Contoh: Nilai Akhir = (0.3 * Nilai Tugas) + (0.3 * Nilai UTS) + (0.4 * Nilai UAS)
        return (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }
}