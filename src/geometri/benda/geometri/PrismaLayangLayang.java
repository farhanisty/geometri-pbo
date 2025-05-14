/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class PrismaLayangLayang extends LayangLayang{
    public double tinggiPrisma;
    
    public PrismaLayangLayang(double tinggiPrisma, double diagonalSatu, double diagonalDua, double sisiPendek, double sisiPanjang) {
        super(diagonalSatu, diagonalDua, sisiPendek, sisiPanjang);
        this.tinggiPrisma = tinggiPrisma;
    }
    public double hitungVolume() {
        return this.hitungLuas() * this.tinggiPrisma;
    }
    
    @Override
    public String getNama() {
        return "Prisma Layang Layang";
    }
    
}
