class Lingkaran extends BangunDatar {
    public double getDiameter() {
        return panjang;
    }

    public void setDiameter(double diameter) {
        super.setPanjang(diameter); 
    }

    @Override
    public double getLuas() {
        // Luas lingkaran = PI * (r * r), r = diameter / 2
        return Math.PI * Math.pow(panjang / 2, 2);
    }
}