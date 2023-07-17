import java.util.Scanner;

public class KonversiCelciusFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            //Fahrenheit to celcius
            System.out.print("Masukkan suhu fahrenheit : ");
            int f = input.nextInt();

            float hasilkecelcius = (f - 32) * 5/9;
            System.out.println("Hasil konversi dari suhu fahrenheit ke celcius : " + hasilkecelcius);


            //Celcius to fahrenheit
            System.out.print("Masukkan suhu celcius : ");
            int c = input.nextInt();

            float hasilkefahrenheit = (c * 9/5) + 32;
            System.out.println("Hasil konveri dari suhu celcius ke fahrenheit : " + hasilkefahrenheit);

        
    }
}