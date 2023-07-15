/* 
 * Praktikum Enam 
 * Mengetahui penggunaan operator relasional   
 * @author Teknik Informatika Unindra
 */

 public class praktium_enam {
    public static void main (String[] args) {
        
        int x = 72;
        int y = 99;
        int z = 99;
        System.out.println("Inisialisasi nilai variabel ...");
        System.out.println("x = " + x); //x = 72
        System.out.println("y = " + y); //y = 99
        System.out.println("z = " + z); //z = 99
        
        System.out.println("Perbandingan Lebih Besar Dari (>) :");
        System.out.println("x > y = " + (x > y)); // false
        System.out.println("y > x = " + (y > x)); // true
        System.out.println("z > y = " + (z > y)); // false
        
        System.out.println("Perbandingan Lebih Besar Sama Dengan (>=) :");
        System.out.println("x >= y = " + (x >= y)); // false
        System.out.println("y >= x = " + (y >= x)); // true
        System.out.println("z >= y = " + (z >= y)); // true
    }   
}
