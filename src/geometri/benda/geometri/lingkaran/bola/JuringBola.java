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
public class JuringBola extends Bola {
    public double alpha;
    
    public JuringBola(double alphaDerajat, double jariJari) {
        super(jariJari);
        
        this.alpha = Math.toRadians(alphaDerajat);
    }
    
    @Override
     public double hitungVolume() {
        return (2 * Math.PI * Math.pow(this.jariJari, 3) / 3) * (1 - Math.cos(alpha));
    }
     
    @Override
    public double hitungLuas() {
        return hitungLuasPermukaanMelengkung() + hitungLuasBidangSegitigaKerucut();
    }
    
    @Override
    public String getNama() {
        return "Juring Bola";
    }

    public double hitungLuasPermukaanMelengkung() {
        return 2 * Lingkaran.PI * this.jariJari * this.jariJari * (1 - Math.cos(alpha));
    }

    public double hitungLuasBidangSegitigaKerucut() {
        return 2 * this.jariJari * this.jariJari * alpha;
    }
}
