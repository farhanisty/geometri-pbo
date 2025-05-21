/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri.trapesium;

import geometri.benda.geometri.trapesium.Trapesium;

/**
 *
 * @author farhannivta
 */
public class PrismaTrapesium extends Trapesium{
    public double tinggiPrisma;
    
    public PrismaTrapesium(double tinggiPrisma, double sisiAtas, double sisiAlas, double sisiMiringSatu, double sisiMiringDua, double tinggi) {
        super(sisiAtas, sisiAlas, sisiMiringSatu, sisiMiringDua, tinggi);
        this.tinggiPrisma = tinggiPrisma;
    }
    
    public double hitungVolume() {
        return this.hitungLuas() * this.tinggiPrisma;
    }
    
    @Override
    public String getNama() {
        return "Prisma Trapesium";
    }
    
}
