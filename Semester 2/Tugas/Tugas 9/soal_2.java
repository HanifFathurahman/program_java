/* Nama  : Hanif Fathurahman
 * NPM   : 202243501199
 * Kelas : R2E
 */

public class soal_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean prima = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}