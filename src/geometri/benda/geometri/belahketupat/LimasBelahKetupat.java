package geometri.benda.geometri.belahketupat;

import geometri.benda.geometri.BangunDatar;

public class LimasBelahKetupat extends BelahKetupat {
    public double tinggiLimas;
    public double tinggiSegitigaSisi;

    public LimasBelahKetupat(double tinggiLimas, double sisi, double diagonalSatu, double diagonalDua, double tinggiSegitigaSisi) {
        super(sisi, diagonalSatu, diagonalDua);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitigaSisi = tinggiSegitigaSisi;
    }

    public double hitungVolume() {
        return super.hitungLuas() * this.tinggiLimas / 3;
    }


    @Override
    public double hitungLuas() {
        double luasAlas = super.hitungLuas();
        double luasSisiSamping = 4 * (0.5 * this.sisi * this.tinggiSegitigaSisi);
        return luasAlas + luasSisiSamping;
    }

    @Override
    public String getNama() {
        return "Limas Belah Ketupat";
    }
}
