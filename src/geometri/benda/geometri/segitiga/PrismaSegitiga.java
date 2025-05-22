package geometri.benda.geometri.segitiga;

import geometri.benda.geometri.BangunDatar;


public class PrismaSegitiga extends Segitiga {
    public double tinggiPrisma;

    public PrismaSegitiga(double tinggiPrisma, double sisiSatu, double sisiDua, double sisiAlas, double tinggiSegitiga) {
        super(sisiSatu, sisiDua, sisiAlas, tinggiSegitiga);
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
        return "Prisma Segitiga";
    }
}
