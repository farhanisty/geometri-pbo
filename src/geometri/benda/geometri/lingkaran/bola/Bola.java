/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri.lingkaran.bola;

import geometri.benda.geometri.lingkaran.Lingkaran;

/**
 *
 * @author farhannivta
 */
public class Bola extends Lingkaran {
    public Bola(double jariJari) {
        super(jariJari);
    }
    
    public double hitungVolume() {
        return Math.pow(this.jariJari, 3) * Lingkaran.PI * 4 / 3;
    }
    
    @Override
    public double hitungLuas() {
        return Math.pow(this.jariJari, 2) * Lingkaran.PI * 4;
    }
    
    @Override
    public String getNama() {
        return "Bola";
    }
}
