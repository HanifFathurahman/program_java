// Hanif Fathurahman
// 202243501199
// R2E

public class soal2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" unindra ");
            } else if (i % 5 == 0) {
                System.out.print(" lima ");
            } else if (i % 3 == 0) {
                System.out.print(" tiga ");
            } else {
                System.out.print(" " + i);
            }
        }
    }
}