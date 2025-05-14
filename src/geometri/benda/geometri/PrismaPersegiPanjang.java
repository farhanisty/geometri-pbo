/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class PrismaPersegiPanjang extends PersegiPanjang{
    public double tinggiPrisma;
    
    public PrismaPersegiPanjang(double tinggiPrisma, double sisiPendek, double sisiPanjang) {
        super(sisiPendek, sisiPanjang);
        this.tinggiPrisma = tinggiPrisma;
    }
     public double hitungVolume() {
        return this.hitungLuas() * this.tinggiPrisma;
    }
    
    @Override
    public String getNama() {
        return "Prisma Persegi Panjang";
    }
}
