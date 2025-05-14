/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class LimasJajarGenjang extends JajarGenjang{
    public double tinggiLimas;
    
    public LimasJajarGenjang(double tinggiLimas, double sisiDatar, double sisiMiring, double tinggi) {
        super(sisiDatar, sisiMiring, tinggi);
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