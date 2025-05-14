/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class PrismaSegitiga extends Segitiga {
    public double tinggiPrisma;
    
    public PrismaSegitiga(double tinggi, double sisiSatu, double sisiDua, double sisiAlas, double tinggiSegitiga) {
        super(sisiSatu,sisiDua, sisiAlas, tinggiSegitiga);
        this.tinggiPrisma = tinggi;
    }
    
    public double hitungVolume() {
        return this.hitungLuas() * this.tinggiPrisma;
    }
    
    @Override
    public String getNama() {
        return "Prisma Segitiga";
    }
}
