class SegiTiga extends BangunDatar {
    public double getAlas() {
        return panjang;
    }

    public void setAlas(double alas) {
        super.setPanjang(alas);
    }

    public double getTinggi() {
        return lebar;
    }

    public void setTinggi(double tinggi) {
        super.setLebar(tinggi);
    }

    @Override
    public double getLuas() {
        return (panjang * lebar) / 2;
    }
}