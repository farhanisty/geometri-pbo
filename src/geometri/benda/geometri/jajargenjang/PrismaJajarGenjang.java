package geometri.benda.geometri.jajargenjang;

import geometri.benda.geometri.BangunDatar;

public class PrismaJajarGenjang extends JajarGenjang {
    public double tinggiPrisma;

    public PrismaJajarGenjang(double tinggiPrisma, double sisiDatar, double sisiMiring, double tinggi) {
        super(sisiDatar, sisiMiring, tinggi);
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        return super.hitungLuas() * this.tinggiPrisma;
    }


    @Override
    public double hitungLuas() {
        return 2 * super.hitungLuas() + super.hitungKeliling() * this.tinggiPrisma;
    }

    @Override
    public String getNama() {
        return "Prisma Jajar Genjang";
    }
}
