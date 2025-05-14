/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class LimasPersegiPanjang extends PersegiPanjang{
    public double tinggiLimas;
    
    public LimasPersegiPanjang(double tinggiLimas, double sisiPendek, double sisiPanjang) {
        super(sisiPendek, sisiPanjang);
        this.tinggiLimas = tinggiLimas;
    }
    
    public double hitungVolume() {
        return this.tinggiLimas * this.hitungLuas() / 3;
    }
    
    @Override
    public String getNama() {
        return "Limas Persegi Panjang";

    }
    
}
