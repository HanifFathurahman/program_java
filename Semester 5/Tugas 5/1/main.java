public class main {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }
    
    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int angka1 = plusMethodInt(8, 5);
        double angka2 = plusMethodDouble(4.3, 6.26);
        System.out.println("Integer :" + angka1);
        System.out.println("Double :" + angka2);
    }
}
