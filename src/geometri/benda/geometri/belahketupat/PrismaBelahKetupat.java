public class PrismaBelahKetupat extends BelahKetupat {
    public double tinggiPrisma;

    public PrismaBelahKetupat(double tinggiPrisma, double sisi, double diagonalSatu, double diagonalDua) {
        super(sisi, diagonalSatu, diagonalDua);
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
        return "Prisma Belah Ketupat";
    }
}
