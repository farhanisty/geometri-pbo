/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class PersegiPanjang extends BangunDatar {
    public double sisiPendek;
    public double sisiPanjang;
    
    public PersegiPanjang(double sisiPendek, double sisiPanjang) {
        this.sisiPendek = sisiPendek;
        this.sisiPanjang = sisiPanjang;
    }
    
    @Override
    public double hitungLuas() {
        return this.sisiPendek * this.sisiPanjang;
    }

    @Override
    public double hitungKeliling() {
        return this.sisiPendek * 2 + this.sisiPanjang * 2;
    }

    @Override
    public String getNama() {
        return "Persegi Panjang";
    }
    
}
