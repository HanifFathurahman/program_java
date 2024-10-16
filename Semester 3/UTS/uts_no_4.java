import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class uts_no_4 {
   public static void main(String[] var0) {
      try {
         File var1 = new File("pasien_data.txt");
         Scanner var2 = new Scanner(var1);
         System.out.println("===================================================================");
         System.out.printf("%-8s%-20s%-12s%-12s%-12s%n", "ID Pas", "Nama Pasien", "Kode Kamar", "Lama Inap", "Total Biaya");
         System.out.println("===================================================================");

         while(var2.hasNextLine()) {
            String var3 = var2.nextLine();
            String[] var4 = var3.split("_");
            String var5 = var4[0];
            int var6 = Integer.parseInt(var4[1]);
            int var7 = Integer.parseInt(var4[2]);
            String var8 = var4[3];
            int var9 = 0;
            if (var6 == 1) {
               var9 = 100000;
            } else if (var6 == 2) {
               var9 = 250000;
            } else if (var6 == 3) {
               var9 = 500000;
            }

            int var10 = var9 * var7;
            System.out.printf("%-8s%-20s%-12s%-12s%-12s%n", var5, var8, var6, var7, var10);
         }

         var2.close();
      } catch (FileNotFoundException var11) {
         System.out.println("File pasien_data.txt tidak ditemukan.");
         var11.printStackTrace();
      }

   }
}