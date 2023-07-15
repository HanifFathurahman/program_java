import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class PraktikumCurrency {
    public static void main(String[] args) {
        double harga = 20000000;
        NumberFormat kurensiEROPA = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.printf("Harga Pound : %s %n", kurensiEROPA.format(harga));

        NumberFormat kurensiJepang = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.printf("Harga Yen : %s %n", kurensiJepang.format(harga));

        NumberFormat kurensiUS = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.printf("Harga Dolar : %s %n", kurensiUS.format(harga));

        NumberFormat kurensiPrancis = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.printf("Harga Euro : %s %n", kurensiPrancis.format(harga));
        
        NumberFormat kurensiKorea = NumberFormat.getCurrencyInstance(Locale.KOREA);
        System.out.printf("Harga Won : %s %n", kurensiKorea.format(harga));
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        System.out.printf("Harga Rupiah: %s %n", kursIndonesia.format(harga));
        
        System.out.printf("%.2f", harga);
        System.out.print(" adalah nilai asalnya");
    }
}