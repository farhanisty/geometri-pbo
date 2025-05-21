/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class PrismaJajarGenjang extends JajarGenjang{
    public double tinggiPrisma;
    
    public PrismaJajarGenjang(double tinggiPrisma, double sisiDatar, double sisiMiring, double tinggi) {
        super(sisiDatar, sisiMiring, tinggi);
        this.tinggiPrisma = tinggiPrisma;
    }
    public double hitungVolume() {
        return this.hitungLuas() * this.tinggiPrisma;
    }
    
    @Override
    public String getNama() {
        return "Prisma Jajar Genjang";
    }
}
