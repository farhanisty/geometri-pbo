/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class JajarGenjang extends BangunDatar {
    public double sisiDatar;
    public double sisiMiring;
    public double tinggi;
    
    public JajarGenjang(double sisiDatar, double sisiMiring, double tinggi) {
        this.sisiDatar = sisiDatar;
        this.sisiMiring = sisiMiring;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungLuas() {
        return this.sisiDatar * this.tinggi;
    }

    @Override
    public double hitungKeliling() {
        return this.sisiDatar * 2 + this.sisiMiring * 2;
    }

    @Override
    public String getNama() {
        return "JajarGenjang";
    }
    
}
