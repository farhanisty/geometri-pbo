public class LimasSegitiga extends Segitiga {
    public double tinggiLimas;
    public double tinggiSegitigaSisiSatu;
    public double tinggiSegitigaSisiDua;
    public double tinggiSegitigaSisiAlas;

    public LimasSegitiga(double tinggiLimas, double sisiSatu, double sisiDua, double sisiAlas, double tinggi,
                         double tinggiSegitigaSisiSatu, double tinggiSegitigaSisiDua, double tinggiSegitigaSisiAlas) {
        super(sisiSatu, sisiDua, sisiAlas, tinggi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitigaSisiSatu = tinggiSegitigaSisiSatu;
        this.tinggiSegitigaSisiDua = tinggiSegitigaSisiDua;
        this.tinggiSegitigaSisiAlas = tinggiSegitigaSisiAlas;
    }

    public double hitungVolume() {
        return this.hitungLuas() * this.tinggiLimas / 3;
    }

    @Override
    public double hitungLuas() {
        double luasAlas = super.hitungLuas();
        double luasSisiSatu = 0.5 * sisiSatu * tinggiSegitigaSisiSatu;
        double luasSisiDua = 0.5 * sisiDua * tinggiSegitigaSisiDua;
        double luasSisiAlas = 0.5 * sisiAlas * tinggiSegitigaSisiAlas;
        return luasAlas + luasSisiSatu + luasSisiDua + luasSisiAlas;
    }

    @Override
    public String getNama() {
        return "Limas Segitiga";
    }
}
