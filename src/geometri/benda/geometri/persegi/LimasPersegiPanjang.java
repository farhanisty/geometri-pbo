public class LimasPersegiPanjang extends PersegiPanjang {
    public double tinggiLimas;
    public double tinggiSegitigaSisiPendek;
    public double tinggiSegitigaSisiPanjang;

    public LimasPersegiPanjang(double tinggiLimas, double sisiPendek, double sisiPanjang,
                               double tinggiSegitigaSisiPendek, double tinggiSegitigaSisiPanjang) {
        super(sisiPendek, sisiPanjang);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitigaSisiPendek = tinggiSegitigaSisiPendek;
        this.tinggiSegitigaSisiPanjang = tinggiSegitigaSisiPanjang;
    }

    public double hitungVolume() {
        return this.hitungLuas() * this.tinggiLimas / 3;
    }

    @Override
    public double hitungLuas() {
        double luasAlas = super.hitungLuas();
        double luasSisiPendek = 2 * (0.5 * sisiPendek * tinggiSegitigaSisiPendek);
        double luasSisiPanjang = 2 * (0.5 * sisiPanjang * tinggiSegitigaSisiPanjang);
        return luasAlas + luasSisiPendek + luasSisiPanjang;
    }

    @Override
    public String getNama() {
        return "Limas Persegi Panjang";
    }
}
