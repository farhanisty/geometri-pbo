/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri.belahketupat;

/**
 *
 * @author farhannivta
 */
public class PrismaBelahKetupat extends BelahKetupat{
    public double tinggiPrisma;
    
    public PrismaBelahKetupat(double tinggiPrisma, double sisi, double diagonalSatu, double diagonalDua) {
        super(sisi, diagonalSatu, diagonalDua);
        this.tinggiPrisma = tinggiPrisma;
    }
    public double hitungVolume() {
        return this.hitungLuas() * this.tinggiPrisma;
    }
    
    @Override
    public String getNama() {
        return "Prisma Belah Ketupat";
    }
    
}
