package geometri.benda.geometri.trapesium;

import geometri.benda.geometri.BangunDatar;


public class LimasTrapesium extends Trapesium {
    public double tinggiLimas;
    public double tinggiSegitigaSisiAtas;
    public double tinggiSegitigaSisiAlas;
    public double tinggiSegitigaSisiMiringSatu;
    public double tinggiSegitigaSisiMiringDua;

    public LimasTrapesium(double tinggiLimas, double sisiAtas, double sisiAlas,
                          double sisiMiringSatu, double sisiMiringDua, double tinggi,
                          double tinggiSegitigaSisiAtas, double tinggiSegitigaSisiAlas,
                          double tinggiSegitigaSisiMiringSatu, double tinggiSegitigaSisiMiringDua) {
        super(sisiAtas, sisiAlas, sisiMiringSatu, sisiMiringDua, tinggi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitigaSisiAtas = tinggiSegitigaSisiAtas;
        this.tinggiSegitigaSisiAlas = tinggiSegitigaSisiAlas;
        this.tinggiSegitigaSisiMiringSatu = tinggiSegitigaSisiMiringSatu;
        this.tinggiSegitigaSisiMiringDua = tinggiSegitigaSisiMiringDua;
    }

    public double hitungVolume() {
        return this.hitungLuas() * this.tinggiLimas / 3;
    }

    @Override
    public double hitungLuas() {
        double luasAlas = super.hitungLuas();
        double luasSisiAtas = 0.5 * sisiAtas * tinggiSegitigaSisiAtas;
        double luasSisiAlas = 0.5 * sisiAlas * tinggiSegitigaSisiAlas;
        double luasSisiMiringSatu = 0.5 * sisiMiringSatu * tinggiSegitigaSisiMiringSatu;
        double luasSisiMiringDua = 0.5 * sisiMiringDua * tinggiSegitigaSisiMiringDua;
        return luasAlas + luasSisiAtas + luasSisiAlas + luasSisiMiringSatu + luasSisiMiringDua;
    }

    @Override
    public String getNama() {
        return "Limas Trapesium";
    }
}
