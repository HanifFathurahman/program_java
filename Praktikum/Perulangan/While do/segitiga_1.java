public class segitiga_1 {
    public static void main(String[] args) {
        int i, j;

        i = 1;
        while (i <= 10) {
            j = 1;
            while (j < i) {
                System.out.print(j+ " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
