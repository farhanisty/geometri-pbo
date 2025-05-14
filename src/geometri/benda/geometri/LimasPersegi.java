/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class LimasPersegi extends Persegi{
    public double tinggiLimas;
    
    public LimasPersegi(double tinggiLimas, double sisi) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
    }
     public double hitungVolume() {
        return this.tinggiLimas * this.hitungLuas() / 3;
    }
    
    @Override
    public String getNama() {
        return "Limas Persegi";
    }
}
