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
public class LimasTrapesium extends Trapesium{
    public double tinggiLimas;
    
    public LimasTrapesium(double tinggiLimas, double sisiAtas, double sisiAlas, double sisiMiringSatu, double sisiMiringDua, double tinggi) {
        super(sisiAtas, sisiAlas, sisiMiringSatu, sisiMiringDua, tinggi);
        this.tinggiLimas = tinggiLimas;
    }
    
    public double hitungVolume() {
        return this.tinggiLimas * this.hitungLuas() / 3;
    }
    
    @Override
    public String getNama() {
        return "Limas Trapesium";
    }
    
}
