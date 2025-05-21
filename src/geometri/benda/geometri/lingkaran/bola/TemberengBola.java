/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri.lingkaran.bola;

/**
 *
 * @author farhannivta
 */
public class TemberengBola extends Bola {
    public double tinggi;
    
    public TemberengBola(double tinggi, double jariJari) {
        super(jariJari);
        this.tinggi = tinggi;
    }
    
    public double hitungLuasPermukaanMelengkung() {
        return 2 * Math.PI * this.jariJari * this.tinggi;
    }

    public double hitungLuasBidangPotong() {
        double a = Math.sqrt(2 * this.jariJari * this.tinggi - this.tinggi * this.tinggi);
        return Math.PI * a * a;
    }
    
    @Override
    public double hitungVolume() {
        return (Math.PI * this.tinggi * this.tinggi / 3) * (3 * this.jariJari - this.tinggi);
    }
    
    @Override
    public double hitungLuas() {
        return hitungLuasPermukaanMelengkung() + hitungLuasBidangPotong();
    }
    
    @Override
    public String getNama() {
        return "Tembereng Bola";
    }
}
