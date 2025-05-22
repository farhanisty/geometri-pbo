public class PrismaLayangLayang extends LayangLayang {
    public double tinggiPrisma;

    public PrismaLayangLayang(double tinggiPrisma, double diagonalSatu, double diagonalDua, double sisiPendek, double sisiPanjang) {
        super(diagonalSatu, diagonalDua, sisiPendek, sisiPanjang);
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
        return "Prisma Layang Layang";
    }
}
