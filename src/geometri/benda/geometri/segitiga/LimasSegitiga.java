/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri.segitiga;

import geometri.benda.geometri.segitiga.Segitiga;

/**
 *
 * @author farhannivta
 */
public class LimasSegitiga extends Segitiga {
    public double tinggiLimas;
    
    public LimasSegitiga(double tinggiLimas, double sisiSatu, double sisiDua, double sisiAlas, double tinggi) {
        super(sisiSatu, sisiDua, sisiAlas, tinggi);
        this.tinggiLimas = tinggiLimas;
    }
    
    public double hitungVolume() {
        return this.tinggiLimas * this.hitungLuas() / 3;
    }
    
    @Override
    public String getNama() {
        return "Limas Segitiga";
    }
}
