package geometri.benda.geometri.trapesium;

import geometri.benda.geometri.BangunDatar;


public class PrismaTrapesium extends Trapesium {
    public double tinggiPrisma;

    public PrismaTrapesium(double tinggiPrisma, double sisiAtas, double sisiAlas, double sisiMiringSatu, double sisiMiringDua, double tinggi) {
        super(sisiAtas, sisiAlas, sisiMiringSatu, sisiMiringDua, tinggi);
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
        return "Prisma Trapesium";
    }
}
