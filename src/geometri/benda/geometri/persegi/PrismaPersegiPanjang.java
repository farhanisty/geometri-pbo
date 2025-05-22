package geometri.benda.geometri.persegi;

import geometri.benda.geometri.BangunDatar;

public class PrismaPersegiPanjang extends PersegiPanjang {
    public double tinggiPrisma;

    public PrismaPersegiPanjang(double tinggiPrisma, double sisiPendek, double sisiPanjang) {
        super(sisiPendek, sisiPanjang);
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
        return "Prisma Persegi Panjang";
    }
}
