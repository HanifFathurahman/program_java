class Trapesium extends BangunDatar {
    protected double panjangAtas;

    public double getPanjangAtas() {
        return panjangAtas;
    }

    public void setPanjangAtas(double panjangAtas) {
        this.panjangAtas = Math.max(panjangAtas, 1); // Menghindari nilai negatif
    }

    @Override
    public double getLuas() {
        // Luas trapesium = ((panjang + panjangAtas) / 2) * tinggi
        return ((panjang + panjangAtas) / 2) * lebar; // lebar sebagai tinggi
    }
}