class BangunDatar {
    protected double panjang, lebar;

    // Getter dan setter untuk panjang
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = Math.max(panjang, 1); // Menghindari nilai negatif
    }

    // Getter dan setter untuk lebar
    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = Math.max(lebar, 1); // Menghindari nilai negatif
    }

    // Metode untuk menghitung luas
    public double getLuas() {
        return panjang * lebar;
    }
}