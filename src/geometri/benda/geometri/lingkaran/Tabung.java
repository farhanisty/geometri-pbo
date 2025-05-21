/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri.lingkaran;

import geometri.benda.geometri.lingkaran.Lingkaran;

/**
 *
 * @author farhannivta
 */
public class Tabung extends Lingkaran{
    public double tinggiTabung;
    
    public Tabung(double tinggiTabung, double jariJari) {
        super(jariJari);
        this.tinggiTabung = tinggiTabung;
    }
    
    public double hitungVolume() {
        return this.hitungLuas() * this.tinggiTabung;
    }
    
    @Override
    public String getNama() {
        return "Tabung";
    }
    
}
