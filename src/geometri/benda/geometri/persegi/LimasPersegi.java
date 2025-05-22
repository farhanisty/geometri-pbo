public class LimasPersegi extends Persegi {
    public double tinggiLimas;
    public double tinggiSegitiga;

    public LimasPersegi(double tinggiLimas, double sisi, double tinggiSegitiga) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitiga = tinggiSegitiga;
    }

    public double hitungVolume() {
        return this.hitungLuas() * this.tinggiLimas / 3;
    }

    @Override
    public double hitungLuas() {
        double luasAlas = super.hitungLuas();
        double luasSisi = 4 * (0.5 * sisi * tinggiSegitiga);
        return luasAlas + luasSisi;
    }

    @Override
    public String getNama() {
        return "Limas Persegi";
    }
}
