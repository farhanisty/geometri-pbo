package geometri.benda.geometri.persegi;

import geometri.benda.geometri.BangunDatar;

public class PrismaPersegi extends Persegi {
    public double tinggiPrisma;

    public PrismaPersegi(double tinggiPrisma, double sisi) {
        super(sisi);
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
        return "Prisma Persegi";
    }
}
