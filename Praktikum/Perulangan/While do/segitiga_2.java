public class segitiga_2{
    public static void main(String[] args) {
        int i, j;

        i = 10;
        while (i >= 1) {
            j = 1;
            while (j <= i) {
                System.out.print(j+ " ");
                j++;   
            }
            System.out.println();
            i--;    
        }
    }    
}
