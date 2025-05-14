/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class PrismaPersegi extends Persegi {
    public double tinggiPrisma;
     
    public PrismaPersegi(double tinggiPrisma, double sisi) {
        super(sisi);
        this.tinggiPrisma = tinggiPrisma;
    }
    public double hitungVolume() {
        return this.hitungLuas() * this.tinggiPrisma;
    }
    
    @Override
    public String getNama() {
        return "Prisma Persegi";
    }
}
