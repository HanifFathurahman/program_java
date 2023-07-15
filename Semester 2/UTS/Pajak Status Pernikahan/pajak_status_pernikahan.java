import java.util.Scanner;

import org.w3c.dom.stylesheets.StyleSheetList;
public class pajak_status_pernikahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int status; 
        double pendapatan, pajak = 0;

        System.out.println("Status Kategori");
        System.out.println("1. Tidak Kawin");
        System.out.println("2. Kawin");
        System.out.print("Input status kategori : ");
        status = input.nextInt();
        System.out.print("Masukan pendapatan anda dalam 1 tahun : ");
        pendapatan = input.nextInt();
        if (status == 1) {
            if (pendapatan <= 70000000) {
                pajak = pendapatan * 0.05;
            } else if (pendapatan > 70000000 && pendapatan <= 270000000) {
                pajak = pendapatan * 0.15;
            } else if (pendapatan > 270000000) {
                pajak = pendapatan * 0.25;
            }
        } else if (status == 2) {
            if (pendapatan <= 50000000) {
                pajak = pendapatan * 0.05;
            } else if (pendapatan > 50000000 && pendapatan <= 250000000) {
                pajak = pendapatan * 0.15;
            } else if (pendapatan > 250000000) {
                pajak = pendapatan * 0.25;
            }
        }
        System.out.printf("Pajak anda adalah sebesar : Rp %.2f%n", pajak);
    }
}
