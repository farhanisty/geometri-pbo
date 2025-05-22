package geometri.benda.geometri.jajargenjang;

import geometri.benda.geometri.BangunDatar;

public class LimasJajarGenjang extends JajarGenjang {
    public double tinggiLimas;
    public double tinggiSegitigaSisiDatar;
    public double tinggiSegitigaSisiMiring;

    public LimasJajarGenjang(double tinggiLimas, double sisiDatar, double sisiMiring, double tinggi,
                             double tinggiSegitigaSisiDatar, double tinggiSegitigaSisiMiring) {
        super(sisiDatar, sisiMiring, tinggi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitigaSisiDatar = tinggiSegitigaSisiDatar;
        this.tinggiSegitigaSisiMiring = tinggiSegitigaSisiMiring;
    }

    public double hitungVolume() {
        return super.hitungLuas() * this.tinggiLimas / 3;
    }

    @Override
    public double hitungLuas() {
        double luasAlas = super.hitungLuas();
        double luasSisiDatar = 2 * (0.5 * sisiDatar * tinggiSegitigaSisiDatar);
        double luasSisiMiring = 2 * (0.5 * sisiMiring * tinggiSegitigaSisiMiring);
        return luasAlas + luasSisiDatar + luasSisiMiring;
    }

    @Override
    public String getNama() {
        return "Limas Jajar Genjang";
    }
}
