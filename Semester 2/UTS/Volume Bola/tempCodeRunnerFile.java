public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        float hasil;

        System.out.print("Input jari-jari bola : ");
        r = input.nextDouble();
        hasil = (float) (Math.PI * r * r * r * 4/3);
        System.out.println("Volume bola adalah : " + hasil);
    }
}