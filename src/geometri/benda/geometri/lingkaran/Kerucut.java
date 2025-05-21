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
public class Kerucut extends Lingkaran{
    public double tinggiKerucut;
    
    public Kerucut(double tinggiKerucut, double jariJari) {
        super(jariJari);
        this.tinggiKerucut = tinggiKerucut;
    }
    
    public double hitungVolume() {
        return this.hitungLuas() * this.tinggiKerucut;
    }
    
    @Override
    public String getNama() {
        return "Kerucut";
    }
    
}
