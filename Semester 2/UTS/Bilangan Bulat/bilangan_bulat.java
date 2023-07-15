    import java.util.Scanner;
    public class bilangan_bulat {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int angka_pertama, angka_kedua, hasil;

            System.out.print("Angka pertama : ");
            angka_pertama = input.nextInt();
            System.out.print("Anga kedua : ");
            angka_kedua = input.nextInt();
            if (angka_pertama == angka_kedua) {
                hasil = angka_pertama + angka_kedua;
                System.out.println("Output : " + hasil);
            } else {
                hasil = angka_pertama * angka_kedua;
                System.out.println("Output : " + hasil);
            }
        }
    }