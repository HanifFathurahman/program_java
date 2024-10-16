public class Main23{ 
   int tahunModel;
   String namaModel;

   public Main23(int tahun, String nama) {
      tahunModel = tahun;
      namaModel = nama;
   }

   public static void main(String[] args) {
      Main23 mobilSaya = new Main23(2024,"Marcedez Benz");
      System.out.println("\f");
      System.out.println(mobilSaya.tahunModel + " " + mobilSaya.namaModel);
   }
}